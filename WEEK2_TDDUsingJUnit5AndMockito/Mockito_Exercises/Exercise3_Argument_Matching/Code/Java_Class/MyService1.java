package org.example;



// Service that uses the API
class MyService1 {
    private ExternalApi1 api;

    public MyService1(ExternalApi1 api) {
        this.api = api;
    }

    public void process() {
        api.sendMessage("hema", "hello world");
    }
}
