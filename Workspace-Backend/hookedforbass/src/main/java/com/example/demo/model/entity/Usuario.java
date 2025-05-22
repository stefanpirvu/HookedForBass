package com.example.demo.model.entity;

import jakarta.persistence.Column;
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
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;

	@NonNull
	private String nombre;

	@NonNull
	private String apellido;

	@NonNull
	private String direccion;

	@NonNull
	private String ciudad;

	@NonNull
	private String codigoPostal;

	@NonNull
	private String pais;

	@NonNull
	@Column(unique = true)
	private String correo;

	@NonNull
	private String contrasena;

	@NonNull
	@ManyToOne
	private Rol idRol;
}
