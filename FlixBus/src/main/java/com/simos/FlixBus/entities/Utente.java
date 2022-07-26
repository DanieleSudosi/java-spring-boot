package com.simos.FlixBus.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "utenti")
public class Utente {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUtenti;
	private String denominazione;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "utente", fetch = FetchType.LAZY)
	private Set<Viaggio> tratte = new HashSet<>();
	
	public Utente() {
		// TODO Auto-generated constructor stub
	}

	public Utente(int idUtenti, String denominazione) {
		super();
		this.idUtenti = idUtenti;
		this.denominazione = denominazione;
	}

	public int getId() {
		return idUtenti;
	}

	public void setId(int idUtenti) {
		this.idUtenti = idUtenti;
	}

	public String getDenominazione() {
		return denominazione;
	}

	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;
	}


	public Set<Viaggio> getTratte() {
		return tratte;
	}

	public void setTratte(Set<Viaggio> tratte) {
		this.tratte = tratte;
	}

	@Override
	public String toString() {
		return "utente [id=" + idUtenti + ", denominazione=" + denominazione + "]";
	}
	
	
	
}
