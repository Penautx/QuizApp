package app.projects.starter.quiz.frontend;

import lombok.Data;

import static app.projects.starter.quiz.frontend.Difficulty.*;

@Data
public class GameOptions {
    private int numberOfQuestions = 5;
    private Difficulty difficulty;
    private int categoryId;


}