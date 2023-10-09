package peachthreeo.backcore.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class User {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    private String email;

    private String password;

    @OneToMany(mappedBy = "user")
    private List<EatenFood> eatenFoods = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<CannotEatFood> cannotEatFoods = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<QNA> qnas = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<UserRoom> userRooms = new ArrayList<>();
}
