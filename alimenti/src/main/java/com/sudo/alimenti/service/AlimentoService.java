package com.sudo.alimenti.service;

import java.util.List;

import com.sudo.alimenti.entities.Alimento;

public interface AlimentoService {

	//modifica o agg database
	void addAlimento(Alimento a);
	void updateAlimento(Alimento a);
	void delAlimento(int id);
	
	
	//leggono il db e c'è un resulset
	Alimento getAlimentoById(int id);
	List<Alimento> getAlimenti();
	List<Alimento> getAlimentiByCategoria(String categoria);
	List<Alimento> getAlimentiByEnergia(int min, int max);
	
	
	
}
