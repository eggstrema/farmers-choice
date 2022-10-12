package de.egga.farmerschoice.gear;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.Collections.emptyList;

@Component
public class RawGearReader {

    @Value("classpath:characters.json")
    public Resource resource;


    public List<RawGearItem> readRawGear() {
        try {
            InputStream inputStream = resource.getInputStream();
            String fileContent = new String(inputStream.readAllBytes(), UTF_8);
            return RawGearParser.fromJsonString(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return emptyList();

    }
}
