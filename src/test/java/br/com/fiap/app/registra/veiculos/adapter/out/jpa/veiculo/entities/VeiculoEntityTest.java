package br.com.fiap.app.registra.veiculos.adapter.out.jpa.veiculo.entities;

import br.com.fiap.app.registra.veiculos.domain.enums.NumeroPortasEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.StatusVeiculoEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.TipoCombustivelEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.TipoVeiculoEnum;
import br.com.fiap.app.registra.veiculos.utils.VeiculoTestUtils;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VeiculoEntityTest {

    @Test
    void setVeiculoEntity() {
        VeiculoEntity veiculo = new VeiculoEntity();
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

    @Test
    void setVeiculoEntityBuilder() {

        Long id = 1L;
        String marca = "Marca";
        String modelo = "Modelo";
        Integer ano = 2024;
        String cor = "Cor";
        BigDecimal preco = BigDecimal.valueOf(1000);
        TipoVeiculoEnum tipo = TipoVeiculoEnum.FURGAO;
        Integer quilometragem = 0;
        TipoCombustivelEnum tipoCombustivel = TipoCombustivelEnum.ELETRICO;
        NumeroPortasEnum numeroPortas = NumeroPortasEnum.QUATRO;
        String placa = "Placa";
        String descricao = "Descricao";
        StatusVeiculoEnum status = StatusVeiculoEnum.DISPONIVEL;

        VeiculoEntity veiculo = VeiculoTestUtils.gerarVeiculoEntity();

        assertThat(veiculo.getId()).isEqualTo(id);
        assertThat(veiculo.getMarca()).isEqualTo(marca);
        assertThat(veiculo.getModelo()).isEqualTo(modelo);
        assertThat(veiculo.getAno()).isEqualTo(ano);
        assertThat(veiculo.getCor()).isEqualTo(cor);
        assertThat(veiculo.getPreco()).isEqualTo(preco);
        assertThat(veiculo.getTipo()).isEqualTo(tipo);
        assertThat(veiculo.getQuilometragem()).isEqualTo(quilometragem);
        assertThat(veiculo.getTipoCombustivel()).isEqualTo(tipoCombustivel);
        assertThat(veiculo.getNumeroPortas()).isEqualTo(numeroPortas);
        assertThat(veiculo.getPlaca()).isEqualTo(placa);
        assertThat(veiculo.getDescricao()).isEqualTo(descricao);
        assertThat(veiculo.getStatus()).isEqualTo(status);


    }
}
