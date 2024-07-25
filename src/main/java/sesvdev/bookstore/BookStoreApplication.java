package sesvdev.bookstore;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sesvdev.bookstore.infrastructure.AuthorRepository;
import sesvdev.bookstore.infrastructure.entity.Author;
import sesvdev.bookstore.infrastructure.entity.Book;
import sesvdev.bookstore.infrastructure.BookRepository;

@SpringBootApplication
public class BookStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookStoreApplication.class, args);
    }

    @Bean
    ApplicationRunner init(AuthorRepository authorRepository, BookRepository bookRepository) {
        return args -> {
            for (int i = 1; i <= 50; i++) {
                Author author = new Author();
                author.setName("Author " + i);
                authorRepository.save(author);

                Book book = new Book();
                book.setTitle("Book " + i);
                book.setIsbn("ISBN" + i);
                book.setAuthor(author);
                bookRepository.save(book);
            }
        };
    }

}
