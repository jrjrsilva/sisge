package br.gov.ba.pm.ge.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.gov.ba.pm.ge.domain.Nota;
import br.gov.ba.pm.ge.repository.NotaRepository;
import br.gov.ba.pm.ge.services.exceptions.DataIntegrityException;
import br.gov.ba.pm.ge.services.exceptions.ObjectNotFoundException;

@Service
public class NotaService {

	@Autowired
	private NotaRepository repo;

	public Nota find(Integer id) {
		Optional<Nota> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Nota.class.getName()));

	}
	
	public List<Nota> findAll() {
		return repo.findAll();
	}
		
	
	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir um Nota que possui registros");
		}
	}
}
