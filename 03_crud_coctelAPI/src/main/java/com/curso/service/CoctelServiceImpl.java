package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.CoctelDAO;
import com.curso.model.Coctel;

@Service
public class CoctelServiceImpl implements CoctelService{

	@Autowired
	CoctelDAO dao;
	
	@Override
	public List<Coctel> cocteles() {
		return dao.findAll();
	}

	@Override
	public Coctel buscarCoctel(int id) {
		
		return dao.findById(id).orElse(null);
	}

	@Override
	public void altaCoctel(Coctel coctel) {
		dao.save(coctel);
	}

	@Override
	public void actualizarCoctel(Coctel coctel) {
		dao.save(coctel);
	}

	@Override
	public void eliminarCoctel(int id) {
		dao.deleteById(id);
	}

	@Override
	public String verIngredientes(int id) {
		return  dao.findById(id).get().getIngredientes();
	}

	@Override
	public List<Coctel> cocteles(String nombre) {
		return dao.buscarCoctelesPorNombre(nombre);
	}
	

}
