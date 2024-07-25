package sesvdev.bookstore.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sesvdev.bookstore.application.model.AuthorDto;
import sesvdev.bookstore.infrastructure.entity.AuthorRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;

    public List<AuthorDto> getAllAuthors() {
        return authorRepository.findAll().stream()
                .map(a -> AuthorDto.builder()
                        .id(a.getId())
                        .name(a.getName())
                        .build())
                .toList();
    }

}
