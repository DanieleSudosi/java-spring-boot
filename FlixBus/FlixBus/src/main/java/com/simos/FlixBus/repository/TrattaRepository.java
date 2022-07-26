package com.simos.FlixBus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simos.FlixBus.entities.Tratta;

@Repository
public interface TrattaRepository extends JpaRepository<Tratta, Integer> {

	
	
	
	
}
