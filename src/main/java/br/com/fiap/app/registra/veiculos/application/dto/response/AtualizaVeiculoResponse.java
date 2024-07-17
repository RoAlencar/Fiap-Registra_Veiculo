package br.com.fiap.app.registra.veiculos.application.dto.response;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AtualizaVeiculoResponse extends VeiculoBaseResponse {

    public AtualizaVeiculoResponse(VeiculoBaseResponse veiculoBaseResponse){
        super(veiculoBaseResponse);
    }
}
