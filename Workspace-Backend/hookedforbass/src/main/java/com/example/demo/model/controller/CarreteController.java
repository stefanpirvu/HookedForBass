package com.example.demo.model.controller;

import org.springframework.http.ResponseEntity;

import com.example.demo.model.response.CarreteResponse;

public interface CarreteController {

	public ResponseEntity<CarreteResponse> verCarretes();
}
