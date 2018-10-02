package com.practicasspringbootstrap.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practicasspringbootstrap.connection.Connector;
import com.practicasspringbootstrap.model.Producto;

@Controller
public class CRUDProductosController {
	
	private JdbcTemplate jdbcTemplate;
	
	public CRUDProductosController() {
		Connector conn = new Connector();
		this.jdbcTemplate = new JdbcTemplate(conn.connector());
	}
	
	@RequestMapping(value="/irAgregar")
	public ModelAndView irAgregar() {
		ModelAndView mav = new ModelAndView();
		Producto objProducto = new Producto();
		mav.addObject("command",objProducto);
		mav.addObject("Titulo","Agregar Producto");
		mav.addObject("Texto","Agregar");
		mav.setViewName("ProductosAgregarActualizar");
		return mav;
	}
	
	@RequestMapping(value="/irBuscarActualizar")
	public ModelAndView irActualizar() {
		ModelAndView mav = new ModelAndView();
		Producto objProducto = new Producto();
		mav.addObject("command", objProducto);
		mav.addObject("Titulo","Buscar para Actualizar Producto");
		mav.addObject("Texto","BuscarActualizar");
		mav.addObject("Texto2","Buscar para Actualizar");
		mav.addObject("Metodo","GET");
		mav.setViewName("ProductosBorrarConsultar");
		return mav;
	}
	
	@RequestMapping(value="/irBorrar")
	public ModelAndView irBorrar() {
		ModelAndView mav = new ModelAndView();
		Producto objProducto = new Producto();
		mav.addObject("command", objProducto);
		mav.addObject("Titulo","Borrar Producto");
		mav.addObject("Texto","Borrar");
		mav.addObject("Metodo","POST");
		mav.setViewName("ProductosBorrarConsultar");
		return mav;
	}
	
	@RequestMapping(value="/irConsultar")
	public ModelAndView irConsultar() {
		ModelAndView mav = new ModelAndView();
		Producto objProducto = new Producto();
		mav.addObject("command",objProducto);
		mav.addObject("Titulo","Consultar Producto");
		mav.addObject("Texto","Consultar");
		mav.addObject("Metodo","POST");
		mav.setViewName("ProductosBorrarConsultar");
		return mav;
	}
	
	@RequestMapping(value="/irConsultaGeneral")
	public ModelAndView irConsultaGeneral() {
		ModelAndView mav = new ModelAndView();
		String sql = "SELECT * FROM productos";
		List datos = this.jdbcTemplate.queryForList(sql);
		mav.addObject("datos",datos);
		mav.setViewName("MostrarProductos");
		return mav;
	}
	
	@RequestMapping(value="/Agregar", method = RequestMethod.POST)
	public ModelAndView agregar(Producto pro) {
		ModelAndView mav = new ModelAndView();
		String sql = "INSERT INTO productos(nombreProducto, marcaProducto, precioProducto) VALUE('"+
						pro.getNombreProducto()+"','"+pro.getMarcaProducto()+"',"+pro.getPrecioProducto()+")";
		this.jdbcTemplate.update(sql);
		String sql2 = "SELECT * FROM productos";
		List datos = this.jdbcTemplate.queryForList(sql2);
		mav.addObject("datos",datos);
		mav.setViewName("MostrarProductos");
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView buscarActualizar(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		int id = Integer.parseInt(request.getParameter("idProducto"));
		Producto pro = this.selectProducto(id);
		mav.addObject("command", pro);
		mav.addObject("Titulo","Actualizar Producto");
		mav.addObject("Texto","Actualizar");
		System.out.println(pro.getNombreProducto());
		System.out.println(pro.getIdProducto());
		mav.setViewName("ProductosAgregarActualizar");
		return mav;
	}
	public Producto selectProducto(int id) {
		Producto pro = new Producto();
		String sql = "SELECT * FROM productos WHERE idProducto = " + id;
		return (Producto) jdbcTemplate.query(sql, new ResultSetExtractor<Producto>() {
			public Producto extractData(ResultSet rs) throws SQLException, DataAccessException{
				if(rs.next()) {
					pro.setIdProducto(rs.getInt("idProducto"));
					pro.setNombreProducto(rs.getString("nombreProducto"));
					pro.setMarcaProducto(rs.getString("marcaProducto"));
					pro.setPrecioProducto(rs.getDouble("precioProducto"));
				}
				return pro;
			}
		});
	}
	
	@RequestMapping(value="/Actualizar", method = RequestMethod.POST)
	public ModelAndView actualizar(Producto pro) {
		ModelAndView mav = new ModelAndView();
		System.out.println(pro.getIdProducto());
		String sql = "UPDATE productos SET nombreProducto = '"+pro.getNombreProducto()+"' , "
							+ "marcaProducto = '"+pro.getMarcaProducto()+"', "
							+ "precioProducto = "+pro.getPrecioProducto()+" WHERE idProducto = " + pro.getIdProducto();
		this.jdbcTemplate.update(sql);
		String sql2 = "SELECT * FROM productos";
		List datos = this.jdbcTemplate.queryForList(sql2);
		mav.addObject("datos",datos);
		mav.setViewName("MostrarProductos");
		return mav;
	}
	
	@RequestMapping(value="/Borrar", method = RequestMethod.POST)
	public ModelAndView borrar(Producto pro) {
		ModelAndView mav = new ModelAndView();
		String sql = "DELETE FROM productos WHERE idProducto = " + pro.getIdProducto();
		this.jdbcTemplate.update(sql);
		String sql2 = "SELECT * FROM productos";
		List datos = this.jdbcTemplate.queryForList(sql2);
		mav.addObject("datos",datos);
		mav.setViewName("MostrarProductos");
		return mav;
	}
	
	@RequestMapping(value="/Consultar", method = RequestMethod.POST)
	public ModelAndView consultar(Producto pro) {
		ModelAndView mav = new ModelAndView();
		String sql = "SELECT * FROM productos WHERE idProducto = " + pro.getIdProducto();
		List datos = this.jdbcTemplate.queryForList(sql);
		mav.addObject("datos",datos);
		mav.setViewName("MostrarProductos");
		return mav;
	}
}
