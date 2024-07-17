package br.com.fiap.app.registra.veiculos.application.port;

import br.com.fiap.app.registra.veiculos.application.dto.request.CriarVeiculoDto;
import br.com.fiap.app.registra.veiculos.application.dto.response.CriarVeiculoResponse;

public interface CriarVeiculoUseCasePort {

    CriarVeiculoResponse criarVeiculo(CriarVeiculoDto dto);
}
