package hotelService.example.hotelService.ErrorResponse;

import lombok.Builder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@Builder
@RestControllerAdvice
@ResponseStatus
public class GlobalExceptionHandler  {

    @ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<ErrorResponse> ResourceNotFoundExceptionHandler(ResourceNotFound exp , WebRequest request){
        String message= exp.getMessage();
        ErrorResponse response= ErrorResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
        return new ResponseEntity<ErrorResponse>(response,HttpStatus.NOT_FOUND);

    }

}
