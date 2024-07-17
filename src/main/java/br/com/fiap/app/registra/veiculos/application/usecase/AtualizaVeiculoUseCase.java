package br.com.fiap.app.registra.veiculos.application.usecase;

import br.com.fiap.app.registra.veiculos.application.dto.request.AtualizaVeiculoDto;
import br.com.fiap.app.registra.veiculos.application.dto.response.AtualizaVeiculoResponse;
import br.com.fiap.app.registra.veiculos.application.port.AtualizaVeiculoUseCasePort;
import br.com.fiap.app.registra.veiculos.application.port.VeiculoRepositoryPort;
import br.com.fiap.app.registra.veiculos.domain.Veiculo;
import br.com.fiap.app.registra.veiculos.infrastructure.exception.custom.ModificaVeiculoException;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AtualizaVeiculoUseCase implements AtualizaVeiculoUseCasePort {

    private final VeiculoRepositoryPort veiculoRepositoryPort;
    private final ModelMapper modelMapper;

    @Override
    public AtualizaVeiculoResponse atualizaVeiculo(AtualizaVeiculoDto dto) throws ModificaVeiculoException {
        Veiculo veiculoExistente = veiculoRepositoryPort.findById(dto.getId())
                .orElseThrow(ModificaVeiculoException::new);

        modelMapper.map(dto, veiculoExistente);

        Veiculo atualizaVeiculo = veiculoRepositoryPort.save(veiculoExistente);
        return modelMapper.map(atualizaVeiculo, AtualizaVeiculoResponse.class);
    }
}
