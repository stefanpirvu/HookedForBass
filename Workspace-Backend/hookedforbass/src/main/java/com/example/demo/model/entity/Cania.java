package com.example.demo.model.entity;

import java.util.List;

import com.example.demo.config.ConversorDeImagenes;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cania {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty
	private Long id_cania;

	@NonNull
	@JsonProperty
	private String tipo;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "id_marca", nullable = false)
	private Marca id_marca;

	@NonNull
	@JsonProperty
	private String modelo;

	@NonNull
	@JsonProperty
	private Double precio;

	@NonNull
	@JsonProperty
	private String pies;

	@NonNull
	@JsonProperty
	private String accion;

	@NonNull
	@JsonProperty
	private Integer cantidadEnStock;

	@NonNull
	@JsonProperty
	private String dureza;

	@NonNull
	@JsonProperty
	private String rangoPesoSeniuelos;

	@NonNull
	@Convert(converter = ConversorDeImagenes.class)
	@JsonProperty
	private List<String> imagenes;
}