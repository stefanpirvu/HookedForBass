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
public class DetallesPedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDetallesPedido;

	@NonNull
	@ManyToOne
	private Pedido idPedido;

	@NonNull
	private String tipoProducto;

	@NonNull
	private Long idProducto;

	@NonNull
	private Integer cantidad;

	@NonNull
	private Double precioUnitario;
}
