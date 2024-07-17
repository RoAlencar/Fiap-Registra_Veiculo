package br.com.fiap.app.registra.veiculos.application.usecase;

import br.com.fiap.app.registra.veiculos.application.dto.response.BuscaVeiculoResponse;
import br.com.fiap.app.registra.veiculos.application.port.BuscaVeiculoUseCasePort;
import br.com.fiap.app.registra.veiculos.application.port.VeiculoRepositoryPort;
import br.com.fiap.app.registra.veiculos.domain.Veiculo;
import br.com.fiap.app.registra.veiculos.infrastructure.exception.custom.VeiculoNaoEncontradoException;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BuscaVeiculoUseCase implements BuscaVeiculoUseCasePort {

    private final VeiculoRepositoryPort veiculoRepositoryPort;
    private final ModelMapper modelMapper;

    @Override
    public List<BuscaVeiculoResponse> buscaTodosVeiculos() {
        return veiculoRepositoryPort.findAll().stream()
                .map(entity -> modelMapper.map(entity, BuscaVeiculoResponse.class)).toList();
    }

    @Override
    public BuscaVeiculoResponse buscaVeiculoPorId(Long id) throws VeiculoNaoEncontradoException {
        Veiculo veiculo = veiculoRepositoryPort.findById(id).orElseThrow(VeiculoNaoEncontradoException::new);
        return modelMapper.map(veiculo, BuscaVeiculoResponse.class);
    }
}
