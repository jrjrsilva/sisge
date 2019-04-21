package br.gov.ba.pm.ge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.ba.pm.ge.domain.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, String> {

}
