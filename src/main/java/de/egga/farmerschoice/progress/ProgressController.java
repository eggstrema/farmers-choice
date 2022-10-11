package de.egga.farmerschoice.progress;

import de.egga.farmerschoice.toons.Toon;
import de.egga.farmerschoice.toons.ToonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class ProgressController {

    @Autowired
    ToonService toonService;

    @Autowired
    ProgressService progressService;

    @GetMapping("/phoenix")
    public String phoenix() throws IOException {

        List<Toon> phoenixes = toonService.getAllPhoenixToons();

        return progressService.getMyPhoenixProgress(phoenixes);
    }
}
