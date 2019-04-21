package br.gov.ba.pm.ge.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.gov.ba.pm.ge.domain.MatriculaNova;
import br.gov.ba.pm.ge.services.MatriculaNovaService;

@RestController
@RequestMapping(value="/matriculasnovas")
public class MatriculaNovaResource {
	
	@Autowired
	private MatriculaNovaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<MatriculaNova> find(@PathVariable Integer id) {
		MatriculaNova obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<MatriculaNova>> findAll() {
		List<MatriculaNova> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	

}
