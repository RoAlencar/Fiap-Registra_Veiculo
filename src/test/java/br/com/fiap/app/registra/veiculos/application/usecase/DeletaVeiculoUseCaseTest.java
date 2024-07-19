package br.com.fiap.app.registra.veiculos.application.usecase;

import br.com.fiap.app.registra.veiculos.application.port.VeiculoRepositoryPort;
import br.com.fiap.app.registra.veiculos.domain.Veiculo;
import br.com.fiap.app.registra.veiculos.utils.VeiculoTestUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.webjars.NotFoundException;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

public class DeletaVeiculoUseCaseTest {

    @Mock
    private VeiculoRepositoryPort repositoryPort;

    @InjectMocks
    private DeletaVeiculoUseCase deletaVeiculoUseCase;

    @BeforeEach
    void setUp(){
        openMocks(this);
    }

    @Test
    void deletaVeiculoComSucesso(){
        Long idVeiculo = 1L;
        Veiculo veiculo = new Veiculo(VeiculoTestUtils.gerarVeiculo());
        when(repositoryPort.findById(idVeiculo)).thenReturn(Optional.of(veiculo));

        assertDoesNotThrow(() -> deletaVeiculoUseCase.deleteVeiculo(idVeiculo));

        verify(repositoryPort).deleteById(idVeiculo);
    }

    @Test
    void deletaVeiculoComErro(){
        Long idVeiculo = 999L;
        when(repositoryPort.findById(idVeiculo)).thenReturn(Optional.empty());

        assertThrows(NotFoundException.class, () -> deletaVeiculoUseCase.deleteVeiculo(idVeiculo));
    }
}
