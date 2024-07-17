package br.com.fiap.app.registra.veiculos.application.dto.request;

import br.com.fiap.app.registra.veiculos.domain.enums.NumeroPortasEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.TipoCombustivelEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.TipoVeiculoEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CriarVeiculoDto {

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


    public CriarVeiculoDto(CriarVeiculoDto criarVeiculoDto) {
        this.marca = criarVeiculoDto.getMarca();
        this.modelo = criarVeiculoDto.getModelo();
        this.ano = criarVeiculoDto.getAno();
        this.cor = criarVeiculoDto.getCor();
        this.preco = criarVeiculoDto.getPreco();
        this.tipo = criarVeiculoDto.getTipo();
        this.quilometragem = criarVeiculoDto.getQuilometragem();
        this.tipoCombustivel = criarVeiculoDto.getTipoCombustivel();
        this.numeroPortas = criarVeiculoDto.getNumeroPortas();
        this.placa = criarVeiculoDto.getPlaca();
        this.descricao = criarVeiculoDto.getDescricao();
    }
}
