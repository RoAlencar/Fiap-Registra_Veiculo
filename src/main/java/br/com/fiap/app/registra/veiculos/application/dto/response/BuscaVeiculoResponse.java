package br.com.fiap.app.registra.veiculos.application.dto.response;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BuscaVeiculoResponse extends VeiculoBaseResponse {
    public BuscaVeiculoResponse(VeiculoBaseResponse veiculoBaseResponse){
        super(veiculoBaseResponse);
    }
}
