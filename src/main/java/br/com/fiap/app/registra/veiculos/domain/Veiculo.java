package br.com.fiap.app.registra.veiculos.domain;

import br.com.fiap.app.registra.veiculos.adapter.out.jpa.veiculo.entities.VeiculoEntity;
import br.com.fiap.app.registra.veiculos.domain.enums.NumeroPortasEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.StatusVeiculoEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.TipoCombustivelEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.TipoVeiculoEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Veiculo {

    private Long id;
    private String marca;
    private String modelo;
    private Integer ano;
    private String cor;
    private BigDecimal preco;
    private TipoVeiculoEnum tipo;
    private Integer quilometragem;
    private TipoCombustivelEnum tipoCombustivel;
    private NumeroPortasEnum numeroPortas;
    private String placa;
    private String descricao;
    private StatusVeiculoEnum status;
    private Date dataCadastro;
    private Date dataAtualizacao;

    public VeiculoEntity toEntity() {
        return VeiculoEntity.builder()
                .id(this.id)
                .marca(this.marca)
                .modelo(this.modelo)
                .ano(this.ano)
                .cor(this.cor)
                .preco(this.preco)
                .tipo(this.tipo)
                .quilometragem(this.quilometragem)
                .tipoCombustivel(this.tipoCombustivel)
                .numeroPortas(this.numeroPortas)
                .placa(this.placa)
                .descricao(this.descricao)
                .status(this.status)
                .dataCadastro(this.dataCadastro)
                .dataAtualizacao(this.dataAtualizacao)
                .build();
    }

    public Veiculo(Veiculo veiculo) {
        this.id = veiculo.getId();
        this.marca = veiculo.getMarca();
        this.modelo = veiculo.getModelo();
        this.ano = veiculo.getAno();
        this.cor = veiculo.getCor();
        this.preco = veiculo.getPreco();
        this.tipo = veiculo.getTipo();
        this.quilometragem = veiculo.getQuilometragem();
        this.tipoCombustivel = veiculo.getTipoCombustivel();
        this.numeroPortas = veiculo.getNumeroPortas();
        this.placa = veiculo.getPlaca();
        this.descricao = veiculo.getDescricao();
        this.status = veiculo.getStatus();
        this.dataCadastro = veiculo.getDataCadastro();
    }

}