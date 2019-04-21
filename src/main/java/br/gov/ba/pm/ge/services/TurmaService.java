package br.gov.ba.pm.ge.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.gov.ba.pm.ge.domain.Turma;
import br.gov.ba.pm.ge.repository.TurmaRepository;
import br.gov.ba.pm.ge.services.exceptions.DataIntegrityException;
import br.gov.ba.pm.ge.services.exceptions.ObjectNotFoundException;

@Service
public class TurmaService {

	@Autowired
	private TurmaRepository repo;

	public Turma find(Integer id) {
		Optional<Turma> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Turma.class.getName()));

	}
	
	public List<Turma> findAll() {
		return repo.findAll();
	}
		
	
	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir um Turma que possui registros");
		}
	}
}
