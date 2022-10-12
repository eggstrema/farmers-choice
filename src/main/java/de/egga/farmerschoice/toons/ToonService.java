package de.egga.farmerschoice.toons;

import de.egga.farmerschoice.toons.repository.ToonCategories;
import de.egga.farmerschoice.toons.repository.ToonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToonService {

    @Autowired
    ToonRepository repository;

    public ToonCategories getCategories() {
        return repository.readAllCategories();
    }
}
