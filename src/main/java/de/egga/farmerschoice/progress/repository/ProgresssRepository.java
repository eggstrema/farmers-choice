package de.egga.farmerschoice.progress.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@Repository
public class ProgresssRepository {

    @Value("classpath:progress.json")
    public Resource resource;

    public Welcome readAllProgress() throws IOException {
        InputStream inputStream = resource.getInputStream();
        String fileContent = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);

        return Converter.fromJsonString(fileContent);
    }
}