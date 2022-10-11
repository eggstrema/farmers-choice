package de.egga.farmerschoice.progress;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.Path.of;

public class ProgressTest {

    @Test
    @Disabled
    void fetch_progress() throws IOException {
        String dataUrl = "https://swgoh.gg/api/player/354925741/?format=json";
        Path targetFile = of("src/test/resources/progress.json");

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(dataUrl).build();

        try (Response response = client.newCall(request).execute()) {
            String progress = response.body().string();
            Files.writeString(targetFile, progress);
        }
    }

    @Test
    void name() throws IOException {
        String jsonUrl = "src/test/resources/progress.json";
        String fileContent = Files.readString(of(jsonUrl));

        Welcome data = Converter.fromJsonString(fileContent);

    }
}
