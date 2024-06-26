package com.example.atividades.atividade05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HttpClientWrapperIntegrationTest {

    private MockWebServer mockWebServer;
    private HttpClientWrapper httpClientWrapper;

    @BeforeEach
    public void setUp() throws IOException {
        mockWebServer = new MockWebServer();
        mockWebServer.start();

        OkHttpClient okHttpClient = new OkHttpClient();
        httpClientWrapper = new HttpClientWrapper(okHttpClient);
    }

    @AfterEach
    public void tearDown() throws IOException {
        mockWebServer.shutdown();
    }

    @Test
    public void testGetDataFromApi() throws IOException {
        // Configurar a resposta simulada da API
        String responseBody = "Mocked response from API";
        mockWebServer.enqueue(new MockResponse().setBody(responseBody));

        // Executar o método que está sendo testado
        String apiUrl = mockWebServer.url("/").toString();
        String actualResponse = httpClientWrapper.getDataFromApi(apiUrl);

        // Verificar se a resposta corresponde à resposta simulada
        assertEquals(responseBody, actualResponse);
    }
}
