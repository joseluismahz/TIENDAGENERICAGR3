package com.proyecto.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.models.UsuarioDTO;



@Repository
public interface IUsuarioDAO extends MongoRepository<UsuarioDTO, String>{

}
