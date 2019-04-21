package br.gov.ba.pm.ge.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.gov.ba.pm.ge.domain.Matricula;
import br.gov.ba.pm.ge.domain.Serie;
import br.gov.ba.pm.ge.services.MatriculaService;

@RestController
@RequestMapping(value="/matriculas")
public class MatriculaResource {
	
	@Autowired
	private MatriculaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Matricula> find(@PathVariable Integer id) {
		Matricula obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Matricula>> findAll() {
		List<Matricula> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	

}
