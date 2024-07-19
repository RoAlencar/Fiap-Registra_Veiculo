package br.com.fiap.app.registra.veiculos.infrastructure.exception;

import br.com.fiap.app.registra.veiculos.infrastructure.exception.custom.ModificaVeiculoException;
import br.com.fiap.app.registra.veiculos.infrastructure.exception.custom.VeiculoNaoEncontradoException;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GlobalExceptionHandlerTest {

    GlobalExceptionHandler globalExceptionHandler = new GlobalExceptionHandler();

    @Test
    public void handlerVeiculoNaoEncontradoException() {
        VeiculoNaoEncontradoException exception = new VeiculoNaoEncontradoException();

        ObjectNode mockObjectNode = mock(ObjectNode.class);
        when(mockObjectNode.asText()).thenReturn("Veiculo não encontrado");

        globalExceptionHandler = Mockito.spy(globalExceptionHandler);
        doReturn(mockObjectNode).when(globalExceptionHandler).converterMensagem(anyString());

        ResponseEntity<ObjectNode> response = globalExceptionHandler.handleVeiculoNaoEncontradoException(exception);

        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());

        assertEquals(mockObjectNode, response.getBody());

        verify(globalExceptionHandler).converterMensagem("Veiculo não encontrado");
    }

    @Test
    public void handlerhandleModificaVeiculoException(){
        ModificaVeiculoException exception = new ModificaVeiculoException();

        ObjectNode mockObjectNode = mock(ObjectNode.class);
        when(mockObjectNode.asText()).thenReturn("Não foi possivel atualizar o veiculo");

        globalExceptionHandler = Mockito.spy(globalExceptionHandler);
        doReturn(mockObjectNode).when(globalExceptionHandler).converterMensagem(anyString());

        ResponseEntity<ObjectNode> response = globalExceptionHandler.handleModificaVeiculoException(exception);
        assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
        assertEquals(mockObjectNode, response.getBody());
        verify(globalExceptionHandler).converterMensagem("Não foi possivel atualizar o veiculo");
    }

    @Test
    public void testConverterMensagem() {
        GlobalExceptionHandler exceptionHandler = new GlobalExceptionHandler();
        String mensagem = "Mensagem de teste";
        ObjectNode resultado = exceptionHandler.converterMensagem(mensagem);
        assertEquals(mensagem, resultado.get("mensagem").asText());
    }


}
