package br.com.fiap.app.registra.veiculos.domain;

import br.com.fiap.app.registra.veiculos.domain.enums.NumeroPortasEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.StatusVeiculoEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.TipoCombustivelEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.TipoVeiculoEnum;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VeiculoTest {

    @Test
    void setVeiculo() {
        Veiculo veiculo = new Veiculo();
        veiculo.setId(1L);
        veiculo.setMarca("Marca");
        veiculo.setModelo("Modelo");
        veiculo.setAno(2024);
        veiculo.setCor("Cor");
        veiculo.setTipo(TipoVeiculoEnum.FURGAO);
        veiculo.setQuilometragem(0);
        veiculo.setTipoCombustivel(TipoCombustivelEnum.ELETRICO);
        veiculo.setNumeroPortas(NumeroPortasEnum.QUATRO);
        veiculo.setPlaca("Placa");
        veiculo.setPreco(BigDecimal.valueOf(1000));
        veiculo.setDescricao("Descricao");
        veiculo.setStatus(StatusVeiculoEnum.DISPONIVEL);

        assertThat(veiculo.getId()).isEqualTo(1L);
        assertThat(veiculo.getMarca()).isEqualTo("Marca");
        assertThat(veiculo.getModelo()).isEqualTo("Modelo");
        assertThat(veiculo.getAno()).isEqualTo(2024);
        assertThat(veiculo.getCor()).isEqualTo("Cor");
        assertThat(veiculo.getTipo()).isEqualTo(TipoVeiculoEnum.FURGAO);
        assertThat(veiculo.getQuilometragem()).isEqualTo(0);
        assertThat(veiculo.getTipoCombustivel()).isEqualTo(TipoCombustivelEnum.ELETRICO);
        assertThat(veiculo.getNumeroPortas()).isEqualTo(NumeroPortasEnum.QUATRO);
        assertThat(veiculo.getPlaca()).isEqualTo("Placa");
        assertThat(veiculo.getPreco()).isEqualTo(BigDecimal.valueOf(1000));
        assertThat(veiculo.getDescricao()).isEqualTo("Descricao");
        assertThat(veiculo.getStatus()).isEqualTo(StatusVeiculoEnum.DISPONIVEL);
    }
}
