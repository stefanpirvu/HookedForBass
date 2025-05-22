package com.example.demo.model.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.model.entity.Cania;
import com.example.demo.model.repository.CaniaRepository;
import com.example.demo.model.response.CaniaResponse;

@Service
public class CaniaServiceImpl implements CaniaService {

	private final CaniaRepository caniaRepository;

	public CaniaServiceImpl(CaniaRepository caniaRepository) {
		super();
		this.caniaRepository = caniaRepository;
	}

	@Override
	public CaniaResponse verCanias() {
		List<Cania> listaDeCanias = caniaRepository.findAll();
		return new CaniaResponse("Lista de cañas obtenida", HttpStatus.OK, listaDeCanias);
	}

}
