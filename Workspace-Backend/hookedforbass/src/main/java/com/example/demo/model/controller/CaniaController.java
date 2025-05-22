package com.example.demo.model.controller;

import org.springframework.http.ResponseEntity;

import com.example.demo.model.response.CaniaResponse;

public interface CaniaController {

	public ResponseEntity<CaniaResponse> verCanias();
}
