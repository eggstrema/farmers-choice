package de.egga.farmerschoice.progress;

import de.egga.farmerschoice.progress.repository.Converter;
import de.egga.farmerschoice.progress.repository.Unit;
import de.egga.farmerschoice.progress.repository.UnitData;
import de.egga.farmerschoice.progress.repository.Welcome;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static java.nio.file.Path.of;

public class ProgressTest {

    @Test
    @Disabled
    void fetch_progress() throws IOException {
        String dataUrl = "https://swgoh.gg/api/player/354925741/?format=json";
        Path targetFile = of("src/main/resources/progress.json");

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(dataUrl).build();

        try (Response response = client.newCall(request).execute()) {
            String progress = response.body().string();
            Files.writeString(targetFile, progress);
        }
    }

    @Test
    void name() throws IOException {
        String jsonUrl = "src/main/resources/progress.json";
        String fileContent = Files.readString(of(jsonUrl));

        Welcome welcome = Converter.fromJsonString(fileContent);

        List<Unit> units = welcome.getUnits();

        for (Unit unit : units) {
            UnitData data = unit.getData();
            System.out.println(data.getName());
        }

    }
}
