package com.simos.FlixBus.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simos.FlixBus.entities.Utente;
import com.simos.FlixBus.repository.UtenteRepository;

@Service
public class UtenteService {

	@Autowired
	public UtenteRepository utenteRepo;
	
	public List<Utente> getAllUtenti(){
		return utenteRepo.findAll();
	}
	
	public Utente getUtenteById(int id) {
		return utenteRepo.findById(id).get();
	}
	
	public void addUtente(Utente utente) {
		utenteRepo.save(utente);
	}
	
	public void updateUtente(Utente utente) {
		utenteRepo.save(utente);
	}
	
	public void deleteUtente(int id) {
		utenteRepo.deleteById(id);
	}
	
}
