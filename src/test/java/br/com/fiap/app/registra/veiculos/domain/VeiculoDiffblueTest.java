package br.com.fiap.app.registra.veiculos.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import br.com.fiap.app.registra.veiculos.domain.enums.StatusVeiculoEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.TipoCombustivelEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.TipoVeiculoEnum;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

import org.junit.Test;

public class VeiculoDiffblueTest {
    /**
     * Methods under test:
     * <ul>
     *   <li>{@link Veiculo#Veiculo()}
     *   <li>{@link Veiculo#setAno(Integer)}
     *   <li>{@link Veiculo#setCor(String)}
     *   <li>{@link Veiculo#setDataAtualizacao(Date)}
     *   <li>{@link Veiculo#setDataCadastro(Date)}
     *   <li>{@link Veiculo#setDataDelecao(Date)}
     *   <li>{@link Veiculo#setDescricao(String)}
     *   <li>{@link Veiculo#setId(Long)}
     *   <li>{@link Veiculo#setMarca(String)}
     *   <li>{@link Veiculo#setModelo(String)}
     *   <li>{@link Veiculo#setNumeroPortas(Integer)}
     *   <li>{@link Veiculo#setPlaca(String)}
     *   <li>{@link Veiculo#setPreco(BigDecimal)}
     *   <li>{@link Veiculo#setQuilometragem(Integer)}
     *   <li>{@link Veiculo#setStatus(StatusVeiculoEnum)}
     *   <li>{@link Veiculo#setTipo(TipoVeiculoEnum)}
     *   <li>{@link Veiculo#setTipoCombustivel(TipoCombustivelEnum)}
     *   <li>{@link Veiculo#getAno()}
     *   <li>{@link Veiculo#getCor()}
     *   <li>{@link Veiculo#getDataAtualizacao()}
     *   <li>{@link Veiculo#getDataCadastro()}
     *   <li>{@link Veiculo#getDataDelecao()}
     *   <li>{@link Veiculo#getDescricao()}
     *   <li>{@link Veiculo#getId()}
     *   <li>{@link Veiculo#getMarca()}
     *   <li>{@link Veiculo#getModelo()}
     *   <li>{@link Veiculo#getNumeroPortas()}
     *   <li>{@link Veiculo#getPlaca()}
     *   <li>{@link Veiculo#getPreco()}
     *   <li>{@link Veiculo#getQuilometragem()}
     *   <li>{@link Veiculo#getStatus()}
     *   <li>{@link Veiculo#getTipo()}
     *   <li>{@link Veiculo#getTipoCombustivel()}
     * </ul>
     */
    @Test
    public void testGettersAndSetters() {
        // Arrange and Act
        Veiculo actualVeiculo = new Veiculo();
        actualVeiculo.setAno(1);
        actualVeiculo.setCor("Cor");
        Date dataAtualizacao = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualVeiculo.setDataAtualizacao(dataAtualizacao);
        Date dataCadastro = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualVeiculo.setDataCadastro(dataCadastro);
        Date dataDelecao = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualVeiculo.setDataDelecao(dataDelecao);
        actualVeiculo.setDescricao("Descricao");
        actualVeiculo.setId(1L);
        actualVeiculo.setMarca("Marca");
        actualVeiculo.setModelo("Modelo");
        actualVeiculo.setNumeroPortas(10);
        actualVeiculo.setPlaca("Placa");
        BigDecimal preco = new BigDecimal("2.3");
        actualVeiculo.setPreco(preco);
        actualVeiculo.setQuilometragem(1);
        actualVeiculo.setStatus(StatusVeiculoEnum.VENDIDO);
        actualVeiculo.setTipo(TipoVeiculoEnum.HATCH);
        actualVeiculo.setTipoCombustivel(TipoCombustivelEnum.ETANOL);
        Integer actualAno = actualVeiculo.getAno();
        String actualCor = actualVeiculo.getCor();
        Date actualDataAtualizacao = actualVeiculo.getDataAtualizacao();
        Date actualDataCadastro = actualVeiculo.getDataCadastro();
        Date actualDataDelecao = actualVeiculo.getDataDelecao();
        String actualDescricao = actualVeiculo.getDescricao();
        Long actualId = actualVeiculo.getId();
        String actualMarca = actualVeiculo.getMarca();
        String actualModelo = actualVeiculo.getModelo();
        Integer actualNumeroPortas = actualVeiculo.getNumeroPortas();
        String actualPlaca = actualVeiculo.getPlaca();
        BigDecimal actualPreco = actualVeiculo.getPreco();
        Integer actualQuilometragem = actualVeiculo.getQuilometragem();
        StatusVeiculoEnum actualStatus = actualVeiculo.getStatus();
        TipoVeiculoEnum actualTipo = actualVeiculo.getTipo();
        TipoCombustivelEnum actualTipoCombustivel = actualVeiculo.getTipoCombustivel();

        // Assert that nothing has changed
        assertEquals("Cor", actualCor);
        assertEquals("Descricao", actualDescricao);
        assertEquals("Marca", actualMarca);
        assertEquals("Modelo", actualModelo);
        assertEquals("Placa", actualPlaca);
        assertEquals(1, actualAno.intValue());
        assertEquals(1, actualQuilometragem.intValue());
        assertEquals(10, actualNumeroPortas.intValue());
        assertEquals(1L, actualId.longValue());
        assertEquals(StatusVeiculoEnum.VENDIDO, actualStatus);
        assertEquals(TipoCombustivelEnum.ETANOL, actualTipoCombustivel);
        assertEquals(TipoVeiculoEnum.HATCH, actualTipo);
        assertEquals(new BigDecimal("2.3"), actualPreco);
        assertSame(preco, actualPreco);
        assertSame(dataAtualizacao, actualDataAtualizacao);
        assertSame(dataCadastro, actualDataCadastro);
        assertSame(dataDelecao, actualDataDelecao);
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>
     * {@link Veiculo#Veiculo(Long, String, String, Integer, String, BigDecimal, TipoVeiculoEnum, Integer, TipoCombustivelEnum, Integer, String, String, StatusVeiculoEnum, Date, Date, Date)}
     *   <li>{@link Veiculo#setAno(Integer)}
     *   <li>{@link Veiculo#setCor(String)}
     *   <li>{@link Veiculo#setDataAtualizacao(Date)}
     *   <li>{@link Veiculo#setDataCadastro(Date)}
     *   <li>{@link Veiculo#setDataDelecao(Date)}
     *   <li>{@link Veiculo#setDescricao(String)}
     *   <li>{@link Veiculo#setId(Long)}
     *   <li>{@link Veiculo#setMarca(String)}
     *   <li>{@link Veiculo#setModelo(String)}
     *   <li>{@link Veiculo#setNumeroPortas(Integer)}
     *   <li>{@link Veiculo#setPlaca(String)}
     *   <li>{@link Veiculo#setPreco(BigDecimal)}
     *   <li>{@link Veiculo#setQuilometragem(Integer)}
     *   <li>{@link Veiculo#setStatus(StatusVeiculoEnum)}
     *   <li>{@link Veiculo#setTipo(TipoVeiculoEnum)}
     *   <li>{@link Veiculo#setTipoCombustivel(TipoCombustivelEnum)}
     *   <li>{@link Veiculo#getAno()}
     *   <li>{@link Veiculo#getCor()}
     *   <li>{@link Veiculo#getDataAtualizacao()}
     *   <li>{@link Veiculo#getDataCadastro()}
     *   <li>{@link Veiculo#getDataDelecao()}
     *   <li>{@link Veiculo#getDescricao()}
     *   <li>{@link Veiculo#getId()}
     *   <li>{@link Veiculo#getMarca()}
     *   <li>{@link Veiculo#getModelo()}
     *   <li>{@link Veiculo#getNumeroPortas()}
     *   <li>{@link Veiculo#getPlaca()}
     *   <li>{@link Veiculo#getPreco()}
     *   <li>{@link Veiculo#getQuilometragem()}
     *   <li>{@link Veiculo#getStatus()}
     *   <li>{@link Veiculo#getTipo()}
     *   <li>{@link Veiculo#getTipoCombustivel()}
     * </ul>
     */
    @Test
    public void testGettersAndSetters2() {
        // Arrange
        BigDecimal preco = new BigDecimal("2.3");
        Date dataCadastro = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        Date dataAtualizacao = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());

        // Act
        Veiculo actualVeiculo = new Veiculo(1L, "Marca", "Modelo", 1, "Cor", preco, TipoVeiculoEnum.HATCH, 1,
                TipoCombustivelEnum.ETANOL, 10, "Placa", "Descricao", StatusVeiculoEnum.VENDIDO, dataCadastro, dataAtualizacao,
                Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        actualVeiculo.setAno(1);
        actualVeiculo.setCor("Cor");
        Date dataAtualizacao2 = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualVeiculo.setDataAtualizacao(dataAtualizacao2);
        Date dataCadastro2 = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualVeiculo.setDataCadastro(dataCadastro2);
        Date dataDelecao = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualVeiculo.setDataDelecao(dataDelecao);
        actualVeiculo.setDescricao("Descricao");
        actualVeiculo.setId(1L);
        actualVeiculo.setMarca("Marca");
        actualVeiculo.setModelo("Modelo");
        actualVeiculo.setNumeroPortas(10);
        actualVeiculo.setPlaca("Placa");
        BigDecimal preco2 = new BigDecimal("2.3");
        actualVeiculo.setPreco(preco2);
        actualVeiculo.setQuilometragem(1);
        actualVeiculo.setStatus(StatusVeiculoEnum.VENDIDO);
        actualVeiculo.setTipo(TipoVeiculoEnum.HATCH);
        actualVeiculo.setTipoCombustivel(TipoCombustivelEnum.ETANOL);
        Integer actualAno = actualVeiculo.getAno();
        String actualCor = actualVeiculo.getCor();
        Date actualDataAtualizacao = actualVeiculo.getDataAtualizacao();
        Date actualDataCadastro = actualVeiculo.getDataCadastro();
        Date actualDataDelecao = actualVeiculo.getDataDelecao();
        String actualDescricao = actualVeiculo.getDescricao();
        Long actualId = actualVeiculo.getId();
        String actualMarca = actualVeiculo.getMarca();
        String actualModelo = actualVeiculo.getModelo();
        Integer actualNumeroPortas = actualVeiculo.getNumeroPortas();
        String actualPlaca = actualVeiculo.getPlaca();
        BigDecimal actualPreco = actualVeiculo.getPreco();
        Integer actualQuilometragem = actualVeiculo.getQuilometragem();
        StatusVeiculoEnum actualStatus = actualVeiculo.getStatus();
        TipoVeiculoEnum actualTipo = actualVeiculo.getTipo();
        TipoCombustivelEnum actualTipoCombustivel = actualVeiculo.getTipoCombustivel();

        // Assert that nothing has changed
        assertEquals("Cor", actualCor);
        assertEquals("Descricao", actualDescricao);
        assertEquals("Marca", actualMarca);
        assertEquals("Modelo", actualModelo);
        assertEquals("Placa", actualPlaca);
        assertEquals(1, actualAno.intValue());
        assertEquals(1, actualQuilometragem.intValue());
        assertEquals(10, actualNumeroPortas.intValue());
        assertEquals(1L, actualId.longValue());
        assertEquals(StatusVeiculoEnum.VENDIDO, actualStatus);
        assertEquals(TipoCombustivelEnum.ETANOL, actualTipoCombustivel);
        assertEquals(TipoVeiculoEnum.HATCH, actualTipo);
        assertEquals(new BigDecimal("2.3"), actualPreco);
        assertSame(preco2, actualPreco);
        assertSame(dataAtualizacao2, actualDataAtualizacao);
        assertSame(dataCadastro2, actualDataCadastro);
        assertSame(dataDelecao, actualDataDelecao);
    }
}
