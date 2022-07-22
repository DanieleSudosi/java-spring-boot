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

import com.sudo.entities.Utente;
import com.sudo.services.UtenteService;

@RestController
@RequestMapping("/api")
public class UtenteResource {

	@Autowired
	private UtenteService utenteService;

	@GetMapping("/utente")
	public List<Utente> getUtente() {
		return this.utenteService.getUtente();
	}

	@GetMapping("/utente/{id}")
	public Utente getUtenteById(@PathVariable int id) {
		return this.utenteService.getUtenteById(id);
	}

	@PostMapping("/utente")
	public Utente addUtente(@RequestBody Utente u) {
		return this.utenteService.save(u);
	}

	@PutMapping("/utente")
	public Utente updateUtente(@RequestBody Utente u) {
		return this.utenteService.updateUtente(u);
	}

	@DeleteMapping("utente/{id}")
	public void deleteUtente(@PathVariable int id) {
		this.utenteService.deleteUtente(id);
	}

}
