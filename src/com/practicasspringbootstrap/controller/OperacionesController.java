package com.practicasspringbootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practicasspringbootstrap.model.Operaciones;


@Controller
public class OperacionesController {

	@RequestMapping("/irSuma")
	public ModelAndView irSuma() {
		ModelAndView MVSuma = new ModelAndView();
		Operaciones objOperaciones = new Operaciones(); //Se crea un objeto tipo operaciones
		MVSuma.addObject("command", objOperaciones);  //Manda el objeto con el que va a conocer los campos del form
		MVSuma.addObject("Titulo","Sumar Numeros");
		MVSuma.addObject("Titulo2","Sumar");
		MVSuma.setViewName("OperacionesResult");
		return MVSuma;
	}
	
	@RequestMapping("/irResta")
	public ModelAndView irResta() {
		ModelAndView MVResta = new ModelAndView();
		Operaciones objOperaciones = new Operaciones();
		MVResta.addObject("command", objOperaciones);
		MVResta.addObject("Titulo","Restar Numeros");
		MVResta.addObject("Titulo2","Restar");
		MVResta.setViewName("OperacionesResult");
		return MVResta;
	}
	
	@RequestMapping("/irMultiplicacion")
	public ModelAndView irMultuplicacion() {
		ModelAndView MVMul = new ModelAndView();
		Operaciones objOperaciones = new Operaciones();
		MVMul.addObject("command",objOperaciones);
		MVMul.addObject("Titulo","Multiplicar Numeros");
		MVMul.addObject("Titulo2","Multiplicar");
		MVMul.setViewName("OperacionesResult");
		return MVMul;
	}
	
	@RequestMapping("/irDivision")
	public ModelAndView irDivision() {
		ModelAndView MVDiv = new ModelAndView();
		Operaciones objOperaciones = new Operaciones();
		MVDiv.addObject("command",objOperaciones);
		MVDiv.addObject("Titulo","Dividir Numeros");
		MVDiv.addObject("Titulo2","Dividir");
		MVDiv.setViewName("OperacionesResult");
		return MVDiv;
	}
	
	
	
	@RequestMapping(value = "/irResultadoSumar", method= RequestMethod.POST)
	public String mostrarResultadoSumar(Operaciones ope, ModelMap model) {
		model.addAttribute("resultadito", ope.Sumar());
		return "Result";
	}

	@RequestMapping(value = "/irResultadoRestar", method = RequestMethod.POST)
	public String mostrarResultadoRestar(Operaciones ope, ModelMap model) {
		model.addAttribute("resultadito", ope.Restar());
		return "Result";
	}
	
	@RequestMapping(value = "/irResultadoMultiplicar", method = RequestMethod.POST)
	public String mostrarResultadoMultiplicar(Operaciones ope, ModelMap model) {
		model.addAttribute("resultadito",ope.Multiplicar());
		return "Result";
	}
	
	@RequestMapping(value = "/irResultadoDividir", method = RequestMethod.POST)
	public String mostrarResultadoDividir(Operaciones ope, ModelMap model) {
		model.addAttribute("resultadito",ope.Dividir());
		return "Result";
	}
}
