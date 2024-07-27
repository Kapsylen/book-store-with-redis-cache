package sesvdev.bookstore.domain.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sesvdev.bookstore.infrastructure.entity.Book;

import java.io.Serializable;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
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
