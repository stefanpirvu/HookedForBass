package com.example.demo.model.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.response.CaniaResponse;
import com.example.demo.model.service.CaniaServiceImpl;

@RestController
@RequestMapping("cania")
public class CaniaControllerImpl implements CaniaController {

	private final CaniaServiceImpl caniaServiceImpl;

	public CaniaControllerImpl(CaniaServiceImpl caniaServiceImpl) {
		super();
		this.caniaServiceImpl = caniaServiceImpl;
	}

	@Override
	@GetMapping("obtenerCanias")
	public ResponseEntity<CaniaResponse> verCanias() {
		CaniaResponse listaDeCanias = caniaServiceImpl.verCanias();
		return ResponseEntity.status(listaDeCanias.status()).body(listaDeCanias);
	}

}
