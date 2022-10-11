package de.egga.farmerschoice.toon;

import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

public class ToonReader {

    public List<Toon> map(String fileContent) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        Toon[] myObjects = mapper.readValue(fileContent, Toon[].class);

        return List.of(myObjects);

    }
}
