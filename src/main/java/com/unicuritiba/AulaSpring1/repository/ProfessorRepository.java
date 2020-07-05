package com.unicuritiba.AulaSpring1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unicuritiba.AulaSpring1.modelos.dao.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
