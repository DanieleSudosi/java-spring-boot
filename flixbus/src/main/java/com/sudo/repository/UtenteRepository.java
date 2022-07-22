package com.sudo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sudo.entities.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Integer>{
	

}
