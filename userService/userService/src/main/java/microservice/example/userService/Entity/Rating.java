package microservice.example.userService.Entity;

import lombok.Data;

@Data
public class Rating {
    private Long ratingid;
    private Long userid;
    private Long hotelid;
    private int rating;
    private String remark;
    private String feedback;

}
