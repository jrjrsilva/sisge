package br.gov.ba.pm.ge.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.gov.ba.pm.ge.domain.Turma;
import br.gov.ba.pm.ge.services.TurmaService;

@RestController
@RequestMapping(value="/turmas")
public class TurmaResource {
	
	@Autowired
	private TurmaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Turma> find(@PathVariable Integer id) {
		Turma obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Turma>> findAll() {
		List<Turma> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	

}
