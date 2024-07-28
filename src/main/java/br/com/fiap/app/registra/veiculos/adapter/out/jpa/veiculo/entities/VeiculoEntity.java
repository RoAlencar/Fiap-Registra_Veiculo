package br.com.fiap.app.registra.veiculos.adapter.out.jpa.veiculo.entities;

import br.com.fiap.app.registra.veiculos.domain.Veiculo;
import br.com.fiap.app.registra.veiculos.domain.enums.NumeroPortasEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.StatusVeiculoEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.TipoCombustivelEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.TipoVeiculoEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
public class VeiculoEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO")
    private TipoVeiculoEnum tipo;

    @Column(name = "QUILOMETRAGEM")
    private Integer quilometragem;

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_COMBUSTIVEL")
    private TipoCombustivelEnum tipoCombustivel;

    @Enumerated(EnumType.STRING)
    @Column(name = "NUMERO_PORTAS")
    private NumeroPortasEnum numeroPortas;

    @Column(name = "PLACA")
    private String placa;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS")
    private StatusVeiculoEnum status;

    @Column(name = "DATA_CADASTRO")
    private Date dataCadastro;

    @Column(name = "DATA_ATUALIZACAO")
    private Date dataAtualizacao;

    public Veiculo toDomain(){
        return Veiculo.builder()
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
}
