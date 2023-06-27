package microservice.example.userService.Service;

import microservice.example.userService.Entity.Rating;
import microservice.example.userService.Entity.User;
import microservice.example.userService.Exception.resourceNotFound;

import microservice.example.userService.Repositry.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceIMPL implements UserService{
    @Autowired(required = true)
    private UserRepo userRepo;
    @Autowired
    private RestTemplate restTemplate;



    @Override
    public User saveUser(User user) {

        return userRepo.save(user);
    }

    @Override
    public List<User> getalluser() {

        List<User> user=  userRepo.findAll();
        return user;
    }



    @Override
   public User getbyID(Long userid) {

        User user1=  userRepo.findById(userid).orElseThrow(() -> new resourceNotFound("user with id is not found" + userid));
       List<Rating> UserRating= restTemplate.getForObject("http://RATINGSERVICE/ratings/users/" +user1.getUserId(),ArrayList.class);
        user1.setRating( UserRating);
  return user1;


    }

}
