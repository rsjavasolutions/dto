package pl.rsjavasolutions.dtoquiz.exception;

public class InvalidNumberException extends RuntimeException {

    public InvalidNumberException(Integer id) {
        super("Invalid test number. Test number " + id + " does not exist.");
    }
}
