package com.sudo.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "viaggi")
public class Viaggio {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_viaggi")
	private int id;

	@Column(name = "data_viaggio")
	private Date dataViaggio;
	
	@Column(name ="numero_biglietti")
	private int numeroBiglietti;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_tratte")
    private Tratta tratta;
	
	@ManyToOne
    @JoinColumn(name="id_utenti", nullable=false)
    private Utente utente;
	
	
	public Tratta getTratta() {
		return tratta;
	}

	public void setTratta(Tratta tratta) {
		this.tratta = tratta;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataViaggio() {
		return dataViaggio;
	}

	public void setDataViaggio(Date dataViaggio) {
		this.dataViaggio = dataViaggio;
	}

	public int getNumeroBiglietti() {
		return numeroBiglietti;
	}

	public void setNumeroBiglietti(int numeroBiglietti) {
		this.numeroBiglietti = numeroBiglietti;
	}

	@Override
	public String toString() {
		return "Viaggio [id=" + id + ", dataViaggio=" + dataViaggio + ", numeroBiglietti=" + numeroBiglietti + "]";
	}
	
	
	
	
}
