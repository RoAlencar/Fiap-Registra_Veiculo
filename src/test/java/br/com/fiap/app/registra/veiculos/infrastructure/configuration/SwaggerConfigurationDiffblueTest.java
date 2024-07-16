package br.com.fiap.app.registra.veiculos.infrastructure.configuration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.SpecVersion;
import io.swagger.v3.oas.models.info.Info;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {SwaggerConfiguration.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class SwaggerConfigurationDiffblueTest {
    @Autowired
    private SwaggerConfiguration swaggerConfiguration;

    /**
     * Method under test: {@link SwaggerConfiguration#customOpenAPI()}
     */
    @Test
    public void testCustomOpenAPI() {
        // Arrange and Act
        OpenAPI actualCustomOpenAPIResult = swaggerConfiguration.customOpenAPI();

        // Assert
        Info info = actualCustomOpenAPIResult.getInfo();
        assertEquals("1.0", info.getVersion());
        assertEquals("3.0.1", actualCustomOpenAPIResult.getOpenapi());
        assertEquals("Fiap Registra Veiculo", info.getDescription());
        assertEquals("Fiap Registra Veiculo", info.getTitle());
        assertNull(actualCustomOpenAPIResult.getComponents());
        assertNull(actualCustomOpenAPIResult.getExternalDocs());
        assertNull(actualCustomOpenAPIResult.getPaths());
        assertNull(info.getContact());
        assertNull(info.getLicense());
        assertNull(actualCustomOpenAPIResult.getJsonSchemaDialect());
        assertNull(info.getSummary());
        assertNull(info.getTermsOfService());
        assertNull(actualCustomOpenAPIResult.getSecurity());
        assertNull(actualCustomOpenAPIResult.getServers());
        assertNull(actualCustomOpenAPIResult.getTags());
        assertNull(actualCustomOpenAPIResult.getWebhooks());
        assertNull(actualCustomOpenAPIResult.getExtensions());
        assertNull(info.getExtensions());
        assertEquals(SpecVersion.V30, actualCustomOpenAPIResult.getSpecVersion());
    }
}
