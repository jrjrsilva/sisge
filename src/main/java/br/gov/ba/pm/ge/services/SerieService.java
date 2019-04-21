package br.gov.ba.pm.ge.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.gov.ba.pm.ge.domain.Aluno;
import br.gov.ba.pm.ge.domain.Serie;
import br.gov.ba.pm.ge.repository.SerieRepository;
import br.gov.ba.pm.ge.services.exceptions.DataIntegrityException;
import br.gov.ba.pm.ge.services.exceptions.ObjectNotFoundException;

@Service
public class SerieService {

	@Autowired
	private SerieRepository repo;

	public Serie find(Integer id) {
		Optional<Serie> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Serie.class.getName()));

	}
	
	public List<Serie> findAll() {
		return repo.findAll();
	}
		
	
	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir um Aluno que possui registros");
		}
	}
}
