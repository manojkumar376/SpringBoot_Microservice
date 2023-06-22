package RatingService.example.Rating.ratingService;

import RatingService.example.Rating.Entity.Rating;

import java.util.List;

public interface RatingService {



       Rating createRating(Rating rating);

       List<Rating> getallrating();

       List<Rating> getByUserid(Long userid);

       List<Rating> getByHotelid(Long hotelid);
}
