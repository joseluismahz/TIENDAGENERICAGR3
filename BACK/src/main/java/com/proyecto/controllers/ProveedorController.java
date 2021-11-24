package com.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.models.ProveedorDTO;
import com.proyecto.repositories.IProveedorDAO;




@RestController
@CrossOrigin(origins = "*" , methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/db_proveedores")

public class ProveedorController {
	
	
	@Autowired
	private IProveedorDAO repository;
	
	/*Metodo para agregar proveedores
	*/
	@PostMapping("/proveedor")
	public ProveedorDTO create(@Validated @RequestBody ProveedorDTO p) {
		return repository.insert(p);
	}
	/*Metodo para listar proveedores
	*/
	@GetMapping("/")
	public List<ProveedorDTO> readAll() {
		return repository.findAll();
	}
	/*Metodo para actualizar proveedores
	*/
	@PutMapping("/proveedor/{id}")
	public ProveedorDTO update(@PathVariable String id, @Validated @RequestBody ProveedorDTO p) {
		return repository.save(p);
	}
	/*Metodo para eliminar proveedores
	*/
	@DeleteMapping("/proveedor/{id}")
	public void delete(@PathVariable String id ) {
		repository.deleteById(id);
	}
	
}