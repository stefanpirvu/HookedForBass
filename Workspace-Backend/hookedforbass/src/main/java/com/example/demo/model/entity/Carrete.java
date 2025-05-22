package com.example.demo.model.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Carrete {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty
	private Long id;

	@NonNull
	@JsonProperty
	private String tipo;

	@JsonBackReference
	@ManyToOne
	private Marca marca_id;

	@NonNull
	@JsonProperty
	private String modelo;

	@NonNull
	@JsonProperty
	private Double precio;

	@NonNull
	@JsonProperty
	private Integer tamanoBobina;

	@NonNull
	@JsonProperty
	private Integer cantidadEnStock;

	@NonNull
	@JsonProperty
	private String ratio;

	@NonNull
	@Enumerated(EnumType.STRING)
	@JsonProperty
	private LadoManivela ladoManivela;

	@NonNull
	@Convert(converter = ConversorDeImagenes.class)
	@JsonProperty
	private List<String> imagenes;
}