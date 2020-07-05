package com.unicuritiba.AulaSpring1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.unicuritiba.AulaSpring1.modelos.view.TurmaViewModel;
import com.unicuritiba.AulaSpring1.repository.TurmaRepository;

public class CadastroTurmaController {
	
	@Autowired
	private TurmaRepository turmaRepository;
	
	@RequestMapping(value = "/cadastrar-turma",method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("cadastrar-turma");
		modelAndView.addObject("turmaViewModel", new TurmaViewModel());
		return modelAndView;
	}
	

}
