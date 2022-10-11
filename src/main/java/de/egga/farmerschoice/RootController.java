package de.egga.farmerschoice;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class RootController {

    @GetMapping("/toons")
    public String characters() throws IOException {
        if (true) {
            throw new RuntimeException("forbidden for now");
        }

        OkHttpClient client = new OkHttpClient();

        String url = "https://swgoh.gg/api/characters/?format=json";
        Request request = new Request.Builder().url(url).build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    @GetMapping("/gear")
    public String gear() throws IOException {
        if (true) {
            throw new RuntimeException("forbidden for now");
        }

        OkHttpClient client = new OkHttpClient();

        String url = "https://swgoh.gg/api/gear/126/?format=json";
        Request request = new Request.Builder().url(url).build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
}
