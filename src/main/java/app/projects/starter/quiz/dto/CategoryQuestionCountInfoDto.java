package app.projects.starter.quiz.dto;

import app.projects.starter.quiz.frontend.Difficulty;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class CategoryQuestionCountInfoDto {
    @JsonProperty("category_id")
    private int categoryId;

    @JsonProperty("category_question_count")
    private CategoryQuestionCountDto categoryQuestionCount;

    @NoArgsConstructor
    @Getter
    @ToString
    @AllArgsConstructor
    public static class CategoryQuestionCountDto {
        @JsonProperty("total_question_count")
        private int totalQuestionCount;
        @JsonProperty("total_easy_question_count")
        private int totalEasyQuestionCount;
        @JsonProperty("total_medium_question_count")
        private int totalMediumQuestionCount;
        @JsonProperty("totalHardQuestionCount")
        private int totalHardQuestionCount;
    }

    public int getQuestionCountForDifficulty(Difficulty difficulty) {
        switch (difficulty) {
            case EASY:
                return categoryQuestionCount.totalEasyQuestionCount;
            case MEDIUM:
                return categoryQuestionCount.totalMediumQuestionCount;
            case HARD:
                return categoryQuestionCount.totalHardQuestionCount;
        }
        return 0;
    }
    public CategoryQuestionCountInfoDto(int easyQuestionCount, int mediumQuestionCount, int hardQuestionCount) {
        this.categoryQuestionCount = new CategoryQuestionCountDto(easyQuestionCount+mediumQuestionCount+hardQuestionCount,
                easyQuestionCount, mediumQuestionCount, hardQuestionCount);
    }
}
