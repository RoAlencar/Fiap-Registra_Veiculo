package br.com.fiap.app.registra.veiculos.application.port;

import br.com.fiap.app.registra.veiculos.application.dto.response.BuscaVeiculoResponse;
import br.com.fiap.app.registra.veiculos.infrastructure.exception.custom.VeiculoNaoEncontradoException;

import java.util.List;

public interface BuscaVeiculoUseCasePort {

    List<BuscaVeiculoResponse> buscaTodosVeiculos();
    BuscaVeiculoResponse buscaVeiculoPorId(Long id) throws VeiculoNaoEncontradoException;
}
