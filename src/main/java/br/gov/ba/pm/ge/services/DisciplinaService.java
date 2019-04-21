package br.gov.ba.pm.ge.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.gov.ba.pm.ge.domain.Disciplina;
import br.gov.ba.pm.ge.repository.DisciplinaRepository;
import br.gov.ba.pm.ge.services.exceptions.DataIntegrityException;
import br.gov.ba.pm.ge.services.exceptions.ObjectNotFoundException;

@Service
public class DisciplinaService {

	@Autowired
	private DisciplinaRepository repo;

	public Disciplina find(Integer id) {
		Optional<Disciplina> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Disciplina.class.getName()));

	}
	
	public List<Disciplina> findAll() {
		return repo.findAll();
	}
		
	
	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir um disciplina que possui registros");
		}
	}
}
