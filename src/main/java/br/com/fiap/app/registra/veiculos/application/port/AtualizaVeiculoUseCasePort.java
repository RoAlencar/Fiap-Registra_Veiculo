package br.com.fiap.app.registra.veiculos.application.port;

import br.com.fiap.app.registra.veiculos.application.dto.request.AtualizaVeiculoDto;
import br.com.fiap.app.registra.veiculos.application.dto.response.AtualizaVeiculoResponse;
import br.com.fiap.app.registra.veiculos.infrastructure.exception.custom.ModificaVeiculoException;

public interface AtualizaVeiculoUseCasePort {

    AtualizaVeiculoResponse atualizaVeiculo(AtualizaVeiculoDto dto) throws ModificaVeiculoException;
}
