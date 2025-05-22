package com.example.demo.model.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.response.CarreteResponse;
import com.example.demo.model.service.CarreteServiceImpl;

@RestController
@RequestMapping("carrete")
public class CarreteControllerImpl implements CarreteController {

	private final CarreteServiceImpl carreteServiceImpl;

	public CarreteControllerImpl(CarreteServiceImpl carreteServiceImpl) {
		super();
		this.carreteServiceImpl = carreteServiceImpl;
	}

	@Override
	@GetMapping("obtenerCarretes")
	public ResponseEntity<CarreteResponse> verCarretes() {
		CarreteResponse listaDeCarretes = carreteServiceImpl.verCarretes();
		return ResponseEntity.status(listaDeCarretes.status()).body(listaDeCarretes);
	}

}
