package com.simos.FlixBus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simos.FlixBus.entities.Viaggio;

@Repository
public interface ViaggioRepository extends JpaRepository<Viaggio, Integer> {
	

}
