package hotelService.example.hotelService.Service;

import hotelService.example.hotelService.Entity.Hotel;
import hotelService.example.hotelService.ErrorResponse.ResourceNotFound;

import java.util.List;

public interface HotelService {

    Hotel createhotel(Hotel hotel);

   List< Hotel> getAllHotel();
    void deleteHotel(Long hotelid);

    Hotel getbyid(Long hoteid) ;
}
