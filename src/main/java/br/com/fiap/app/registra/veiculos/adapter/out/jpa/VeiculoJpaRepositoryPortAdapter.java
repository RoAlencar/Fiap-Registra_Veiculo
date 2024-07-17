package br.com.fiap.app.registra.veiculos.adapter.out.jpa;

import br.com.fiap.app.registra.veiculos.adapter.out.jpa.veiculo.entities.VeiculoEntity;
import br.com.fiap.app.registra.veiculos.adapter.out.jpa.veiculo.repositories.VeiculoJpaRepository;
import br.com.fiap.app.registra.veiculos.application.port.VeiculoRepositoryPort;
import br.com.fiap.app.registra.veiculos.domain.Veiculo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class VeiculoJpaRepositoryPortAdapter implements VeiculoRepositoryPort {

    private final VeiculoJpaRepository veiculoJpaRepository;

    @Override
    public List<Veiculo> findAll() {
        return veiculoJpaRepository.findAll().stream().map(VeiculoEntity::toDomain).toList();
    }

    @Override
    public Optional<Veiculo> findById(Long id) {
        return veiculoJpaRepository.findById(id).
                map(VeiculoEntity::toDomain);
    }

    @Override
    public Veiculo save(Veiculo veiculo) {
        return veiculoJpaRepository.save(veiculo.toEntity()).toDomain();
    }

    @Override
    public void deleteById(Long id) {

    }
}
