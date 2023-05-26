package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Coctel;
import com.curso.service.CoctelService;

@RestController
public class CoctelController {

	@Autowired
	CoctelService service;
	
	@GetMapping(value = "coctel", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Coctel> cocteles () {
		return service.cocteles();
	}
	@GetMapping(value = "coctel/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String verIngredientes(@PathVariable(name = "id") int id) {
		return service.verIngredientes(id);
	}
	@GetMapping(value = "cocteles/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Coctel> verIngredientes(@PathVariable(name = "nombre") String nombre) {
		return service.cocteles(nombre);
	}

	@PostMapping(value = "coctel", consumes = MediaType.APPLICATION_JSON_VALUE)
	void altaCoctel(@RequestBody Coctel coctel) {
		service.altaCoctel(coctel);
	}

	@PutMapping(value = "coctel", consumes = MediaType.APPLICATION_JSON_VALUE)
	void actualizarCoctel(@RequestBody Coctel coctel) {
		service.actualizarCoctel(coctel);
	}

	@DeleteMapping(value = "coctel/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void eliminarCoctel(@PathVariable(name = "id") int id) {
		 service.eliminarCoctel(id);
	}
}
