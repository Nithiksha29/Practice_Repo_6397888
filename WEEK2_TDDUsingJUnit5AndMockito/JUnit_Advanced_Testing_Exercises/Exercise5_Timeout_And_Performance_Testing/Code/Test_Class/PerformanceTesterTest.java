package org.example;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class PerformanceTesterTest {

    @Test
    void testPerformTaskWithinTimeLimit() {
        PerformanceTester tester = new PerformanceTester();

        // Passes if method completes within 200 milliseconds
        assertTimeout(Duration.ofMillis(200), tester::performTask);
    }

    @Test
    void testPerformTaskFailsOnTimeout() {
        PerformanceTester tester = new PerformanceTester();

        // Fails if method takes more than 50 milliseconds
        assertTimeout(Duration.ofMillis(50), tester::performTask);
    }
}
