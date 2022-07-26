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

import com.simos.FlixBus.entities.Viaggio;
import com.simos.FlixBus.services.ViaggioService;

@RestController
@RequestMapping("/api")
public class ViaggioREST {
	
	@Autowired
	public ViaggioService viaggioService;
	
	@GetMapping("/viaggio")
	public List<Viaggio> getAllViaggi(){
		return viaggioService.getAllViaggi();
	}
	
	@GetMapping("/viaggio/{id}")
	public Viaggio getViaggioById(@PathVariable int id) {
		return viaggioService.getViaggioById(id);
	}
	
	
	@PostMapping("/viaggio")
	public String addViaggio(@RequestBody Viaggio viaggio) {
		System.out.println(viaggio);
		viaggioService.addViaggio(viaggio);
		return "{\"Viaggio\":\"Aggiunto\"}";
		
	}
	
	@PutMapping("/viaggio")
	public String updateViaggio(@RequestBody Viaggio viaggio) {
		viaggioService.updateViaggio(viaggio);
		return "Viaggio Aggiornato";
	}
	
	@DeleteMapping("/viaggio/{id}")
	public String removeViaggioById(@PathVariable int id) {
		viaggioService.deleteViaggio(id);
		return "Viaggio Cancellato";
	}

}
