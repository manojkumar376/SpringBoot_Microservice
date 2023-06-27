package microservice.example.userService.Service;

import microservice.example.userService.Entity.User;
//import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> getalluser();
    User getbyID(Long userid);



   // User getuser(String name);
}
