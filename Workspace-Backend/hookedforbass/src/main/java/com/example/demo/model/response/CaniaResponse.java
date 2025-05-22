package com.example.demo.model.response;

import org.springframework.http.HttpStatus;

public record CaniaResponse(String message, HttpStatus status, Object object) {

}
