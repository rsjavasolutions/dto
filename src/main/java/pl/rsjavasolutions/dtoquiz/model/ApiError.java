package pl.rsjavasolutions.dtoquiz.model;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ApiError {

    private HttpStatus status;
    private String localDateTime;
    private String message;

    public ApiError() {
    }

    public ApiError(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
        localDateTime = getTime();
    }

    private String getTime(){
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return formatter.format(localDateTime);
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(String localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

