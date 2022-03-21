package com.sudo.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sudo.entities.Esame;
import com.sudo.entities.Studente;
import com.sudo.entities.StudentiEsami;

public interface StudentiEsamiDAO extends JpaRepository<StudentiEsami, Integer>{

	List<StudentiEsami> findStudenteByEsame(Esame e);
	List<StudentiEsami> findEsameByStudente(Studente s);
	
}
