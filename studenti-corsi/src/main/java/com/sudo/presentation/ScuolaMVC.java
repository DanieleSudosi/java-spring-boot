package com.sudo.presentation;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sudo.entities.Esame;
import com.sudo.entities.Studente;
import com.sudo.entities.StudentiEsami;
import com.sudo.services.ScuolaService;

@Controller
@RequestMapping("")
public class ScuolaMVC {

	
	
	@Autowired
	private ScuolaService service;
	
	@GetMapping({"studenti", ""})
	public String getStudenti(Model m) {
		m.addAttribute("titolo", "Studenti");
		m.addAttribute("studenti",service.getStudenti());
		return "studenti";
	}
	
	@GetMapping("esami")
	public ModelAndView getEsami() {
		ModelAndView mav = new ModelAndView("esami");
		mav.addObject("esami", service.getEsami());
		mav.addObject("titolo", "Esami");
		return mav;
	}
	@GetMapping("studentiesami")
	public List<StudentiEsami> getStudentiEsami() {
		return service.getStudentiEsami();
	}
	
	@GetMapping("esamibystudente/{id}")
	public List<Esame> getEsamiByStudente(@PathVariable int id){
		return service.getEsameByStudente(service.getStudenteById(id));
	}
	@GetMapping("studentebyesame/{id}")
	public List<Studente> getStudenteByEsame(@PathVariable int id){
		return service.getStudenteByEsame(service.getEsameById(id));
	}
	
	@ResponseBody
	@PostMapping(value = "addvoto", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public StudentiEsami addVoto(StudentiEsami se) {
		service.addStudenteEsame(se);
		return se;
	}
	
	@ModelAttribute("etichette")
	public List<String> etichette(){
		return Arrays.asList("studenti","esami","corsi");
	}
	
}
