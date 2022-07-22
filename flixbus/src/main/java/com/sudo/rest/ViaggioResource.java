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
import com.sudo.entities.Viaggio;
import com.sudo.services.TrattaService;
import com.sudo.services.ViaggioService;

@RestController
@RequestMapping("/api")
public class ViaggioResource {

	@Autowired
	private ViaggioService viaggioService;

	@GetMapping("/viaggi")
	public List<Viaggio> getViaggi() {
		return this.viaggioService.getViaggio();
	}

	@GetMapping("/viaggi/{id}")
	public Viaggio getViaggioById(@PathVariable int id) {
		return this.viaggioService.getViaggioById(id);
	}

	@PostMapping("/viaggi")
	public Viaggio addViaggio(@RequestBody Viaggio v) {
		return this.viaggioService.save(v);
	}

	@PutMapping("/viaggi")
	public Viaggio updateViaggio(@RequestBody Viaggio v) {
		return this.viaggioService.updateViaggio(v);
	}

	@DeleteMapping("/viaggi/{id}")
	public void deleteViaggio(@PathVariable int id) {
		this.viaggioService.deleteViaggio(id);
	}

}
