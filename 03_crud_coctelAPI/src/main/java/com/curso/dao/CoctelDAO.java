package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.curso.model.Coctel;

public interface CoctelDAO extends JpaRepository<Coctel, Integer> {

	@Query(value = "Select * from coctel where nombre=?", nativeQuery=true)
	List<Coctel> buscarCoctelesPorNombre(String nombre);
}
