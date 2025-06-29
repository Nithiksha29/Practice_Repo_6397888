package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

class MyService4Test {
    @Test
    public void testInteractionOrder() {
        // 1. Create mock
        ExternalApi4 mockApi = mock(ExternalApi4.class);

        // 2. Use service
        MyService4 service = new MyService4(mockApi);
        service.performOperations();

        // 3. Verify interaction order
        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).connect();
        inOrder.verify(mockApi).sendData("important-data");
        inOrder.verify(mockApi).disconnect();
    }
}