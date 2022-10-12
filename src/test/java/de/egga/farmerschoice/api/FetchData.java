package de.egga.farmerschoice.api;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.Path.of;

public class FetchData {

    public static final String BASE_URL = "https://swgoh.gg/api";

    @Test
    @Disabled
    void fetch_progress() throws IOException {
        String url = "/player/354925741/";
        Path targetFile = pathTo("progress.json");

        Files.writeString(targetFile, fetch(url));
    }

    @Test
    @Disabled
    void list_gear() throws IOException {
        String url = "/gear";
        Path targetFile = pathTo("gear.json");

        Files.writeString(targetFile, fetch(url));
    }

    @Test
    @Disabled
    void stats() throws IOException {
        String url = "/stat-definitions/";
        Path targetFile = pathTo("stat-definitions.json");

        Files.writeString(targetFile, fetch(url));
    }

    @Test
    @Disabled
    void units() throws IOException {
        String url = "/units/";
        Path targetFile = pathTo("units.json");

        Files.writeString(targetFile, fetch(url));
    }

    @Test
    @Disabled
    void legends() throws IOException {
        String url = "/gl-checklist/";
        Path targetFile = pathTo("legends.json");

        Files.writeString(targetFile, fetch(url));
    }

    private String fetch(String url) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(BASE_URL + url).build();

        try (Response response = client.newCall(request).execute()) {
            String responseBody = response.body().string();
            return responseBody;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    @NotNull
    private Path pathTo(String filename) {
        Path targetFile = of("src/main/resources/" + filename);
        return targetFile;
    }
}
