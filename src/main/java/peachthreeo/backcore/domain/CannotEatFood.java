package peachthreeo.backcore.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class CannotEatFood {

    @Id
    @GeneratedValue
    @Column(name = "cannot_eat_food_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "food_id")
    private Food food;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
