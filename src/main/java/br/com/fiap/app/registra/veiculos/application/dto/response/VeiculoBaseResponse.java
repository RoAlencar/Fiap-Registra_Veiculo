package br.com.fiap.app.registra.veiculos.application.dto.response;

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
public class VeiculoBaseResponse {

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

    public VeiculoBaseResponse(VeiculoBaseResponse response){
        this.id = response.getId();
        this.marca = response.getMarca();
        this.modelo = response.getModelo();
        this.ano = response.getAno();
        this.cor = response.getCor();
        this.preco = response.getPreco();
        this.tipo = response.getTipo();
        this.quilometragem = response.getQuilometragem();
        this.tipoCombustivel = response.getTipoCombustivel();
        this.numeroPortas = response.getNumeroPortas();
        this.placa = response.getPlaca();
        this.descricao = response.getDescricao();
        this.status = response.getStatus();
        this.dataCadastro = response.getDataCadastro();
    }
}
