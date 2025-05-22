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
public class DetallesCarrito {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDetallesCarrito;

	@NonNull
	@ManyToOne
	private Carrito idCarrito;

	@NonNull
	private String tipoProducto;

	@NonNull
	private Integer cantidad;

	@NonNull
	private Double precioUnitario;
}
