package app.projects.starter.quiz.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@ToString
@Entity(name = "PLAYERS")
public class PlayerEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;

    public PlayerEntity (String name){

        this.name = name;
    }

}
