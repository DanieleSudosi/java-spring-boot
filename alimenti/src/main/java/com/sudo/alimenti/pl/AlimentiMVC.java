package com.sudo.alimenti.pl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sudo.alimenti.entities.Alimento;
import com.sudo.alimenti.service.AlimentoService;

@Controller
@RequestMapping({ "", "mvc" })
public class AlimentiMVC {

	@Autowired
	private AlimentoService service;

	// @RequestMapping(method = RequestMethod.GET)

	@GetMapping
	public String getAlimenti(Model m) {
		
		m.addAttribute("lista", this.service.getAlimenti());
		m.addAttribute("elenco alimenti");
		return "elenco";
	}

	@GetMapping("{id}")
	public ModelAndView getById(@PathVariable int id) {
		ModelAndView mav= new ModelAndView("dettaglio");
		mav.addObject("alimento",this.service.getAlimentoById(id));
		return mav;

	}
	
	@PostMapping
	public void addAlimento(@RequestBody Alimento a) {
		this.service.addAlimento(a);
		
	}
	@PostMapping
	public void updAlimento(@RequestBody Alimento a) {
		this.service.updateAlimento(a);
	}
	
	@DeleteMapping("{id}")
	public void deleteAlimento(@PathVariable int id) {
		this.service.delAlimento(id);
	}

}
