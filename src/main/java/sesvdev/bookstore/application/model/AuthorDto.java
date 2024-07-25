package sesvdev.bookstore.application.model;

import lombok.Builder;

@Builder
public record AuthorDto(
        Long id,
        String name
) {
}
