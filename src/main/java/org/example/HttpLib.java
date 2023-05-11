package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.HttpMethod;

public class HttpLib {
    OkHttpClient client;

    public HttpLib() {
        this.client = new OkHttpClient();
    }

    public String getExampleDotCom() {
        Request request = new Request.Builder()
                    .url("https://example.com")
                    .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
