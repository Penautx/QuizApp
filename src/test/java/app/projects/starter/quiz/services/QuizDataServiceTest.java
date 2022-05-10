package app.projects.starter.quiz.services;

import app.projects.starter.quiz.dto.CategoryQuestionCountInfoDto;
import app.projects.starter.quiz.frontend.Difficulty;
import org.junit.jupiter.api.Test;
import static app.projects.starter.quiz.frontend.Difficulty.*;

import java.util.Map;

import static app.projects.starter.quiz.frontend.Difficulty.EASY;
import static org.junit.jupiter.api.Assertions.*;

class QuizDataServiceTest {

    @Test
    void calculateEachDifficultyQuestionCount_basicEasy() {
        CategoryQuestionCountInfoDto categoryQuestionCount = new CategoryQuestionCountInfoDto(5,17,13);
        Map<Difficulty, Integer> result = QuizDataService.calculateEachDifficultyQuestionCount(20, EASY, categoryQuestionCount);

        assertEquals(5, result.get(EASY));
        assertEquals(15, result.get(MEDIUM));
        assertNull(result.get(HARD));
    }

}