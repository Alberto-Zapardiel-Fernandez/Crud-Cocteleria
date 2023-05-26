package com.curso.service;

import java.util.List;

import com.curso.model.Coctel;

public interface CoctelService {

	List<Coctel> cocteles();
	List<Coctel> cocteles(String nombre);
	Coctel buscarCoctel(int id);
	void altaCoctel(Coctel coctel);
	void actualizarCoctel(Coctel coctel);
	void eliminarCoctel(int id);
	String verIngredientes(int id);
}
