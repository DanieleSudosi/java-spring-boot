package com.sudo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sudo.entities.Tratta;
import com.sudo.repository.TrattaRepository;

@Service
public class TrattaService {

	@Autowired
	private TrattaRepository trattaRepository;

	public Tratta save(Tratta t) {
		return trattaRepository.save(t);
	}

	public List<Tratta> getTratte() {
		return trattaRepository.findAll();
	}

	public Tratta getTrattaById(int id) {
		return trattaRepository.findById(id).get();
	}

	public Tratta updateTratta(Tratta t) {
		return trattaRepository.save(t);
	}

	public void deleteTratta(int id) {
		trattaRepository.deleteById(id);
	}

}
