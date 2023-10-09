package peachthreeo.backcore.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Room {

    @Id
    @GeneratedValue
    @Column(name = "room_id")
    private Long id;

    private String name;

    private String inviteLink;

    @OneToMany(mappedBy = "room")
    private List<UserRoom> userRooms = new ArrayList<>();

    @OneToMany(mappedBy = "room")
    private List<BingoGame> bingoGames = new ArrayList<>();
}
