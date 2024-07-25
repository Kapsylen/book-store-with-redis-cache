package sesvdev.bookstore.domain.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sesvdev.bookstore.domain.service.model.BookDto;
import sesvdev.bookstore.infrastructure.BookRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
// todo cache this this to redis
    public List<BookDto> getAllBooks() {
      return bookRepository.findAll().stream()
                .map(BookDto::toBookDto)
              .toList();
    }
}
