package br.gov.ba.pm.ge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.ba.pm.ge.domain.Nota;

public interface NotaRepository extends JpaRepository<Nota, Integer> {

}
