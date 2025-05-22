package com.example.demo.config;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class ConversorDeImagenes implements AttributeConverter<List<String>, String> {
	private final ObjectMapper objectMapper = new ObjectMapper();

	@Override
	public String convertToDatabaseColumn(List<String> attribute) {
		try {
			return objectMapper.writeValueAsString(attribute);
		} catch (JsonProcessingException e) {
			throw new RuntimeException("Error al convertir la lista de imágenes a JSON", e);
		}
	}

	@Override
	public List<String> convertToEntityAttribute(String dbData) {
		try {
			return Arrays.asList(objectMapper.readValue(dbData, String[].class));
		} catch (JsonProcessingException e) {
			throw new RuntimeException("Error al convertir JSON a lista de imágenes", e);
		}
	}
}