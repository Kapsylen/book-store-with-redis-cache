package sesvdev.bookstore.domain.service;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import sesvdev.bookstore.domain.exception.ResourceNotFoundException;
import sesvdev.bookstore.domain.service.model.BookDto;
import sesvdev.bookstore.infrastructure.BookRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class BookService {

    private final BookRepository bookRepository;
    @SneakyThrows
    @Cacheable(value = "bookCache")
    public List<BookDto> getAllBooks() {
      log.info("Get all books from database");
      Thread.sleep(3000);
      return bookRepository.findAll().stream()
                .map(BookDto::toBookDto)
              .toList();
    }

    @Cacheable(value = "bookCache")
    @SneakyThrows
    public BookDto getBookById(Long id) {
        log.info("Get book by id {} from database", id);
        Thread.sleep(3000);
        return bookRepository.findById(id)
                .map(BookDto::toBookDto)
                .orElseThrow(() -> new ResourceNotFoundException(id));
    }
}
