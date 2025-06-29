package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class MyServiceTest1 {

    @Test
    public void testVerifyInteraction() {
        // 1. Create mock
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // 2. Inject into service and call method
        MyService service = new MyService(mockApi);
        service.fetchData();

        // 3. Verify that the method was called
        verify(mockApi).getData();
    }
}