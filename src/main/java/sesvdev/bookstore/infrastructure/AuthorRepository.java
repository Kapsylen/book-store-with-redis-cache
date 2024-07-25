package sesvdev.bookstore.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sesvdev.bookstore.infrastructure.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
