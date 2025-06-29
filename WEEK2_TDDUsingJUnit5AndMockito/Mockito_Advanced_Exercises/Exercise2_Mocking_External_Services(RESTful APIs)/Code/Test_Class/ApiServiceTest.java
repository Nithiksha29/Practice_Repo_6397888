package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ApiServiceTest {

    @Test
    public void testServiceWithMockRestClient() {
        // 1. Create mock REST client
        RestClient mockRestClient = mock(RestClient.class);

        // 2. Stub REST client method
        when(mockRestClient.getResponse()).thenReturn("Mock Response");

        // 3. Inject mock into service and test
        ApiService apiService = new ApiService(mockRestClient);
        String result = apiService.fetchData();

        // 4. Assert the expected outcome
        assertEquals("Fetched Mock Response", result);
    }
}
