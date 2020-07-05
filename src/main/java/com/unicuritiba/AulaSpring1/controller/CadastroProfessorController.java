package com.unicuritiba.AulaSpring1.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.unicuritiba.AulaSpring1.modelos.dao.Professor;
import com.unicuritiba.AulaSpring1.modelos.view.ProfessorViewModel;
import com.unicuritiba.AulaSpring1.repository.ProfessorRepository;

//Pra APIs: @RestController
@Controller
public class CadastroProfessorController {
	
	@Autowired
	private ProfessorRepository professorRepository;
	
	@RequestMapping(value="/cadastrar-professor", method = RequestMethod.GET)
	public ModelAndView index() {
		
		ModelAndView modelAndView = new ModelAndView("cadastrar-professor");
		modelAndView.addObject("professorViewModel", new ProfessorViewModel());
		return modelAndView;
		
	}
	
	@RequestMapping(value="/cadastrar-professor", method = RequestMethod.POST)
		public String submit(@ModelAttribute ProfessorViewModel professorViewModel) {
		
		Professor professor = new Professor(
											professorViewModel.getNome(),
											professorViewModel.getSobrenome(),
											professorViewModel.getCampus(),
											professorViewModel.getMatricula(),
											new Date());

		professorRepository.save(professor);
		return "redirect:/";
		
	}
}
