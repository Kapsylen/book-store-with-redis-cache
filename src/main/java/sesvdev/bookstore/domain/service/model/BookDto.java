package sesvdev.bookstore.domain.service.model;

import lombok.Builder;
import sesvdev.bookstore.infrastructure.entity.Book;

import java.util.function.Function;

@Builder
public record BookDto(
        Long id,
        String title,
        String isbn
){
    public static BookDto toBookDto(Book book) {
        return BookDto.builder()
                .id(book.getId())
                .title(book.getTitle())
                .isbn(book.getIsbn())
                .build();
    }
}
