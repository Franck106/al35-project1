package fr.eql.teama.catalogue.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AlreadyExistException extends RestException {
    public AlreadyExistException() {}
    public AlreadyExistException(String message){
        super(message);
    }
    public AlreadyExistException(Throwable cause) {
        super(cause);
    }
    public AlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }
}
