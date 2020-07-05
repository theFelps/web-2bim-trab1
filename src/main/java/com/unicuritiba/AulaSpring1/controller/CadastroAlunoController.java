package com.unicuritiba.AulaSpring1.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.unicuritiba.AulaSpring1.modelos.dao.Aluno;
import com.unicuritiba.AulaSpring1.modelos.view.AlunoViewModel;
import com.unicuritiba.AulaSpring1.repository.AlunoRepository;



@Controller
public class CadastroAlunoController {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	
	@RequestMapping(value="/cadastrar-aluno", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("cadastrar-aluno");
		modelAndView.addObject("alunoViewModel",new AlunoViewModel());
		return modelAndView;
	}
	@RequestMapping(value = "/cadastrar-aluno", method = RequestMethod.POST)
		public String submit(@ModelAttribute AlunoViewModel alunoViewModel){
		
		Aluno aluno = new Aluno();
		aluno.setNome(alunoViewModel.getNome());
		aluno.setSobrenome(alunoViewModel.getSobrenome());
		aluno.setMatricula(alunoViewModel.getMatricula());
		aluno.setDataCriacao(new Date());	
		
		alunoRepository.save(aluno);
		
		return "redirect:/";
	}
}
