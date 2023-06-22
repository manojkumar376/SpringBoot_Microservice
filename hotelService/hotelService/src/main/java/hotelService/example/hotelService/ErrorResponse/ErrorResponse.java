package hotelService.example.hotelService.ErrorResponse;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;
@Data
@Builder
public class ErrorResponse {
    public String message;
    public boolean success;
    public HttpStatus status;
}
