package de.egga.farmerschoice.progress.repository.raw;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@Component
public class ProgressReader {

    @Value("classpath:progress.json")
    public Resource resource;

    public Welcome readAllProgress() throws IOException {
        InputStream inputStream = resource.getInputStream();
        String fileContent = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);

        return ProgressParser.fromJsonString(fileContent);
    }
}
