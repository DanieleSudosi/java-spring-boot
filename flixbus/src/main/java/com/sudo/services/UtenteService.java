package com.sudo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sudo.entities.Utente;
import com.sudo.repository.UtenteRepository;

@Service
public class UtenteService {

	@Autowired
	private UtenteRepository utenteRepository;

	public Utente save(Utente u) {
		return utenteRepository.save(u);
	}

	public List<Utente> getUtente() {
		return utenteRepository.findAll();
	}

	public Utente getUtenteById(int id) {
		return utenteRepository.findById(id).get();
	}

	public Utente updateUtente(Utente u) {
		return utenteRepository.save(u);
	}

	public void deleteUtente(int id) {
		utenteRepository.deleteById(id);
	}

}
