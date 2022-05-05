package app.projects.starter.quiz.dto;

public class HealthCheckDto {

    private boolean status;
    private String message;

    public HealthCheckDto (boolean status, String message) {

        this.status = status;
        this.message = message;
    }

    public boolean isStatus () {
        return status;
    }

    public String getMessage () {
        return message;
    }
}
