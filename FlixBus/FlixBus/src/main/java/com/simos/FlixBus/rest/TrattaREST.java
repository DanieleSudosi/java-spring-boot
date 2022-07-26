package com.simos.FlixBus.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simos.FlixBus.entities.Tratta;
import com.simos.FlixBus.services.TrattaService;

@RestController
@RequestMapping("/api")
public class TrattaREST {

	@Autowired
	public TrattaService trattaService;
	
	
	@GetMapping("/tratta")
	public List<Tratta> getAllTratte(){
		return trattaService.getAllTratte();
	}
	
	@GetMapping("/tratta/{id}")
	public Tratta getTrattaById(@PathVariable int id) {
		
		return trattaService.getTrattaById(id);
	}

	@PostMapping("/tratta")
	public String addTratta(@RequestBody Tratta tratta) {
		trattaService.addTratta(tratta);
		return "Tratta Aggiunta";
	}
	
	@PutMapping("/tratta")
	public String updateTratta(@RequestBody Tratta tratta) {
		trattaService.updateTratta(tratta);
		return "Tratta Aggiornata";
	}
	
	@DeleteMapping("/tratta/{id}")
	public String removeTratta(@PathVariable int id) {
		trattaService.deleteTratta(id);
		return "Tratta Cancellata";
	}
	
	
	
	
	
	
}
