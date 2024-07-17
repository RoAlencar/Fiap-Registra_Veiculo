package br.com.fiap.app.registra.veiculos.application.dto.response;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CriarVeiculoResponse extends VeiculoBaseResponse {

    public  CriarVeiculoResponse(VeiculoBaseResponse veiculoBaseResponse){
        super(veiculoBaseResponse);
    }
}
