package org.example;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FileServiceTest {

    @Test
    public void testServiceWithMockFileIO() {
        // 1. Create mock file reader and writer
        FileReader mockFileReader = mock(FileReader.class);
        FileWriter mockFileWriter = mock(FileWriter.class);

        // 2. Stub the fileReader.read() method
        when(mockFileReader.read()).thenReturn("Mock File Content");

        // 3. Inject mocks and test
        FileService fileService = new FileService(mockFileReader, mockFileWriter);
        String result = fileService.processFile();

        // 4. Verify result
        assertEquals("Processed Mock File Content", result);

        // 5. Optionally verify that write was called
        verify(mockFileWriter).write("Processed Mock File Content");
    }
}
