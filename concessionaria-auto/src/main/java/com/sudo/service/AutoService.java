package com.sudo.service;

import java.util.List;

import com.sudo.entities.Auto;

public interface AutoService {

	void addAuto(Auto a);
	List<Auto> getAll();
	Auto getOneById(int id);
	
}
