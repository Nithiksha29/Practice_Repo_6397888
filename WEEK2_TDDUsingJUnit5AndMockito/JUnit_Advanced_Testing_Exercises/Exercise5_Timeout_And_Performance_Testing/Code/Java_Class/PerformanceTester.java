package org.example;

public class PerformanceTester {
    public void performTask() {
        try {
            // Simulate task that takes time
            Thread.sleep(100); // 100 milliseconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
