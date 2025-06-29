package org.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MyService5Test {

    @Test
    public void testVoidMethodThrowsException() {
        // 1. Create mock
        ExternalApi5 mockApi = mock(ExternalApi5.class);

        // 2. Stub the void method to throw exception
        doThrow(new RuntimeException("File not found"))
                .when(mockApi).deleteFile("data.txt");

        // 3. Use service
        MyService5 service = new MyService5(mockApi);

        // 4. Assert exception is thrown
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            service.removeFile("data.txt");
        });

        assertEquals("File not found", exception.getMessage());

        // 5. Verify the method was called
        verify(mockApi).deleteFile("data.txt");
    }
}
