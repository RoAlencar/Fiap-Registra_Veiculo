package br.com.fiap.app.registra.veiculos.domain;

import br.com.fiap.app.registra.veiculos.domain.enums.StatusVeiculoEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.TipoCombustivelEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.TipoVeiculoEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Entity(name = "CORE_VEICULO")
public class Veiculo {

    @Id
    @Column(name = "ID")
    private Long id;
    @Column(name = "MARCA")
    private String marca;
    @Column(name = "MODELO")
    private String modelo;
    @Column(name = "ANO")
    private Integer ano;
    @Column(name = "COR")
    private String cor;
    @Column(name = "PRECO")
    private BigDecimal preco;
    @Column(name = "TIPO")
    private TipoVeiculoEnum tipo;
    @Column(name = "QUILOMETRAGEM")
    private Integer quilometragem;
    @Column(name = "TIPO_COMBUSTIVEL")
    private TipoCombustivelEnum tipoCombustivel;
    @Column(name = "NUMERO_PORTAS")
    private Integer numeroPortas;
    @Column(name = "PLACA")
    private String placa;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "STATUS")
    private StatusVeiculoEnum status;
    @Column(name = "DATA_CADASTRO")
    private Date dataCadastro;
    @Column(name = "DATA_ATUALIZACAO")
    private Date dataAtualizacao;
    @Column(name = "DATA_DELECAO")
    private Date dataDelecao;

}