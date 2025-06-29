package org.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MyService3Test {

    @Test
    public void testMultipleReturns() {
        // 1. Create mock object
        ExternalApi3 mockApi = mock(ExternalApi3.class);

        // 2. Stub with multiple returns
        when(mockApi.getStatus())
                .thenReturn("Pending")
                .thenReturn("Processing")
                .thenReturn("Completed");

        // 3. Use the mock in service
        MyService3 service = new MyService3(mockApi);
        String[] statuses = service.checkMultipleStatuses();

        // 4. Assert expected values
        assertEquals("Pending", statuses[0]);
        assertEquals("Processing", statuses[1]);
        assertEquals("Completed", statuses[2]);
    }
}
