package com.practicasspringbootstrap.model;

import java.util.*;
import org.springframework.validation.annotation.*;


public class FormularioUsuario {
	private String nombre;
	private String apellido;
	private String correo;
	private String password;
	private String direccion;
	private String mensaje;
	
	public String getNombre() {
		return nombre;
	}
	
	public List<String> getLista(){
		List<String> milistita = new ArrayList<String>();
		milistita.add(getNombre());
		milistita.add(getApellido());
		milistita.add(getCorreo());
		milistita.add(getPassword());
		milistita.add(getDireccion());
		milistita.add(getMensaje());
		return milistita;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "FormularioUsuario [nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", password="
				+ password + ", direccion=" + direccion + ", mensaje=" + mensaje + "]";
	}
}
