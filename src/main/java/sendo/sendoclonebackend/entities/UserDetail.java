package sendo.sendoclonebackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;
    private String avatar;
    private String name;
    private String username;
    private String password;
    private String email;
    private String telephone;
    private LocalDate birthday;
    private LocalDate joinDate;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user")
    @JsonIgnore
    private Cart cart;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    @JsonIgnore
    private List<OrderDetail> orderDetails;
}
