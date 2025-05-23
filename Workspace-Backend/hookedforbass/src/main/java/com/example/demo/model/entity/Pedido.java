package com.example.demo.model.entity;

import java.time.LocalDate;

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
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPedido;

	@NonNull
	@ManyToOne
	private Usuario idUsuario;

	@NonNull
	private LocalDate fecha;

	@NonNull
	private Boolean estado;

	@NonNull
	private Double total;

	@NonNull
	private Integer puntosGanados;
}
