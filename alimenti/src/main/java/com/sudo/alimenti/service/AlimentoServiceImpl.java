package com.sudo.alimenti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sudo.alimenti.dal.AlimentoDAO;
import com.sudo.alimenti.entities.Alimento;

@Service
public class AlimentoServiceImpl implements AlimentoService {

	@Autowired
	private AlimentoDAO repo;
	
	
	@Override
	public void addAlimento(Alimento a) {

		this.repo.save(a);
	}

	@Override
	public void updateAlimento(Alimento a) {

		this.repo.save(a);
	}

	@Override
	public void delAlimento(int id) {

		this.repo.deleteById(id);
	}

	@Override
	public Alimento getAlimentoById(int id) {
		if(this.repo.findById(id).isPresent())
		return this.repo.findById(id).get();
		else
		return new Alimento();
		
	}

	@Override
	public List<Alimento> getAlimenti() {
		return this.repo.findAll();
	}

	@Override
	public List<Alimento> getAlimentiByCategoria(String categoria) {

		
		return null;
		
	}

	@Override
	public List<Alimento> getAlimentiByEnergia(int min, int max) {
		// TODO Auto-generated method stub
		return null;
	}

}
