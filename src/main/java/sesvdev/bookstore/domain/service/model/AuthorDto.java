package sesvdev.bookstore.domain.service.model;

import lombok.Builder;
import sesvdev.bookstore.infrastructure.entity.Author;

@Builder
public record AuthorDto(
        Long id,
        String name
) {

    public static AuthorDto authorDto(Author author) {
        return AuthorDto.builder()
                .id(author.getId())
                .name(author.getName())
                .build();
    }
}
