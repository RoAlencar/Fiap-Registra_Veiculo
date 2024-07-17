package br.com.fiap.app.registra.veiculos.adapter.out.jpa.veiculo.repositories;

import br.com.fiap.app.registra.veiculos.adapter.out.jpa.veiculo.entities.VeiculoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoJpaRepository extends JpaRepository<VeiculoEntity, Long> {
}
