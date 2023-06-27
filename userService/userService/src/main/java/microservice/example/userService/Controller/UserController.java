package microservice.example.userService.Controller;

import microservice.example.userService.Entity.User;
import microservice.example.userService.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController


@RequestMapping("/users")
public class UserController {
    @Autowired(required = true)
    private UserService userService;
    @PostMapping()
    public ResponseEntity< User> saveuser(@RequestBody User user){
        User user1= userService.saveUser(user);
        return ResponseEntity.ok(user1);
    }
    @GetMapping()
    public ResponseEntity<List<User>> getalluser(){
         List<User> user1= userService.getalluser();
        return  ResponseEntity.ok(user1);

    }
    @GetMapping("/{userid}")
    public ResponseEntity<User> getbyid(@PathVariable Long userid ){
        User user1=userService.getbyID(userid);
        return ResponseEntity.ok(user1);
    }
}
