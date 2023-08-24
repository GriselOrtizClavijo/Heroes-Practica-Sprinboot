package com.keepcoding.springboot.Model;

import java.util.Date;

public class CustomExceptionResponse {

    private String message;
    private Date date;
    private String details;

    public CustomExceptionResponse(String message, Date date, String details) {
        this.message = message;
        this.date = date;
        this.details = details;
    }

    public CustomExceptionResponse() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
