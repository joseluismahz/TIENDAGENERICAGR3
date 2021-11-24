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

import com.proyecto.models.UsuarioDTO;
import com.proyecto.repositories.IUsuarioDAO;


@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/db_usuarios")
public class UsuarioController {
	
	@Autowired
	private IUsuarioDAO repository;
	
	@PostMapping("/usuario")
	public UsuarioDTO create(@Validated @RequestBody UsuarioDTO p) {
		return repository.insert(p);
	}
	@GetMapping("/")
	public List<UsuarioDTO> readAll(){
		return repository.findAll();
	}
	
	@PutMapping("/usuario/{id}")
	public UsuarioDTO update(@PathVariable String id, @Validated @RequestBody UsuarioDTO p) {
		return repository.save(p);
	}
	
	@DeleteMapping("/usuario/{id}")
	public void delete(@PathVariable String id) {
		repository.deleteById(id);
	}
}






