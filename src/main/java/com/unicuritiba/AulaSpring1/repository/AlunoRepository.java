package com.unicuritiba.AulaSpring1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unicuritiba.AulaSpring1.modelos.dao.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
		
}