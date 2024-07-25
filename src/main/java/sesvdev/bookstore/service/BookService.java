package sesvdev.bookstore.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sesvdev.bookstore.application.model.BookDto;
import sesvdev.bookstore.infrastructure.entity.BookRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<BookDto> getAllBooks() {
      return   bookRepository.findAll().stream()
                .map(b -> BookDto.builder()
                        .id(b.getId())
                        .title(b.getTitle())
                        .isbn(b.getIsbn())
                        .build())
              .toList();
    }
}
