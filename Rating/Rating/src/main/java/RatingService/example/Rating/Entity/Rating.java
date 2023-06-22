package RatingService.example.Rating.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Rating")
public class Rating {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long ratingid;
    private Long userid;
    private Long hotelid;
    private int rating;
    private String feedback;
public Rating(){

}

}
