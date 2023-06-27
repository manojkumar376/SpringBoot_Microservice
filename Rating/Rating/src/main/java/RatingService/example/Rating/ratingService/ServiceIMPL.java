package RatingService.example.Rating.ratingService;

import RatingService.example.Rating.Entity.Hotel;
import RatingService.example.Rating.Entity.Rating;
import RatingService.example.Rating.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceIMPL implements RatingService{
    @Autowired
    private Repository repository;
    @Autowired
    private RestTemplate restTemplate;


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
        List<Rating> hotelrating= repository.getByHotelid(hotelid);


        //List<Hotel> hotel=restTemplate.getForObject("http://localhost:8082/hotels/"+hotelid,List.class);

        return hotelrating;
    }

    @Override
    public Optional<Rating> getbyid(long ratingid) {
        return repository.findById(ratingid);
    }
}

