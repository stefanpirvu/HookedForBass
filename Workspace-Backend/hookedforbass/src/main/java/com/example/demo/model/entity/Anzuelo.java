package com.example.demo.model.entity;

import jakarta.persistence.Entity;
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
public class Anzuelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAnzuelo;

	@NonNull
	private String tipo;

	@NonNull
	@ManyToOne
	private Marca idMarca;

	@NonNull
	private String modelo;

	@NonNull
	private Integer cantidadEnStock;

	@NonNull
	private Double precio;

	@NonNull
	private String imagenes;
}
