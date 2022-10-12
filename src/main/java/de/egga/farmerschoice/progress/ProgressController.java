package de.egga.farmerschoice.progress;

import de.egga.farmerschoice.toons.ToonService;
import de.egga.farmerschoice.toons.repository.ToonCategories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ProgressController {

    @Autowired
    ToonService toonService;

    @Autowired
    ProgressService progressService;

    @GetMapping("/earlysquads")
    public String showEarlySquads() throws IOException {

        ToonCategories categories = toonService.getCategories();

        return progressService.getMyEarlySquads(categories).toString();
    }
}
