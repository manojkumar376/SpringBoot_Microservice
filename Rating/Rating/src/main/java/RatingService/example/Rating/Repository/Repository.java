package RatingService.example.Rating.Repository;

import RatingService.example.Rating.Entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Rating,Long> {
    List<Rating> getByUserid(Long userid);

    List<Rating> getByHotelid(Long hotelid);
}
