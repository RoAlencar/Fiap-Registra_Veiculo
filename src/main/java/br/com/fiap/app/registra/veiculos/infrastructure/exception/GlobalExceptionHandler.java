package br.com.fiap.app.registra.veiculos.infrastructure.exception;


import br.com.fiap.app.registra.veiculos.infrastructure.exception.custom.ModificaVeiculoException;
import br.com.fiap.app.registra.veiculos.infrastructure.exception.custom.VeiculoNaoEncontradoException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(VeiculoNaoEncontradoException.class)
    public ResponseEntity<ObjectNode> handleVeiculoInexistenteException(VeiculoNaoEncontradoException ex) {
        log.warn("[Veiculo - Busca Veiculo por ID] Veiculo não encontrado.");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(converterMensagem("Veiculo não encontrado"));
    }

    @ExceptionHandler(ModificaVeiculoException.class)
    public ResponseEntity<ObjectNode> handleVeiculoInexistenteException(ModificaVeiculoException ex) {
        log.warn("[Veiculo - Atualiza Veiculo] Não foi possivel atualizar o veiculo.");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(converterMensagem("Não foi possivel atualizar o veiculo"));
    }

    private ObjectNode converterMensagem(String mensagem) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode json = mapper.createObjectNode();
        json.put("mensagem", mensagem);
        return json;
    }


}
