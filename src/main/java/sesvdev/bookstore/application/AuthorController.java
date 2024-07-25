package sesvdev.bookstore.application;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sesvdev.bookstore.application.model.AuthorDto;
import sesvdev.bookstore.service.AuthorService;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping("/authors")
    public List<AuthorDto> getAllAuthors() {
        return authorService.getAllAuthors();
    }
}
