package peachthreeo.backcore.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Food {

    @Id @GeneratedValue
    @Column(name = "food_id")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "food")
    private List<EatenFood> eatenFoods = new ArrayList<>();

    @OneToMany(mappedBy = "food")
    private List<CannotEatFood> cannotEatFoods = new ArrayList<>();

    @OneToMany(mappedBy = "food")
    private List<BingoGame> bingoGames = new ArrayList<>();
}
