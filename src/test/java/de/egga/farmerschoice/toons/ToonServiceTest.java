package de.egga.farmerschoice.toons;

import de.egga.farmerschoice.toons.repository.ToonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class ToonServiceTest {

    @Mock
    ToonRepository repository;

    @InjectMocks
    ToonService service = new ToonService();

    @Test
    void service_fetches_toons_from_repository() {
        service.getCategories();
        verify(repository).readAllCategories();
    }

}