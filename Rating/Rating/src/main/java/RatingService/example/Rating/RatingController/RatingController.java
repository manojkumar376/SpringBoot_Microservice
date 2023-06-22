package RatingService.example.Rating.RatingController;

import RatingService.example.Rating.Entity.Rating;
import RatingService.example.Rating.ratingService.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    @Autowired
    private RatingService ratingService;



       @PostMapping()
        public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
        Rating rating1= ratingService.createRating(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(rating1);

        }
        @GetMapping()
        public ResponseEntity<List<Rating>> getallrating(){
        List<Rating> rating1=ratingService.getallrating();
        return   ResponseEntity.status(HttpStatus.FOUND).body(rating1);
        }

        @GetMapping("/users/{userid}")
        public ResponseEntity<List<Rating>> getByUserid(@PathVariable Long userid){
        List<Rating> rating1=ratingService.getByUserid(userid);
        return ResponseEntity.status(HttpStatus.FOUND).body(rating1);
        }
        @GetMapping("/hotels/{hotelid}")
       public ResponseEntity<List<Rating>> getByHotelId(@PathVariable Long hotelid){
        List<Rating> rating1=ratingService.getByHotelid(hotelid);
        return ResponseEntity.status(HttpStatus.FOUND).body(rating1);
        }



}
