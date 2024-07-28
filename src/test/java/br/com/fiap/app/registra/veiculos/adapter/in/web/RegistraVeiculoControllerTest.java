package br.com.fiap.app.registra.veiculos.adapter.in.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@Sql(scripts = "classpath:teste-data.sql")
public class RegistraVeiculoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testBuscarVeiculo() throws Exception {
        mockMvc.perform(get("/api/v1/veiculo/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1));
    }

    @Test
    public void testCadastrarVeiculo() throws Exception {
        mockMvc.perform(post("/api/v1/veiculo")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "    \"marca\" : \"Toyota\",\n" +
                        "    \"modelo\" : \"Corolla\",\n" +
                        "    \"ano\" : 2024,\n" +
                        "    \"cor\" : \"Preto\",\n" +
                        "    \"preco\" : 200000,\n" +
                        "    \"tipo\": \"SEDAN\",\n" +
                        "    \"quilomatragem\" : 10000,\n" +
                        "    \"tipoCombustivel\" : \"FLEX\",\n" +
                        "    \"numeroPortas\" : \"QUATRO\",\n" +
                        "    \"placa\": \"123AcD\",\n" +
                        "    \"descricao\" : \"O Toyota Corolla é um carro compacto sofisticado, oferecendo um design elegante, interior confortável e tecnologia avançada. É conhecido por sua confiabilidade, eficiência de combustível e segurança. \"\n" +
                        "}")).andExpect(status().isCreated());

    }

    @Test
    public void testAtualizarVeiculo() throws Exception {
        mockMvc.perform(put("/api/v1/veiculo")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "    \"id\" : 2,\n" +
                        "    \"marca\" : \"Toyotaa\",\n" +
                        "    \"modelo\" : \"Corolla\",\n" +
                        "    \"ano\" : 20024,\n" +
                        "    \"cor\" : \"Preto\",\n" +
                        "    \"preco\" : 1500,\n" +
                        "    \"tipo\": \"SEDAN\",\n" +
                        "    \"quilomatragem\" : 0,\n" +
                        "    \"tipoCombustivel\" : \"ETANOL\",\n" +
                        "    \"numeroPortas\" : \"QUATRO\",\n" +
                        "    \"placa\": \"abc1234\",\n" +
                        "    \"descricao\" : \"O Toyota Corolla é um carro compacto sofisticado, oferecendo um design elegante, interior confortável e tecnologia avançada. É conhecido por sua confiabilidade, eficiência de combustível e segurança \"\n" +
                        "}")).andExpect(status().isOk());
    }

}
