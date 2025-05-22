package com.example.demo.model.entity;

import java.time.LocalDate;

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
public class TransaccionDePuntos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTransaccionDePuntos;

	@NonNull
	@ManyToOne
	private Usuario idUsuario;

	@NonNull
	@ManyToOne
	private Recompensa idRecompensa;

	@NonNull
	private Integer puntosUsados;

	@NonNull
	private LocalDate fecha;
}
