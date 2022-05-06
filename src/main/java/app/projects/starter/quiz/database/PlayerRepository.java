package app.projects.starter.quiz.database;

import app.projects.starter.quiz.entities.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository <PlayerEntity, Long> {
}
