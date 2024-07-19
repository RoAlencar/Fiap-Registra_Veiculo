package br.com.fiap.app.registra.veiculos.adapter.out.jpa.veiculo;

import br.com.fiap.app.registra.veiculos.adapter.out.jpa.VeiculoJpaRepositoryPortAdapter;
import br.com.fiap.app.registra.veiculos.adapter.out.jpa.veiculo.entities.VeiculoEntity;
import br.com.fiap.app.registra.veiculos.adapter.out.jpa.veiculo.repositories.VeiculoJpaRepository;
import br.com.fiap.app.registra.veiculos.domain.Veiculo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

public class VeiculoJpaRepositoryPortAdapterTest {

    @Mock
    private VeiculoJpaRepository veiculoJpaRepository;

    @InjectMocks
    private VeiculoJpaRepositoryPortAdapter veiculoJpaRepositoryPortAdapter;

    @BeforeEach
    void setUp() {
        openMocks(this);
    }

    @Test
    void buscaTodosVeiculos() {
        VeiculoEntity veiculoEntity1 = mock(VeiculoEntity.class);
        VeiculoEntity veiculoEntity2 = mock(VeiculoEntity.class);
        when(veiculoJpaRepository.findAll()).thenReturn(Arrays.asList(veiculoEntity1, veiculoEntity2));
        when(veiculoEntity1.toDomain()).thenReturn(new Veiculo());
        when(veiculoEntity2.toDomain()).thenReturn(new Veiculo());

        List<Veiculo> veiculos = veiculoJpaRepositoryPortAdapter.findAll();

        assertEquals(2, veiculos.size());
    }

    @Test
    void buscaVeiculoPorId() {
        Long idVeiculo = 1L;
        VeiculoEntity veiculoEntity = mock(VeiculoEntity.class);
        when(veiculoJpaRepository.findById(idVeiculo)).thenReturn(Optional.of(veiculoEntity));
        when(veiculoEntity.toDomain()).thenReturn(new Veiculo());

        Optional<Veiculo> veiculo = veiculoJpaRepositoryPortAdapter.findById(idVeiculo);

        assertTrue(veiculo.isPresent());
    }

    @Test
    void buscaVeiculoPorIdInvalido() {
        Long idVeiculo = 999L;
        when(veiculoJpaRepository.findById(idVeiculo)).thenReturn(Optional.empty());
        Optional<Veiculo> veiculo = veiculoJpaRepositoryPortAdapter.findById(idVeiculo);

        assertTrue(veiculo.isEmpty());
    }

    @Test
    void salvaVeiculo() {
        Veiculo veiculo = mock(Veiculo.class);
        VeiculoEntity veiculoEntity = mock(VeiculoEntity.class);
        when(veiculo.toEntity()).thenReturn(veiculoEntity);
        when(veiculoJpaRepository.save(veiculoEntity)).thenReturn(veiculoEntity);
        when(veiculoEntity.toDomain()).thenReturn(veiculo);

        Veiculo veiculoSalva = veiculoJpaRepositoryPortAdapter.save(veiculo);

        assertEquals(veiculo, veiculoSalva);
    }

}
