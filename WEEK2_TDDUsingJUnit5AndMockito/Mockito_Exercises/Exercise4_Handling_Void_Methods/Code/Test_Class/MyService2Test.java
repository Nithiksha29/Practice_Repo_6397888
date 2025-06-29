package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class MyService2Test {
    @Test
    public void testArgumentMatching() {
        ExternalApi2 mockApi = mock(ExternalApi2.class);
        MyService2 service = new MyService2(mockApi);

        service.process();  // This will call sendMessage

        verify(mockApi).sendMessage(eq("hema"), contains("hello"));
    }

}