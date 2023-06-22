package RatingService.example.Rating.ratingService;

import RatingService.example.Rating.Entity.Rating;
import RatingService.example.Rating.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceIMPL implements RatingService{
    @Autowired
    private Repository repository;


    @Override
    public Rating createRating(Rating rating) {
        return repository.save(rating);
    }

    @Override
    public List<Rating> getallrating() {
        return repository.findAll();
    }

    @Override
    public List<Rating> getByUserid(Long userid) {
        return repository.getByUserid(userid);
    }

    @Override
    public List<Rating> getByHotelid(Long hotelid) {
        return repository.getByHotelid(hotelid);
    }
}

