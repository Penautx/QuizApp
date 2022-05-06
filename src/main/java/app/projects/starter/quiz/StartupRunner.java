package app.projects.starter.quiz;

import app.projects.starter.quiz.database.PlayerRepository;
import app.projects.starter.quiz.entities.PlayerEntity;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Component
@Log
public class StartupRunner implements CommandLineRunner {

    @Autowired
    private PlayerRepository playerRepository;


    @Override
    public void run(String...args) throws Exception {
        log.info ("Executing startup actions");
        playerRepository.save(new PlayerEntity("John"));
        playerRepository.save(new PlayerEntity("Jerzy"));
        playerRepository.save(new PlayerEntity("Jakub"));

        log.info("List of players from database:");
        List<PlayerEntity> playersFromDatabase = playerRepository.findAll();
        for (PlayerEntity player: playersFromDatabase) {
            log.info("Retrieved player: " + player);

        }
    }
}
