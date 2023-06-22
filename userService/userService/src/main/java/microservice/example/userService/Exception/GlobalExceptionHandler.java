package microservice.example.userService.Exception;

import microservice.example.userService.ErrorResponse.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(resourceNotFound.class)
    public ResponseEntity<ErrorResponse> ResourceNotFoundExceptionHandler(resourceNotFound exp){
        String message=exp.getMessage();
        ErrorResponse response=ErrorResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
        return  new ResponseEntity<ErrorResponse>(response,HttpStatus.NOT_FOUND);
    }
}
