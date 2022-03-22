package com.sudo.alimenti.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sudo.alimenti.entities.Alimento;

@Repository
public interface AlimentoDAO extends JpaRepository<Alimento, Integer> {

	
}
