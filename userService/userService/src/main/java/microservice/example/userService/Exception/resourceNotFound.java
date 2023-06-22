package microservice.example.userService.Exception;


public class resourceNotFound  extends RuntimeException{
    public resourceNotFound(){
        super("Resource not found on server!!!");
    }

    public  resourceNotFound(String message){
        super(message);
    }
}
