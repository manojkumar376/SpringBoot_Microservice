package hotelService.example.hotelService.Entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "hotels")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long hotelid;
    private String name;
    private String location;

    public Hotel(){

    }
}
