package sesvdev.bookstore.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sesvdev.bookstore.infrastructure.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
