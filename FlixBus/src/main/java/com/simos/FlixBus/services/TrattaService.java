package com.simos.FlixBus.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simos.FlixBus.entities.Tratta;
import com.simos.FlixBus.repository.TrattaRepository;

@Service
public class TrattaService {

	@Autowired
	public TrattaRepository trattaRepo;
	
	public List<Tratta> getAllTratte(){
		return  trattaRepo.findAll();
	}
	
	public Tratta getTrattaById(int id) {
		return trattaRepo.findById(id).get();
	}
	
	public void addTratta(Tratta tratta) {
		trattaRepo.save(tratta);
	}
	
	public void updateTratta(Tratta tratta) {
		trattaRepo.save(tratta);
	}
	
	public void deleteTratta(int id) {
		trattaRepo.deleteById(id);
	}
}
