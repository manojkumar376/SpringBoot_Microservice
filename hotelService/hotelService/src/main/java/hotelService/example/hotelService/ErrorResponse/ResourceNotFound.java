package hotelService.example.hotelService.ErrorResponse;

import org.springframework.web.bind.annotation.ExceptionHandler;


public class ResourceNotFound extends RuntimeException{
    public ResourceNotFound(String s){
        super(s);

    }


    public ResourceNotFound(){
        super("Resource not found");
    }
}
