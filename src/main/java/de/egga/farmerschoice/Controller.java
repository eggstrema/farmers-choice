package de.egga.farmerschoice;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.IOException;

@RestController
public class Controller {

    @GetMapping("/toons")
    public String characters() throws IOException {
        OkHttpClient client = new OkHttpClient();


        String url = "https://swgoh.gg/api/characters/?format=json";
        Request request = new Request.Builder().url(url).build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
}
