package sesvdev.bookstore.domain.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sesvdev.bookstore.infrastructure.entity.Author;

import java.io.Serializable;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDto implements Serializable {
        Long id;
        String name;

    public static AuthorDto toAuthorDto(Author author) {
        return AuthorDto.builder()
                .id(author.getId())
                .name(author.getName())
                .build();
    }
}
