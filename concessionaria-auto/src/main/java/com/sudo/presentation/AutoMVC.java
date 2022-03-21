package com.sudo.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sudo.service.AutoService;

@Controller
@RequestMapping("auto")
public class AutoMVC {

	@Autowired
	private AutoService service;
	
	@GetMapping
	public String getAll(Model m) {
		
		m.addAttribute("titolo", "Acquista le nostre migliori auto usate");
		return "elenco";
	}
	
	
	
}
