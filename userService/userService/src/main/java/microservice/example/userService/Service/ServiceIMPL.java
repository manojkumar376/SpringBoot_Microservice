package microservice.example.userService.Service;

import microservice.example.userService.Entity.User;
import microservice.example.userService.Exception.resourceNotFound;
import microservice.example.userService.Repositry.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceIMPL implements UserService{
    @Autowired
    private UserRepo userRepo;
    @Override
    public User saveUser(User user) {

        return userRepo.save(user);
    }

    @Override
    public List<User> getalluser() {

        List<User> user=  userRepo.findAll();
        if(user.isEmpty()){
          throw   new resourceNotFound("there are no users please add the users");
        }
        return user;
    }



    @Override
   public User getbyID(Long userid) {
        return userRepo.findById(userid).orElseThrow(() -> new resourceNotFound("user with id is not found" + userid));
    }

}
