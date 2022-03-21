package com.sudo.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sudo.dal.EsameDAO;
import com.sudo.dal.StudenteDAO;
import com.sudo.dal.StudentiEsamiDAO;
import com.sudo.entities.Esame;
import com.sudo.entities.Studente;
import com.sudo.entities.StudentiEsami;

@Service
public class ScuolaServiceImpl implements ScuolaService {

	@Autowired
	private StudenteDAO repoStudenti;
	
	@Autowired
	private EsameDAO repoEsami;
	
	@Autowired
	private StudentiEsamiDAO repoStudentiEsami;
	
	@Override
	public void addStudente(Studente s) {

		repoStudenti.save(s);
		
	}

	@Override
	public void addEsame(Esame e) {

		repoEsami.save(e);
		
	}

	@Override
	public void addStudenteEsame(StudentiEsami se) {

		repoStudentiEsami.save(se);
		
	}

	@Override
	public List<Studente> getStudenti() {
		
		return repoStudenti.findAll();
	}

	@Override
	public List<Esame> getEsami() {
		// TODO Auto-generated method stub
		return repoEsami.findAll();
	}

	@Override
	public List<StudentiEsami> getStudentiEsami() {
		// TODO Auto-generated method stub
		return repoStudentiEsami.findAll();
	}

	@Override
	public List<Esame> getEsameByStudente(Studente s) {
		// TODO Auto-generated method stub
		return repoStudentiEsami.findEsameByStudente(s).stream().map(e -> e.getEsame()).collect(Collectors.toList());
	}

	@Override
	public List<Studente> getStudenteByEsame(Esame e) {
		// TODO Auto-generated method stub
		return repoStudentiEsami.findStudenteByEsame(e).stream().map(s -> s.getStudente()).collect(Collectors.toList());
	}

	@Override
	public Studente getStudenteById(int id) {
		// TODO Auto-generated method stub
		return repoStudenti.findById(id).get();
	}

	@Override
	public Esame getEsameById(int id) {
		// TODO Auto-generated method stub
		return repoEsami.findById(id).get();
	}

}
