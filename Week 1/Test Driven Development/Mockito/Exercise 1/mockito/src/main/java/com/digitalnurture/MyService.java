package com.digitalnurture;

public class MyService {
    private ExternalApi api;

    // The service depends on the External API
    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
}