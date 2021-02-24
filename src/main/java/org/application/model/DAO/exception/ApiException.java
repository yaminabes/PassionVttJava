package model.DAO.exception;

public class ApiException extends Exception {
    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message) {
        super(message);
    }
}
