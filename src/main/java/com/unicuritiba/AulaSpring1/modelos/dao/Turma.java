package com.unicuritiba.AulaSpring1.modelos.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Turma implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	public String nome_modulo;
	
	@OneToMany(mappedBy = "turma")
	List<Aluno> alunos;
	
	@ManyToMany(mappedBy = "professor")


	public String getNome_modulo() {
		return nome_modulo;
	}
	public void setNome_modulo(String nome_modulo) {
		this.nome_modulo = nome_modulo;
	}
	
}
