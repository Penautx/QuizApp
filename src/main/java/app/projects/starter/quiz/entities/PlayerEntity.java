package app.projects.starter.quiz.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "PLAYERS")
public class PlayerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;

    public PlayerEntity (String name){

        this.name = name;
    }

}
