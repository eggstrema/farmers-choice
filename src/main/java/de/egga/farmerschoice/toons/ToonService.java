package de.egga.farmerschoice.toons;

import de.egga.farmerschoice.toons.repository.ToonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToonService {

    @Autowired
    ToonRepository repository;

    public List<Toon> getAllPhoenixToons() {
        return repository.findAllPhoenixToons();
    }
}
