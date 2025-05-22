package com.example.demo.model.entity;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Converter
public class ConversorDeImagenes implements AttributeConverter<List<String>, String> {
    private final ObjectMapper objectMapper = new ObjectMapper();
    private static final String SEPARATOR = ",";

    @Override
    public String convertToDatabaseColumn(List<String> imagenes) {
        try {
            return imagenes == null ? null : objectMapper.writeValueAsString(imagenes);
        } catch (Exception e) {
            throw new RuntimeException("Error serializing imagenes", e);
        }
    }

    @Override
    public List<String> convertToEntityAttribute(String imagenes) {
        try {
            if (imagenes == null || imagenes.trim().isEmpty()) {
                return Collections.emptyList();
            }
            if (imagenes.startsWith("[")) {
                return objectMapper.readValue(imagenes, new TypeReference<List<String>>() {});
            }
            return Arrays.asList(imagenes.split(SEPARATOR));
        } catch (Exception e) {
            System.err.println("Error deserializing imagenes: " + imagenes + ". Error: " + e.getMessage());
            return Collections.emptyList();
        }
    }
}