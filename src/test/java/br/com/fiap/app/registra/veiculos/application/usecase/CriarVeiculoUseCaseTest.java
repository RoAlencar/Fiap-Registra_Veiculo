package br.com.fiap.app.registra.veiculos.application.usecase;

import br.com.fiap.app.registra.veiculos.application.dto.request.CriarVeiculoDto;
import br.com.fiap.app.registra.veiculos.application.dto.response.CriarVeiculoResponse;
import br.com.fiap.app.registra.veiculos.application.port.VeiculoRepositoryPort;
import br.com.fiap.app.registra.veiculos.domain.Veiculo;
import br.com.fiap.app.registra.veiculos.domain.enums.NumeroPortasEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.StatusVeiculoEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.TipoCombustivelEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.TipoVeiculoEnum;
import br.com.fiap.app.registra.veiculos.utils.VeiculoTestUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.modelmapper.ModelMapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

public class CriarVeiculoUseCaseTest {

    @Mock
    private VeiculoRepositoryPort repositoryPort;

    @Mock
    private ModelMapper modelMapper;

    @InjectMocks
    private CriarVeiculoUseCase useCase;

    @BeforeEach
    void setUp() {
        openMocks(this);
    }

    @Test
    void criarVeiculoUseCaseComSucesso() {
        CriarVeiculoDto dto = new CriarVeiculoDto(VeiculoTestUtils.gerarCriarVeiculoDto());
        Veiculo veiculo = new Veiculo(VeiculoTestUtils.gerarVeiculo());
        CriarVeiculoResponse respostaExperada = new CriarVeiculoResponse(VeiculoTestUtils.gerarCriarVeiculoResponse());

        when(repositoryPort.save(any(Veiculo.class))).thenReturn(veiculo);
        when(modelMapper.map(any(Veiculo.class), eq(CriarVeiculoResponse.class))).thenReturn(respostaExperada);

        CriarVeiculoResponse respostaAtual = useCase.criarVeiculo(dto);

        assertEquals(respostaExperada, respostaAtual);
        assertEquals(StatusVeiculoEnum.DISPONIVEL, respostaAtual.getStatus());
        assertEquals(NumeroPortasEnum.QUATRO, respostaAtual.getNumeroPortas());
        assertEquals(TipoCombustivelEnum.GASOLINA, respostaAtual.getTipoCombustivel());
        assertEquals(TipoVeiculoEnum.SUV, respostaAtual.getTipo());
        verify(repositoryPort).save(any(Veiculo.class));
        verify(modelMapper).map(any(Veiculo.class), eq(CriarVeiculoResponse.class));
    }
}
