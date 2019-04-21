package br.gov.ba.pm.ge.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.gov.ba.pm.ge.domain.Nota;
import br.gov.ba.pm.ge.services.NotaService;

@RestController
@RequestMapping(value="/notas")
public class NotaResource {
	
	@Autowired
	private NotaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Nota> find(@PathVariable Integer id) {
		Nota obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Nota>> findAll() {
		List<Nota> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	

}
