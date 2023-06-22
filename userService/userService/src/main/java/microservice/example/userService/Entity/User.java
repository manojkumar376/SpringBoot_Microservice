package microservice.example.userService.Entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name = "micro_users")// for table name
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)// for auto increment
    @Column(name = "ID")
    private long userId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "EMAIL", length = 15)
    private String email;
    @Column(name = "DOB")
    private String dob;
    @Transient // it will not store it in database
    private List<Rating> rating;

    public User(){

    }
}