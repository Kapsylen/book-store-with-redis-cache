package sesvdev.bookstore.domain.service;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import sesvdev.bookstore.domain.exception.ResourceNotFoundException;
import sesvdev.bookstore.domain.service.model.AuthorDto;
import sesvdev.bookstore.infrastructure.AuthorRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class AuthorService {

    private final AuthorRepository authorRepository;

    @Cacheable(value = "authorCache")
    public List<AuthorDto> getAllAuthors() {
        return authorRepository.findAll().stream()
                .map(AuthorDto::toAuthorDto)
                .toList();
    }

    @Cacheable(value = "authorCache")
    @SneakyThrows
    public AuthorDto getAuthorById(Long id) {
        log.info("Get author by id {} from database", id);
        Thread.sleep(3000);
        return authorRepository.findById(id)
                .map(AuthorDto::toAuthorDto)
                        .orElseThrow(() -> new ResourceNotFoundException(id));
    }

}
