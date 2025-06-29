package org.example;

public class MyService4 {
    private ExternalApi4 api;

    public MyService4(ExternalApi4 api) {
        this.api = api;
    }

    public void performOperations() {
        api.connect();
        api.sendData("important-data");
        api.disconnect();
    }
}
