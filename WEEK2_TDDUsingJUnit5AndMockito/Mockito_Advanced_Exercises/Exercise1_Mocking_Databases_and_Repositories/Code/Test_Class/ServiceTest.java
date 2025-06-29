package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ServiceTest {
    @Test
    public void testServiceWithMockRepository() {
        // 1. Create a mock repository
        Repository mockRepository = mock(Repository.class);

        // 2. Stub the repository method
        when(mockRepository.getData()).thenReturn("Mock Data");

        // 3. Create service with mock and test logic
        Service service = new Service(mockRepository);
        String result = service.processData();

        // 4. Verify result
        assertEquals("Processed Mock Data", result);
    }


}