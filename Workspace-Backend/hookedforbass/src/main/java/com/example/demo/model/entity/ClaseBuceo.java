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
public class ClaseBuceo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClaseBuceo;

	@NonNull
	private String clase;
}
