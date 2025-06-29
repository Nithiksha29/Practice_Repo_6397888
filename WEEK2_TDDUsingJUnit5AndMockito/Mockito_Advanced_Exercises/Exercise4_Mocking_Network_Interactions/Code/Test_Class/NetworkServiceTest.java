package org.example;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NetworkServiceTest {

    @Test
    public void testServiceWithMockNetworkClient() {
        // 1. Create mock network client
        NetworkClient mockNetworkClient = mock(NetworkClient.class);

        // 2. Stub the connect method
        when(mockNetworkClient.connect()).thenReturn("Mock Connection");

        // 3. Inject mock into service
        NetworkService networkService = new NetworkService(mockNetworkClient);

        // 4. Test and verify result
        String result = networkService.connectToServer();
        assertEquals("Connected to Mock Connection", result);
    }
}
