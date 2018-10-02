package com.practicasspringbootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practicasspringbootstrap.model.FormularioUsuario;

@Controller
public class FormularioController {	
	
	@RequestMapping("/irFormulario")
	public ModelAndView irFormulario() {
		ModelAndView MVFor = new ModelAndView();
		FormularioUsuario objFor = new FormularioUsuario();
		MVFor.addObject("command", objFor);
		MVFor.addObject("Titulo","Formulario");
		MVFor.setViewName("Formulario");
		return MVFor;
	}
	
	@RequestMapping(value = "/irFormularioResult", method = RequestMethod.POST)
	public String mostrarFormularioResult(FormularioUsuario formulario, ModelMap model) {
		model.addAttribute("Nombre", formulario.getNombre());
		model.addAttribute("Apellido",formulario.getApellido());
		model.addAttribute("Correo",formulario.getCorreo());
		model.addAttribute("Password",formulario.getPassword());
		model.addAttribute("Direccion",formulario.getDireccion());
		model.addAttribute("Mensaje",formulario.getMensaje());
		return "FormularioResult";
	}
}
