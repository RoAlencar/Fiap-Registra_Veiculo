package br.com.fiap.app.registra.veiculos.application.port;

import br.com.fiap.app.registra.veiculos.domain.Veiculo;

import java.util.List;
import java.util.Optional;

public interface VeiculoRepositoryPort {

    List<Veiculo> findAll();
    Optional<Veiculo> findById(Long id);
    Veiculo save(Veiculo veiculo);
    void deleteById(Long id);
}
