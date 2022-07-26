package com.simos.FlixBus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simos.FlixBus.entities.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Integer> {
	

}
