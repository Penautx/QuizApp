package app.projects.starter.quiz.rest;


import app.projects.starter.quiz.dto.HealthCheckDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthcheckRestController {


    @GetMapping
    public HealthCheckDto healthCheck() {

        return new HealthCheckDto(true, "It is working");
    }
}

