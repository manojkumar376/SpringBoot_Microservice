package hotelService.example.hotelService.Controller;

import hotelService.example.hotelService.Entity.Hotel;
import hotelService.example.hotelService.ErrorResponse.ResourceNotFound;
import hotelService.example.hotelService.Service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelservice;
    @PostMapping()
    public ResponseEntity<Hotel> createhotel(@RequestBody Hotel hotel){
        Hotel hotel1=hotelservice.createhotel(hotel);
        return ResponseEntity.ok(hotel1);

    }
    @GetMapping()
    public ResponseEntity<List<Hotel>> getAllHotel(){
        List<Hotel> hotel1=hotelservice.getAllHotel();
        return ResponseEntity.ok(hotel1);
    }
    @DeleteMapping("/{hotelid}")
    public void DeleteHotel(@PathVariable Long hotelid){

         hotelservice.deleteHotel(hotelid);

    }
    @GetMapping("/{hotelid}")
    public ResponseEntity< Hotel> getbyid(@PathVariable Long hoteid)  {
        Hotel hotel1=hotelservice.getbyid(hoteid);
        return ResponseEntity.ok(hotel1);
    }

}
