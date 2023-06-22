package hotelService.example.hotelService.Repository;

import hotelService.example.hotelService.Entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repository extends JpaRepository<Hotel,Long> {

}
