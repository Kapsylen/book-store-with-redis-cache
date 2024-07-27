package sesvdev.bookstore.domain.service.model;

import lombok.Builder;
import lombok.Data;
import sesvdev.bookstore.infrastructure.entity.Book;

import java.io.Serializable;

@Builder
@Data
public class BookDto implements Serializable {
        Long id;
        String title;
        String isbn;

    public static BookDto toBookDto(Book book) {
        return BookDto.builder()
                .id(book.getId())
                .title(book.getTitle())
                .isbn(book.getIsbn())
                .build();
    }
}
