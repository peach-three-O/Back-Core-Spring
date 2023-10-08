package peachthreeo.backcore.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class EatenFood {

    @Id @GeneratedValue
    @Column(name = "eaten_food_id")
    private Long id;


}
