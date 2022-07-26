package com.simos.FlixBus.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simos.FlixBus.entities.Viaggio;
import com.simos.FlixBus.repository.ViaggioRepository;

@Service
public class ViaggioService {
	
	@Autowired
	public ViaggioRepository viaggioRepo;
	
	public List<Viaggio> getAllViaggi(){
		return viaggioRepo.findAll();
	}
	
	public Viaggio getViaggioById(int id) {
		return viaggioRepo.findById(id).get();
	}

	public void addViaggio (Viaggio viaggio) {
		viaggioRepo.save(viaggio);
	}
	
	public void updateViaggio(Viaggio viaggio) {
		viaggioRepo.save(viaggio);
	}
	
	public void deleteViaggio(int id) {
		viaggioRepo.deleteById(id);
	}
	
}
