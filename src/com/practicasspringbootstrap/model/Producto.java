package com.practicasspringbootstrap.model;

public class Producto {
	private int idProducto;
	private String nombreProducto;
	private String marcaProducto;
	private double precioProducto;

	public String getNombreProducto() {
		return nombreProducto;
	}
	
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	
	public String getMarcaProducto() {
		return marcaProducto;
	}
	
	public void setMarcaProducto(String marcaProducto) {
		this.marcaProducto = marcaProducto;
	}
	
	public double getPrecioProducto() {
		return precioProducto;
	}
	
	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
}
