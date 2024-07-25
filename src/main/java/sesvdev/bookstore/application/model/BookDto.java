package sesvdev.bookstore.application.model;

import lombok.Builder;

@Builder
public record BookDto(
        Long id,
        String title,
        String isbn
){
}
