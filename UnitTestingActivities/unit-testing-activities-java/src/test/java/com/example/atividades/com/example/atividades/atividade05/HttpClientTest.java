package com.example.atividades.atividade05;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class HttpClientTest {

    @Mock
    private IHttpClient mockHttpClient;

    @InjectMocks
    private HttpClient httpClient;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetDataFromApi() throws IOException {
        String url = "http://example.com";
        String expectedResponse = "response from API";

        when(mockHttpClient.getDataFromApi(url)).thenReturn(expectedResponse);

        String actualResponse = httpClient.getDataFromApi(url);

        assertEquals(expectedResponse, actualResponse);
        verify(mockHttpClient, times(1)).getDataFromApi(url);
    }

    @Test
    public void testGetDataFromApiThrowsException() throws IOException {
        String url = "http://example.com";

        when(mockHttpClient.getDataFromApi(url)).thenThrow(new IOException("API error"));

        assertThrows(IOException.class, () -> {
            httpClient.getDataFromApi(url);
        });

        verify(mockHttpClient, times(1)).getDataFromApi(url);
    }
    
    @Test
    public void testGetDataFromApiInvalidUrl() throws IOException {
        String url = "invalid-url";

        when(mockHttpClient.getDataFromApi(url)).thenThrow(new IOException("Invalid URL"));

        assertThrows(IOException.class, () -> {
            httpClient.getDataFromApi(url);
        });

        verify(mockHttpClient, times(1)).getDataFromApi(url);
    }
    
    @Test
    public void testGetDataFromApiEmptyResponse() throws IOException {
        String url = "http://example.com";
        String expectedResponse = "";

        when(mockHttpClient.getDataFromApi(url)).thenReturn(expectedResponse);

        String actualResponse = httpClient.getDataFromApi(url);

        assertEquals(expectedResponse, actualResponse);
        verify(mockHttpClient, times(1)).getDataFromApi(url);
    }
    
    @Test
    public void testGetDataFromApiErrorResponse() throws IOException {
        String url = "http://example.com";
        String expectedResponse = "Error";

        when(mockHttpClient.getDataFromApi(url)).thenReturn(expectedResponse);

        String actualResponse = httpClient.getDataFromApi(url);

        assertEquals(expectedResponse, actualResponse);
        verify(mockHttpClient, times(1)).getDataFromApi(url);
    }
}
