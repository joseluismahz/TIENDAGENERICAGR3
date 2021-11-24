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

import com.proyecto.models.ClienteDTO;
import com.proyecto.repositories.IClienteDAO;

@RestController
@CrossOrigin(origins = "*" , methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/db_clientes")
public class ClienteController {
	
	@Autowired
	private IClienteDAO repository;
	
	/*Metodo para agregar productos
	*/
	@PostMapping("/cliente")
	public ClienteDTO create(@Validated @RequestBody ClienteDTO p) {
		return repository.insert(p);
	}
	/*Metodo para listar los productos que estan alojados en la base de datos
	*/
	@GetMapping("/")
	public List<ClienteDTO> readAll() {
		return repository.findAll();
	}
	/*Metodo para actualizar los productos que estan alojados en la base de datos
	*/
	@PutMapping("/cliente/{id}")
	public ClienteDTO update(@PathVariable String id, @Validated @RequestBody ClienteDTO p) {
		return repository.save(p);
	}
	/*Metodo para eliminar un producto que esté alojado en la base de datos
	*/
	@DeleteMapping("/cliente/{id}")
	public void delete(@PathVariable String id ) {
		repository.deleteById(id);
	}
	
}
