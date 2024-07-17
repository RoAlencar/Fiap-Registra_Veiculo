package br.com.fiap.app.registra.veiculos.adapter.in.web;

import br.com.fiap.app.registra.veiculos.application.dto.request.AtualizaVeiculoDto;
import br.com.fiap.app.registra.veiculos.application.dto.request.CriarVeiculoDto;
import br.com.fiap.app.registra.veiculos.application.dto.response.AtualizaVeiculoResponse;
import br.com.fiap.app.registra.veiculos.application.dto.response.BuscaVeiculoResponse;
import br.com.fiap.app.registra.veiculos.application.dto.response.CriarVeiculoResponse;
import br.com.fiap.app.registra.veiculos.application.port.AtualizaVeiculoUseCasePort;
import br.com.fiap.app.registra.veiculos.application.port.BuscaVeiculoUseCasePort;
import br.com.fiap.app.registra.veiculos.application.port.CriarVeiculoUseCasePort;
import br.com.fiap.app.registra.veiculos.application.port.DeletaVeiculoUseCasePort;
import br.com.fiap.app.registra.veiculos.infrastructure.exception.custom.ModificaVeiculoException;
import br.com.fiap.app.registra.veiculos.infrastructure.exception.custom.VeiculoNaoEncontradoException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/v1/veiculo")
@RequiredArgsConstructor
public class RegistraVeiculoController {

    private final BuscaVeiculoUseCasePort buscaVeiculoUseCase;
    private final AtualizaVeiculoUseCasePort atualizaVeiculoUseCase;
    private final DeletaVeiculoUseCasePort deletaVeiculoUseCase;
    private final CriarVeiculoUseCasePort criarVeiculoUseCase;

    @GetMapping
    public ResponseEntity<List<BuscaVeiculoResponse>> buscaTodosVeiculos() {
        log.info("[Veiculo - Busca Todos os Veiculos] Iniciando processo.");
        return new ResponseEntity<>(buscaVeiculoUseCase.buscaTodosVeiculos(), HttpStatus.OK);
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<BuscaVeiculoResponse> buscaVeiculoPorId(@PathVariable Long id) throws VeiculoNaoEncontradoException {
        log.info("[Veiculo - Busca Veiculo por ID] Iniciando processo.");
        BuscaVeiculoResponse buscaVeiculoResponseDto = buscaVeiculoUseCase.buscaVeiculoPorId(id);
        return new ResponseEntity<>(buscaVeiculoResponseDto, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CriarVeiculoResponse> criarVeiculo(@RequestBody CriarVeiculoDto dto) {
        log.info("[Veiculo - Criar Veiculo] Iniciando processo.");
        return new ResponseEntity<>(criarVeiculoUseCase.criarVeiculo(dto), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<AtualizaVeiculoResponse> atualizaVeiculo(@RequestBody AtualizaVeiculoDto dto) throws ModificaVeiculoException {
        log.info("[Veiculo - Atualiza Veiculo] Iniciando processo.");
        AtualizaVeiculoResponse atualizaVeiculoResponse = atualizaVeiculoUseCase.atualizaVeiculo(dto);
        return new ResponseEntity<>(atualizaVeiculoResponse, HttpStatus.OK);
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<Void> deletaVeiculo(@PathVariable Long id) {
        log.info("[Veiculo - Deleta Veiculo] Iniciando processo.");
        deletaVeiculoUseCase.deleteVeiculo(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
