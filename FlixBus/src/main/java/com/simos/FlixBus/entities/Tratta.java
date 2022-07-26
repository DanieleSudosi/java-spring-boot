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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tratte")
public class Tratta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTratta;
	private String descrizione;
	
	@JsonIgnore
	@OneToMany(mappedBy = "tratta", fetch = FetchType.LAZY)
	private Set<Viaggio> utenti = new HashSet<>();
	
	public Tratta() {
		// TODO Auto-generated constructor stub
	}


	public Tratta(int idTratta, String descrizione, Set<Viaggio> utenti) {
		super();
		this.idTratta = idTratta;
		this.descrizione = descrizione;
		this.utenti = utenti;
	}

	public int getId() {
		return idTratta;
	}

	public void setId(int idTratta) {
		this.idTratta = idTratta;
	}


	public String getDescrizione() {
		return descrizione;
	}



	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}



	public Set<Viaggio> getUtenti() {
		return utenti;
	}

	public void setUtenti(Set<Viaggio> utenti) {
		this.utenti = utenti;
	}


	@Override
	public String toString() {
		return "Tratta [id=" + idTratta + ", descrizione=" + descrizione + ", utenti=" + utenti + "]";
	}

	
	
	
}

