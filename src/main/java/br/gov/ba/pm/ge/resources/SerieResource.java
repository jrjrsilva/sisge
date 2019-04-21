package br.gov.ba.pm.ge.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.gov.ba.pm.ge.domain.Aluno;
import br.gov.ba.pm.ge.domain.Serie;
import br.gov.ba.pm.ge.services.SerieService;

@RestController
@RequestMapping(value="/series")
public class SerieResource {
	
	@Autowired
	private SerieService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Serie> find(@PathVariable Integer id) {
		Serie obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Serie>> findAll() {
		List<Serie> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	

}
