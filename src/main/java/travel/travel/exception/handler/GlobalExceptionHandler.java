package travel.travel.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import travel.travel.exception.*;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ExeptionResponse notFoundExeption (NotFoundException notFoundException){
        return ExeptionResponse.builder()
                .httpStatus(HttpStatus.NOT_FOUND)
                .esceptionClassName(notFoundException.getClass().getSimpleName())
                .massage(notFoundException.getMessage())
                .build();
    }
    @ExceptionHandler(AlreadyExistException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ExeptionResponse alreadyExistException (AlreadyExistException alreadyExistException){
        return ExeptionResponse.builder()
                .httpStatus(HttpStatus.CONFLICT)
                .esceptionClassName(alreadyExistException.getClass().getSimpleName())
                .massage(alreadyExistException.getMessage())
                .build();
    }

    @ExceptionHandler(BadRequestExeption.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ExeptionResponse badRequestException (BadRequestExeption badRequestExeption){
        return ExeptionResponse.builder()
                .httpStatus(HttpStatus.BAD_REQUEST)
                .esceptionClassName(badRequestExeption.getClass().getSimpleName())
                .massage(badRequestExeption.getMessage())
                .build();
    }
    @ExceptionHandler(BadCredentialException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ExeptionResponse badCredentialException (BadCredentialException badCredentialException){
        return ExeptionResponse.builder()
                .httpStatus(HttpStatus.UNAUTHORIZED)
                .esceptionClassName(badCredentialException.getClass().getSimpleName())
                .massage(badCredentialException.getMessage())
                .build();
    }
    @ExceptionHandler(AccessDeniedException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ExeptionResponse accessDeniedException(AccessDeniedException accessDeniedException){
        return ExeptionResponse.builder()
                .httpStatus(HttpStatus.FORBIDDEN)
                .esceptionClassName(accessDeniedException.getClass().getSimpleName())
                .massage(accessDeniedException.getMessage())
                .build();
    }
}

