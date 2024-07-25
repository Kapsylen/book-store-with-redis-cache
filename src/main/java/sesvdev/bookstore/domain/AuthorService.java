package sesvdev.bookstore.domain;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sesvdev.bookstore.domain.service.model.AuthorDto;
import sesvdev.bookstore.infrastructure.AuthorRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;

    public List<AuthorDto> getAllAuthors() {
        return authorRepository.findAll().stream()
                .map(AuthorDto::authorDto)
                .toList();
    }

}
