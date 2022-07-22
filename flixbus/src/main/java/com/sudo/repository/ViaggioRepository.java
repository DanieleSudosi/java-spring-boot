package com.sudo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sudo.entities.Viaggio;

@Repository
public interface ViaggioRepository extends JpaRepository<Viaggio, Integer>{
	

}
