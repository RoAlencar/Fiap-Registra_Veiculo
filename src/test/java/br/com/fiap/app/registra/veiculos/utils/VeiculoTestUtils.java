package br.com.fiap.app.registra.veiculos.utils;

import br.com.fiap.app.registra.veiculos.adapter.out.jpa.veiculo.entities.VeiculoEntity;
import br.com.fiap.app.registra.veiculos.application.dto.request.AtualizaVeiculoDto;
import br.com.fiap.app.registra.veiculos.application.dto.request.CriarVeiculoDto;
import br.com.fiap.app.registra.veiculos.application.dto.response.AtualizaVeiculoResponse;
import br.com.fiap.app.registra.veiculos.application.dto.response.BuscaVeiculoResponse;
import br.com.fiap.app.registra.veiculos.application.dto.response.CriarVeiculoResponse;
import br.com.fiap.app.registra.veiculos.application.dto.response.VeiculoBaseResponse;
import br.com.fiap.app.registra.veiculos.domain.Veiculo;
import br.com.fiap.app.registra.veiculos.domain.enums.NumeroPortasEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.StatusVeiculoEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.TipoCombustivelEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.TipoVeiculoEnum;

import java.math.BigDecimal;
import java.util.Date;

public class VeiculoTestUtils {

    private VeiculoTestUtils() {}

    public static CriarVeiculoDto gerarCriarVeiculoDto() {
        return CriarVeiculoDto.builder()
                .marca("Ferrari")
                .modelo("Purosangue")
                .ano(2024)
                .cor("Vermelho")
                .preco(BigDecimal.valueOf(2500000.00))
                .tipo(TipoVeiculoEnum.SUV)
                .quilometragem(0)
                .tipoCombustivel(TipoCombustivelEnum.GASOLINA)
                .numeroPortas(NumeroPortasEnum.QUATRO)
                .placa("HTG7968")
                .descricao("A Ferrari Purosangue é um SUV esportivo de luxo com design arrojado, motor V12 potente, e tecnologia avançada, oferecendo desempenho excepcional e conforto premium.")
                .build();
    }

    public static VeiculoEntity gerarVeiculoEntity() {
        return VeiculoEntity.builder()
                .id(1L)
                .marca("Marca")
                .modelo("Modelo")
                .ano(2024)
                .cor("Cor")
                .tipo(TipoVeiculoEnum.FURGAO)
                .quilometragem(0)
                .tipoCombustivel(TipoCombustivelEnum.ELETRICO)
                .numeroPortas(NumeroPortasEnum.QUATRO)
                .preco(BigDecimal.valueOf(1000))
                .placa("Placa")
                .descricao("Descricao")
                .status(StatusVeiculoEnum.DISPONIVEL)
                .build();
    }

    public static CriarVeiculoResponse gerarCriarVeiculoResponse() {
        return new CriarVeiculoResponse(VeiculoBaseResponse.builder()
                .id(1L)
                .marca("Ferrari")
                .modelo("Purosangue")
                .ano(2024)
                .cor("Vermelho")
                .preco(BigDecimal.valueOf(2500000.00))
                .quilometragem(0)
                .tipoCombustivel(TipoCombustivelEnum.GASOLINA)
                .numeroPortas(NumeroPortasEnum.QUATRO)
                .tipo(TipoVeiculoEnum.SUV)
                .placa("HTG7968")
                .descricao("A Ferrari Purosangue é um SUV esportivo de luxo com design arrojado, motor V12 potente, e tecnologia avançada, oferecendo desempenho excepcional e conforto premium.")
                .status(StatusVeiculoEnum.DISPONIVEL)
                .dataCadastro(new Date())
                .build());
    }

