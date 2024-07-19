package br.com.fiap.app.registra.veiculos.application.usecase;

import br.com.fiap.app.registra.veiculos.application.dto.response.BuscaVeiculoResponse;
import br.com.fiap.app.registra.veiculos.application.port.VeiculoRepositoryPort;
import br.com.fiap.app.registra.veiculos.domain.Veiculo;
import br.com.fiap.app.registra.veiculos.infrastructure.exception.custom.VeiculoNaoEncontradoException;
import br.com.fiap.app.registra.veiculos.utils.VeiculoTestUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.modelmapper.ModelMapper;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

public class BuscaVeiculoUseCaseTest {

    @Mock
    private VeiculoRepositoryPort veiculoRepositoryPort;

    @Mock
    private ModelMapper modelMapper;

    @InjectMocks
    private BuscaVeiculoUseCase buscaVeiculo;

    @BeforeEach
    void setUp(){
        openMocks(this);
    }

    @Test
    void buscaVeiculoComSucesso(){
        Veiculo veiculo = VeiculoTestUtils.gerarVeiculo();
        List<Veiculo> veiculos = Arrays.asList(veiculo);
        BuscaVeiculoResponse response = VeiculoTestUtils.gerarBuscaVeiculoResponse();

        when(veiculoRepositoryPort.findAll()).thenReturn(veiculos);
        when(modelMapper.map(veiculo, BuscaVeiculoResponse.class)).thenReturn(response);

        List<BuscaVeiculoResponse> responses = buscaVeiculo.buscaTodosVeiculos();

        assertEquals(1, responses.size());
        verify(veiculoRepositoryPort).findAll();
        verify(modelMapper, times(1)).map(any(Veiculo.class),eq(BuscaVeiculoResponse.class));
    }

    @Test
    void buscaVeiculoSemRetorno(){
        when(veiculoRepositoryPort.findAll()).thenReturn(Arrays.asList());

        List<BuscaVeiculoResponse> responses = buscaVeiculo.buscaTodosVeiculos();

        assertEquals(0, responses.size());
        verify(veiculoRepositoryPort).findAll();
    }

    @Test
    void buscaVeiculoPorIdComSucesso() throws VeiculoNaoEncontradoException {
        Long veiculoId = 1L;
        Veiculo veiculo = VeiculoTestUtils.gerarVeiculo();
        BuscaVeiculoResponse respostaExperada = VeiculoTestUtils.gerarBuscaVeiculoResponse();

        when(veiculoRepositoryPort.findById(veiculoId)).thenReturn(Optional.of(veiculo));
        when(modelMapper.map(veiculo, BuscaVeiculoResponse.class)).thenReturn(respostaExperada);

        BuscaVeiculoResponse respostaAtual = buscaVeiculo.buscaVeiculoPorId(veiculoId);

        assertEquals(respostaExperada,respostaAtual);
        verify(veiculoRepositoryPort).findById(veiculoId);
        verify(modelMapper).map(veiculo, BuscaVeiculoResponse.class);
    }

    @Test
    void buscaVeiculoPorIdVeiculoNaoEncontradoException(){
        Long idInvalido = 999L;
        when(veiculoRepositoryPort.findById(idInvalido)).thenReturn(Optional.empty());

        assertThrows(VeiculoNaoEncontradoException.class,() -> buscaVeiculo.buscaVeiculoPorId(idInvalido));
    }
}
