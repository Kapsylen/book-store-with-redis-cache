package sesvdev.bookstore.domain.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Long id) {
        super("Resource not found with id " + id);
    }
}