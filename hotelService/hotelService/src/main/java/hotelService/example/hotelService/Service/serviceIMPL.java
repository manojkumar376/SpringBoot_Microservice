package hotelService.example.hotelService.Service;
import hotelService.example.hotelService.ErrorResponse.ResourceNotFound;
import hotelService.example.hotelService.Repository.repository;
import hotelService.example.hotelService.Entity.Hotel;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class serviceIMPL implements HotelService{


    @Autowired
    private repository repository;
    @Override
    public Hotel createhotel(Hotel hotel) {
        return repository.save(hotel);

    }

    @Override
    public List<Hotel> getAllHotel() {
        return repository.findAll();
    }

    @Override
    public void deleteHotel(Long hotelid) {


            repository.deleteById(hotelid);

    }

    @SneakyThrows
    @Override
    public Hotel getbyid(Long hoteid) {

            return repository.findById(hoteid).orElseThrow(() -> new ResourceNotFound("there is no hotel with id" + hoteid));

    }
}
