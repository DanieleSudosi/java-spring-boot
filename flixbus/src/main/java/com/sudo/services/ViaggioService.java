package com.sudo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sudo.entities.Viaggio;
import com.sudo.repository.ViaggioRepository;

@Service
public class ViaggioService {

	@Autowired
	private ViaggioRepository viaggioRepository;

	public Viaggio save(Viaggio v) {
		return viaggioRepository.save(v);
	}

	public List<Viaggio> getViaggio() {
		return viaggioRepository.findAll();
	}

	public Viaggio getViaggioById(int id) {
		return viaggioRepository.findById(id).get();
	}

	public Viaggio updateViaggio(Viaggio v) {
		return viaggioRepository.save(v);
	}

	public void deleteViaggio(int id) {
		viaggioRepository.deleteById(id);
	}

}
