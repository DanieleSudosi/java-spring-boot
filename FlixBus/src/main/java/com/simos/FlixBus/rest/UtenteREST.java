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

import com.simos.FlixBus.entities.Utente;
import com.simos.FlixBus.services.UtenteService;

@RestController
@RequestMapping("/api")
public class UtenteREST {

	@Autowired
	public UtenteService utenteService;
	
	@GetMapping("/utente")
	public List<Utente> getAllUtenti(){
		return utenteService.getAllUtenti();
	}
	
	@GetMapping("/utente/{id}")
	public Utente getUtenteById(@PathVariable int id) {
		return utenteService.getUtenteById(id);
	}
	
	
	
	@PostMapping("/utente")
	public String addUtente(@RequestBody Utente utente) {
		utenteService.addUtente(utente);
		return "Utente Aggiunto";
		
	}
	
	@PutMapping("/utente")
	public String updateUtente(@RequestBody Utente utente) {
		utenteService.updateUtente(utente);
		return "Utente Aggiornato";
	}
	
	@DeleteMapping("/utente/{id}")
	public String removeUtenteById(@PathVariable int id) {
		utenteService.deleteUtente(id);
		return "Utente Cancellato";
	}
}
