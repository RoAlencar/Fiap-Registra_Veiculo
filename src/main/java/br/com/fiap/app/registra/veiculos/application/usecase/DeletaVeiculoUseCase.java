package br.com.fiap.app.registra.veiculos.application.usecase;

import br.com.fiap.app.registra.veiculos.application.port.DeletaVeiculoUseCasePort;
import br.com.fiap.app.registra.veiculos.application.port.VeiculoRepositoryPort;
import br.com.fiap.app.registra.veiculos.domain.Veiculo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

@Service
@RequiredArgsConstructor
public class DeletaVeiculoUseCase implements DeletaVeiculoUseCasePort {

    private final VeiculoRepositoryPort veiculoRepositoryPort;

    @Override
    public void deleteVeiculo(Long id) throws NotFoundException {
        Veiculo veiculo = veiculoRepositoryPort.findById(id).orElseThrow(() -> new NotFoundException("Veiculo selecionado não existe na base de dados."));
        veiculoRepositoryPort.deleteById(veiculo.getId());
    }
}
