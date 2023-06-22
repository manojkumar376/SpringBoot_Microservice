package microservice.example.userService.ErrorResponse;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Data
@Builder
//for error body
public class ErrorResponse {
    private String message;
    private boolean success;
    private HttpStatus status;
}
