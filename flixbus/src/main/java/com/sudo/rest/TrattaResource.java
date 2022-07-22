package com.sudo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sudo.entities.Tratta;
import com.sudo.services.TrattaService;

@RestController
@RequestMapping("/api")
public class TrattaResource {

	@Autowired
	private TrattaService trattaService;

	@GetMapping("/tratta")
	public List<Tratta> getTratte() {
		return this.trattaService.getTratte();
	}

	@GetMapping("/tratta/{id}")
	public Tratta getTrattaById(@PathVariable int id) {
		return this.trattaService.getTrattaById(id);
	}

	@PostMapping("/tratta")
	public Tratta addTratta(@RequestBody Tratta t) {
		return this.trattaService.save(t);
	}

	@PutMapping("/tratta")
	public Tratta updateTratta(@RequestBody Tratta t) {
		return this.trattaService.updateTratta(t);
	}

	@DeleteMapping("/tratta/{id}")
	public void deleteTratta(@PathVariable int id) {
		this.trattaService.deleteTratta(id);
	}

}
