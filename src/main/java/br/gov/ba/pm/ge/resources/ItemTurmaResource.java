package br.gov.ba.pm.ge.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.gov.ba.pm.ge.domain.ItemTurma;
import br.gov.ba.pm.ge.services.ItemTurmaService;

@RestController
@RequestMapping(value="/itensturmas")
public class ItemTurmaResource {
	
	@Autowired
	private ItemTurmaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<ItemTurma> find(@PathVariable Integer id) {
		ItemTurma obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<ItemTurma>> findAll() {
		List<ItemTurma> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	

}
