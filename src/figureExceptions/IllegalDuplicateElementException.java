package figureExceptions;

public class IllegalDuplicateElementException extends RuntimeException {
    public IllegalDuplicateElementException() {
    }

    public IllegalDuplicateElementException(String msg) {
        super(msg);
    }

    public IllegalDuplicateElementException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public IllegalDuplicateElementException(Throwable cause) {
        super(cause);
    }
}
