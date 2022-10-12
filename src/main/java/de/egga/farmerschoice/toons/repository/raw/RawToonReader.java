package de.egga.farmerschoice.toons.repository.raw;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.Collections.emptyList;

@Component
public class RawToonReader {

    @Value("classpath:characters.json")
    public Resource resource;

    public List<RawToon> readRawToons() {
        try {
            InputStream inputStream = resource.getInputStream();
            String fileContent = new String(inputStream.readAllBytes(), UTF_8);
            return RawToonParser.fromJsonString(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return emptyList();
    }
}