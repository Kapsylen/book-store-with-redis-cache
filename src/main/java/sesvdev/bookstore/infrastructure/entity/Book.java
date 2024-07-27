package sesvdev.bookstore.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;
import sesvdev.bookstore.domain.service.model.BookDto;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String isbn;

    @ManyToOne
    private Author author;

    public static Book toBook(BookDto bookDto) {
        var book = new Book();
        book.setId(bookDto.getId());
        book.setTitle(bookDto.getTitle());
        book.setIsbn(bookDto.getIsbn());
        return book;
    }
}