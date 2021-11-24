package com.proyecto.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "db_usuarios")
public class UsuarioDTO {
	
	@Id
	private String _id;
	private long cedula_usuario;
	private String email_usuario;
	private String nombre_usuario;
	private String password_usuario;
	private String usuario;
	
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public long getCedula_usuario() {
		return cedula_usuario;
	}
	public void setCedula_usuario(long cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}
	public String getEmail_usuario() {
		return email_usuario;
	}
	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public String getPassword_usuario() {
		return password_usuario;
	}
	public void setPassword_usuario(String password_usuario) {
		this.password_usuario = password_usuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
}