package br.gov.ba.pm.ge.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.gov.ba.pm.ge.domain.ItemTurma;
import br.gov.ba.pm.ge.repository.ItemTurmaRepository;
import br.gov.ba.pm.ge.services.exceptions.DataIntegrityException;
import br.gov.ba.pm.ge.services.exceptions.ObjectNotFoundException;

@Service
public class ItemTurmaService {

	@Autowired
	private ItemTurmaRepository repo;

	public ItemTurma find(Integer id) {
		Optional<ItemTurma> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + ItemTurma.class.getName()));

	}
	
	public List<ItemTurma> findAll() {
		return repo.findAll();
	}
		
	
	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir um Item que possui registros");
		}
	}
}
