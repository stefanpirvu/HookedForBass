package com.example.demo.model.entity;

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
public class Vinilo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVinilo;

	@NonNull
	@ManyToOne
	private Seniuelo idSeniuelo;

	@NonNull
	private String tipo;
}
