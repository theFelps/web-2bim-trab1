package com.unicuritiba.AulaSpring1.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.unicuritiba.AulaSpring1.modelos.dao.Aluno;
import com.unicuritiba.AulaSpring1.modelos.dao.Professor;
import com.unicuritiba.AulaSpring1.repository.AlunoRepository;


@Controller
public class InicialController {
	private Professor professor;
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@GetMapping("/")
	public ModelAndView index() {
		
		// acessou o BD e coletou o objeto professor
		professor = new Professor("Diego","Palma", "Agua Verde", "1321315", new Date());
		String turma = "ADS - Modulo C";
		
		List<Aluno> alunos = alunoRepository.findAll();
		
//		AlunoRepository.findById(id)
		
		
		ModelAndView view = new ModelAndView("index");
		view.addObject("turma",turma);
		view.addObject("professor",professor);
		view.addObject("alunos",alunos);
		return view;
		
	}
	
	@RequestMapping(path="/", method = RequestMethod.POST)
	public String submit() {
		return null;
	}
	
}


