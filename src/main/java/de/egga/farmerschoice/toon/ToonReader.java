package de.egga.farmerschoice.toon;

import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

public class ToonReader {
    public List<Toon> map(String fileContent) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        //objectMapper.configure(FAIL_ON_UNKNOWN_PROPERTIES, false);
        Toon[] myObjects = objectMapper.readValue(fileContent, Toon[].class);

        return List.of(myObjects);

    }
}
