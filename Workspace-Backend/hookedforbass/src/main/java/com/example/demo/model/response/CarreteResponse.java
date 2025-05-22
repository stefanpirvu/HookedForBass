package com.example.demo.model.response;

import org.springframework.http.HttpStatus;

public record CarreteResponse(String message, HttpStatus status, Object object) {

}
