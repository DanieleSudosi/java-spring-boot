package com.sudo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sudo.entities.Tratta;

@Repository
public interface TrattaRepository extends JpaRepository<Tratta, Integer>{
	

}
