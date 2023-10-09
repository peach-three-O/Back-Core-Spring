package peachthreeo.backcore.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class QNA {

    @Id
    @GeneratedValue
    @Column(name = "qna_id")
    private Long id;

    private QnaType qnaType;

    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
