package peachthreeo.backcore.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class BingoGame {

    @Id
    @GeneratedValue
    @Column(name = "bingo_game_id")
    private Long id;

    private BingoType bingoType;

    private int round;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "food_id")
    private Food food;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id")
    private Room room;
}
