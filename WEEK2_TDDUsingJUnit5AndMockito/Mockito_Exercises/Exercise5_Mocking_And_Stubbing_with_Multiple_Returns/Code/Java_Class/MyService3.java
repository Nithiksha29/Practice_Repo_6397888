package org.example;

public class MyService3 {
    private ExternalApi3 api;

    public MyService3(ExternalApi3 api) {
        this.api = api;
    }

    public String[] checkMultipleStatuses() {
        String[] results = new String[3];
        results[0] = api.getStatus();  // first call
        results[1] = api.getStatus();  // second call
        results[2] = api.getStatus();  // third call
        return results;
    }

}
