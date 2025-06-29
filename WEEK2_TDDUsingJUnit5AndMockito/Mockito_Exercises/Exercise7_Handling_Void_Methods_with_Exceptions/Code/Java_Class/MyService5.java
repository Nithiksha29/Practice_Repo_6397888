package org.example;

public class MyService5 {
    private ExternalApi5 api;

    public MyService5(ExternalApi5 api) {
        this.api = api;
    }

    public void removeFile(String fileName) {
        api.deleteFile(fileName);
    }
}
