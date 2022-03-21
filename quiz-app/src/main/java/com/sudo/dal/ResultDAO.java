package com.sudo.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sudo.entities.Result;

public interface ResultDAO extends JpaRepository<Result, Integer>{

}
