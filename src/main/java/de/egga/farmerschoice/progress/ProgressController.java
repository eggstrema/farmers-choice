package de.egga.farmerschoice.progress;

import de.egga.farmerschoice.characters.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class ProgressController {

    @Autowired
    CharacterService characterService;

    @Autowired
    ProgressService progressService;

    @GetMapping("/phoenix")
    public String phoenix() throws IOException {

        List<String> phoenixIds = characterService.getPhoenixIds();

        return progressService.getMyProgress(phoenixIds);
    }
}
