package com.curso.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "coctel")
public class Coctel {

	@Id
	private int id;
	private String nombre;
	private String creador;
	private String ingredientes;
	
	public Coctel(int id, String nombre, String creador,String ingredientes) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.creador = creador;
		this.ingredientes = ingredientes;
	}
	public Coctel() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	@Override
	public String toString() {
		return "Coctel [id=" + id + ", nombre=" + nombre + ", creador=" + creador + ", ingredientes=" + ingredientes
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(creador, id, ingredientes, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coctel other = (Coctel) obj;
		return Objects.equals(creador, other.creador) && id == other.id
				&& Objects.equals(ingredientes, other.ingredientes) && Objects.equals(nombre, other.nombre);
	}
	
	
}
