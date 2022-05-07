package app.projects.starter.quiz.services;

import app.projects.starter.quiz.dto.QuestionsDto;
import app.projects.starter.quiz.frontend.GameOptions;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log
public class OngoingGameService {
    private GameOptions gameOptions;
    private int currentQuestionIndex;
    private int points;
    private List<QuestionsDto.QuestionDto> questions;

    @Autowired
    private QuizDataService quizDataService;

    public void init(GameOptions gameOptions) {
        this.gameOptions = gameOptions;
        this.currentQuestionIndex = 0;
        this.points = 0;

        this.questions = quizDataService.getQuizQuestions(gameOptions);
    }

    public int getCurrentQuestionIndex() {
        return currentQuestionIndex+1;
    }

    public int getTotalQuestionNumber() {
        return questions.size();
    }
    public String getCurrentQuestion() {
        QuestionsDto.QuestionDto dto = questions.get(currentQuestionIndex);
        return dto.getQuestion();
    }
}
