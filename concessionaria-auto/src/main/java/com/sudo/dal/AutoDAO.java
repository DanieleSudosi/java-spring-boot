package com.sudo.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sudo.entities.Auto;

public interface AutoDAO extends JpaRepository<Auto, Integer> {

}
