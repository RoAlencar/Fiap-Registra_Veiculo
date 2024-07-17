package br.com.fiap.app.registra.veiculos.application.port;

import org.webjars.NotFoundException;

public interface DeletaVeiculoUseCasePort {

    void deleteVeiculo(Long id) throws NotFoundException;
}
