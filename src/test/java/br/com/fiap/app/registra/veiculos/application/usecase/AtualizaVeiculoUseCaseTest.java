package br.com.fiap.app.registra.veiculos.application.usecase;

import br.com.fiap.app.registra.veiculos.application.dto.request.AtualizaVeiculoDto;
import br.com.fiap.app.registra.veiculos.application.dto.response.AtualizaVeiculoResponse;
import br.com.fiap.app.registra.veiculos.application.port.VeiculoRepositoryPort;
import br.com.fiap.app.registra.veiculos.domain.Veiculo;
import br.com.fiap.app.registra.veiculos.domain.enums.NumeroPortasEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.StatusVeiculoEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.TipoCombustivelEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.TipoVeiculoEnum;
import br.com.fiap.app.registra.veiculos.infrastructure.exception.custom.ModificaVeiculoException;
import br.com.fiap.app.registra.veiculos.utils.VeiculoTestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.modelmapper.ModelMapper;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

public class AtualizaVeiculoUseCaseTest {

    @Mock
    private VeiculoRepositoryPort veiculoRepositoryPort;

    @Mock
    private ModelMapper modelMapper;

    @InjectMocks
    private AtualizaVeiculoUseCase atualizaVeiculo;

    @BeforeEach
    void SetUp(){
        openMocks(this);
    }

    @Test
    void AtualizaVeiculoComSucesso() throws ModificaVeiculoException {
        AtualizaVeiculoDto dto = new AtualizaVeiculoDto(VeiculoTestUtils.gerarAtualizaVeiculoDto());
        Veiculo veiculoExistente = new Veiculo(VeiculoTestUtils.gerarVeiculo());
        Veiculo veiculoAtualizado = new Veiculo(VeiculoTestUtils.gerarAtualizaVeiculo());
        AtualizaVeiculoResponse response = new AtualizaVeiculoResponse(VeiculoTestUtils.gerarAtualizaVeiculoResponse());

        when(veiculoRepositoryPort.findById(dto.getId())).thenReturn(Optional.of(veiculoExistente));
        when(veiculoRepositoryPort.save(any(Veiculo.class))).thenReturn(veiculoAtualizado);
        when(modelMapper.map(any(Veiculo.class), eq(AtualizaVeiculoResponse.class))).thenReturn(response);

        AtualizaVeiculoResponse responseAtual = atualizaVeiculo.atualizaVeiculo(dto);

        Assertions.assertEquals(response, responseAtual);
        verify(veiculoRepositoryPort).findById(dto.getId());
        verify(veiculoRepositoryPort).save(any(Veiculo.class));
        verify(modelMapper).map(any(Veiculo.class), eq(AtualizaVeiculoResponse.class));
    }


    @Test
    void ThrowsModificaVeiculoExceptionQuandoVeiculoNãoExiste(){
        AtualizaVeiculoDto dto = new AtualizaVeiculoDto(VeiculoTestUtils.gerarAtualizaVeiculoDto());

        when(veiculoRepositoryPort.findById(dto.getId())).thenReturn(Optional.empty());

        Assertions.assertThrows(ModificaVeiculoException.class, () -> atualizaVeiculo.atualizaVeiculo(dto));
        verify(veiculoRepositoryPort).findById(dto.getId());
    }

    @Test
    void setAtualizaVeiculo(){
        AtualizaVeiculoDto dto = new AtualizaVeiculoDto();
        dto.setId(1L);
        dto.setMarca("Ford");
        dto.setModelo("Mustang");
        dto.setAno(1964);
        dto.setCor("Preto");
        dto.setTipo(TipoVeiculoEnum.ESPORTIVO);
        dto.setQuilometragem(10000);
        dto.setTipoCombustivel(TipoCombustivelEnum.GASOLINA);
        dto.setNumeroPortas(NumeroPortasEnum.DUAS);
        dto.setPlaca("BMQ6168");
        dto.setDescricao("Carro Incrivel");
        dto.setStatus(StatusVeiculoEnum.DISPONIVEL);
        //dto.setDataAtualizacao(new Date());

        assertThat(dto.getId()).isEqualTo(1L);
        assertThat(dto.getMarca()).isEqualTo("Ford");
        assertThat(dto.getModelo()).isEqualTo("Mustang");
        assertThat(dto.getAno()).isEqualTo(1964);
        assertThat(dto.getCor()).isEqualTo("Preto");
        assertThat(dto.getTipo()).isEqualTo(TipoVeiculoEnum.ESPORTIVO);
        assertThat(dto.getQuilometragem()).isEqualTo(10000);
        assertThat(dto.getTipoCombustivel()).isEqualTo(TipoCombustivelEnum.GASOLINA);
        assertThat(dto.getNumeroPortas()).isEqualTo(NumeroPortasEnum.DUAS);
        assertThat(dto.getPlaca()).isEqualTo("BMQ6168");
        assertThat(dto.getDescricao()).isEqualTo("Carro Incrivel");
        assertThat(dto.getStatus()).isEqualTo(StatusVeiculoEnum.DISPONIVEL);
        //assertThat(dto.getDataAtualizacao()).isEqualTo(new Date());
    }
}
