package org.example;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultiReturnServiceTest {

    @Test
    public void testServiceWithMultipleReturnValues() {
        // 1. Create mock
        Repository mockRepository = mock(Repository.class);

        // 2. Stub with multiple return values
        when(mockRepository.getData())
                .thenReturn("First Mock Data")
                .thenReturn("Second Mock Data");

        // 3. Use the mock in the service
        Service service = new Service(mockRepository);

        // 4. Call and assert both times
        String firstResult = service.processData();
        String secondResult = service.processData();

        assertEquals("Processed First Mock Data", firstResult);
        assertEquals("Processed Second Mock Data", secondResult);
    }
}

