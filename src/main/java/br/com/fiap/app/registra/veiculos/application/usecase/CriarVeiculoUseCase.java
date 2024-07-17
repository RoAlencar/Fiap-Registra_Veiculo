package br.com.fiap.app.registra.veiculos.application.usecase;

import br.com.fiap.app.registra.veiculos.application.dto.request.CriarVeiculoDto;
import br.com.fiap.app.registra.veiculos.application.dto.response.CriarVeiculoResponse;
import br.com.fiap.app.registra.veiculos.application.port.CriarVeiculoUseCasePort;
import br.com.fiap.app.registra.veiculos.application.port.VeiculoRepositoryPort;
import br.com.fiap.app.registra.veiculos.domain.Veiculo;
import br.com.fiap.app.registra.veiculos.domain.enums.NumeroPortasEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.StatusVeiculoEnum;
import br.com.fiap.app.registra.veiculos.domain.enums.TipoCombustivelEnum;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class CriarVeiculoUseCase implements CriarVeiculoUseCasePort {

    private final VeiculoRepositoryPort veiculoRepositoryPort;
    private final ModelMapper modelMapper;

    @Override
    public CriarVeiculoResponse criarVeiculo(CriarVeiculoDto dto) {
        Veiculo veiculo = Veiculo.builder()
                .marca(dto.getMarca())
                .modelo(dto.getModelo())
                .ano(dto.getAno())
                .cor(dto.getCor())
                .preco(dto.getPreco())
                .tipo(dto.getTipo())
                .quilometragem(dto.getQuilometragem())
                .tipoCombustivel(TipoCombustivelEnum.GASOLINA)
                .numeroPortas(NumeroPortasEnum.QUATRO)
                .placa(dto.getPlaca())
                .descricao(dto.getDescricao())
                .status(StatusVeiculoEnum.DISPONIVEL)
                .dataCadastro(new Date())
                .build();

        return modelMapper.map(veiculoRepositoryPort.save(veiculo), CriarVeiculoResponse.class);
    }
}
