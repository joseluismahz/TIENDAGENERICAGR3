package com.proyecto.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.models.ProductoDTO;

@Repository
public interface IProductoDAO extends MongoRepository<ProductoDTO, String>{ //mongorepository ya tiene incluido todo el CRUD y sus métodos

}
