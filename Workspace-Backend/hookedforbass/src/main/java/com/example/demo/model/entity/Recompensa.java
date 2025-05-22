package com.example.demo.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recompensa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRecompensa;

	@NonNull
	private String nombre;

	@NonNull
	private String descripcion;

	@NonNull
	private Integer puntosRequeridos;

	@NonNull
	private String tipo;

	@NonNull
	private Integer valor;

	@NonNull
	private Boolean disponible;
}