    public static Veiculo gerarVeiculo(){
        return Veiculo.builder()
                .id(1L)
                .marca("Ferrari")
                .modelo("Purosangue")
                .ano(2024)
                .cor("Vermelho")
                .preco(BigDecimal.valueOf(2500000.00))
                .quilometragem(0)
                .tipoCombustivel(TipoCombustivelEnum.GASOLINA)
                .numeroPortas(NumeroPortasEnum.QUATRO)
                .tipo(TipoVeiculoEnum.SUV)
                .placa("HTG7968")
                .descricao("A Ferrari Purosangue é um SUV esportivo de luxo com design arrojado, motor V12 potente, e tecnologia avançada, oferecendo desempenho excepcional e conforto premium.")
                .status(StatusVeiculoEnum.DISPONIVEL)
                .dataCadastro(new Date())
                .dataAtualizacao(new Date())
                .build();
    }

    public static AtualizaVeiculoResponse gerarAtualizaVeiculoResponse(){
        return new AtualizaVeiculoResponse(VeiculoBaseResponse.builder()
                .id(1L)
                .marca("Ferrari")
                .modelo("Purosangue")
                .ano(2024)
                .cor("Vermelho")
                .preco(BigDecimal.valueOf(2500000.00))
                .quilometragem(0)
                .tipoCombustivel(TipoCombustivelEnum.GASOLINA)
                .numeroPortas(NumeroPortasEnum.QUATRO)
                .placa("HTG7968")
                .descricao("A Ferrari Purosangue é um SUV esportivo de luxo com design arrojado, motor V12 potente, e tecnologia avançada, oferecendo desempenho excepcional e conforto premium.")
                .status(StatusVeiculoEnum.DISPONIVEL)
                .dataCadastro(new Date())
                .build());
    }

    public static Veiculo gerarAtualizaVeiculo(){
        return Veiculo.builder()
                .id(1L)
                .marca("Ferrari")
                .modelo("Purosangue")
                .ano(2024)
                .cor("Vermelho")
                .preco(BigDecimal.valueOf(2500000.00))
                .quilometragem(0)
                .tipoCombustivel(TipoCombustivelEnum.GASOLINA)
                .numeroPortas(NumeroPortasEnum.QUATRO)
                .placa("HTG7968")
                .descricao("A Ferrari Purosangue é um SUV esportivo de luxo com design arrojado, motor V12 potente, e tecnologia avançada, oferecendo desempenho excepcional e conforto premium.")
                .status(StatusVeiculoEnum.DISPONIVEL)
                .dataCadastro(new Date())
                .dataAtualizacao(new Date())
                .build();
    }

    public static AtualizaVeiculoDto gerarAtualizaVeiculoDto(){
        return AtualizaVeiculoDto.builder()
                .id(1L)
                .marca("Ferrari")
                .modelo("Purosangue")
                .ano(2024)
                .cor("Vermelho")
                .preco(BigDecimal.valueOf(2500000.00))
                .quilometragem(0)
                .tipoCombustivel(TipoCombustivelEnum.GASOLINA)
                .numeroPortas(NumeroPortasEnum.QUATRO)
                .placa("HTG7968")
                .descricao("A Ferrari Purosangue é um SUV esportivo de luxo com design arrojado, motor V12 potente, e tecnologia avançada, oferecendo desempenho excepcional e conforto premium.")
                .status(StatusVeiculoEnum.DISPONIVEL)
                .dataAtualizacao(new Date())
                .build();
    }

    public static BuscaVeiculoResponse gerarBuscaVeiculoResponse(){
        return new BuscaVeiculoResponse(VeiculoBaseResponse.builder()
                .id(1L)
                .marca("Ferrari")
                .modelo("Purosangue")
                .ano(2024)
                .cor("Vermelho")
                .preco(BigDecimal.valueOf(2500000.00))
                .quilometragem(0)
                .tipoCombustivel(TipoCombustivelEnum.GASOLINA)
                .numeroPortas(NumeroPortasEnum.QUATRO)
                .placa("HTG7968")
                .descricao("A Ferrari Purosangue é um SUV esportivo de luxo com design arrojado, motor V12 potente, e tecnologia avançada, oferecendo desempenho excepcional e conforto premium.")
                .status(StatusVeiculoEnum.DISPONIVEL)
                .dataCadastro(new Date())
                .build());
    }
}
