package com.example.demo.model.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.model.entity.Carrete;
import com.example.demo.model.repository.CarreteRepository;
import com.example.demo.model.response.CarreteResponse;

@Service
public class CarreteServiceImpl implements CarreteService {
	private final CarreteRepository carreteRepository;

	public CarreteServiceImpl(CarreteRepository carreteRepository) {
		this.carreteRepository = carreteRepository;
	}

	@Override
	public CarreteResponse verCarretes() {
		List<Carrete> listaDeCarretes = carreteRepository.findAll();
		return new CarreteResponse("Lista de carretes obtenida", HttpStatus.OK, listaDeCarretes);
	}
}