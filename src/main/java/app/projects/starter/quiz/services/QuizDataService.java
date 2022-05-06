package app.projects.starter.quiz.services;

import app.projects.starter.quiz.dto.CategoriesDto;
import app.projects.starter.quiz.dto.QuestionsDto;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
@Log
public class QuizDataService {

    public void getQuizCategories() {

        RestTemplate restTemplate = new RestTemplate();
        CategoriesDto result = restTemplate.getForObject("https://opentdb.com/api_category.php", CategoriesDto.class);
        log.info("Quiz categories: " + result.getCategories());

    }

    public void getQuizQuestions() {
        RestTemplate restTemplate = new RestTemplate();

        URI uri = UriComponentsBuilder.fromHttpUrl("https://opentdb.com/api.php")
                .queryParam("amount" , 5)
                .queryParam("category", 23)
                .queryParam("difficulty","medium")
                .build().toUri();
        QuestionsDto result = restTemplate.getForObject(uri, QuestionsDto.class);
        log.info("Quiz questions: " + result.getResults());
    }
}
