package de.egga.farmerschoice;

import de.egga.farmerschoice.characters.CharacterService;
import de.egga.farmerschoice.progress.ProgressService;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    CharacterService characterService;

    @Autowired
    ProgressService progressService;

    @GetMapping("/phoenix")
    public String phoenix() throws IOException {

        List<String> phoenixIds = characterService.getPhoenixIds();

        String myProgress = progressService.getMyProgress(phoenixIds);
        return myProgress;
    }

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
