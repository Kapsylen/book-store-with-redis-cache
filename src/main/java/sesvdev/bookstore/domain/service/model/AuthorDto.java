package sesvdev.bookstore.domain.service.model;

import lombok.Builder;
import lombok.Data;
import sesvdev.bookstore.infrastructure.entity.Author;

import java.io.Serializable;

@Builder
@Data
public class AuthorDto implements Serializable {
        Long id;
        String name;


    public static AuthorDto authorDto(Author author) {
        return AuthorDto.builder()
                .id(author.getId())
                .name(author.getName())
                .build();
    }
}
