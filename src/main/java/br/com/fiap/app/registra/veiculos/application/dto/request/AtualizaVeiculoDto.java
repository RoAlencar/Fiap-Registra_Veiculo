package br.com.fiap.app.registra.veiculos.application.dto.request;

import br.com.fiap.app.registra.veiculos.domain.enums.NumeroPortasEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.StatusVeiculoEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.TipoCombustivelEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.TipoVeiculoEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
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
public class AtualizaVeiculoDto {

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
    private Date dataAtualizacao;

    public AtualizaVeiculoDto(AtualizaVeiculoDto atualizaVeiculoDto){
        this.id = atualizaVeiculoDto.getId();
        this.marca = atualizaVeiculoDto.getMarca();
        this.modelo = atualizaVeiculoDto.getModelo();
        this.ano = atualizaVeiculoDto.getAno();
        this.cor = atualizaVeiculoDto.getCor();
        this.preco = atualizaVeiculoDto.getPreco();
        this.tipo = atualizaVeiculoDto.getTipo();
        this.quilometragem = atualizaVeiculoDto.getQuilometragem();
        this.tipoCombustivel = atualizaVeiculoDto.getTipoCombustivel();
        this.numeroPortas = atualizaVeiculoDto.getNumeroPortas();
        this.placa = atualizaVeiculoDto.getPlaca();
        this.descricao = atualizaVeiculoDto.getDescricao();
        this.status = atualizaVeiculoDto.getStatus();
        this.dataAtualizacao = new Date();
    }
}
