package com.simos.FlixBus.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "viaggi")
public class Viaggio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idViaggi;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dataViaggio;
	private int numeroBiglietti;

	@ManyToOne
	@JoinColumn(name = "id_tratte")
	private Tratta tratta;

	@ManyToOne
	@JoinColumn(name = "id_utenti")
	private Utente utente;

	public Viaggio() {
		// TODO Auto-generated constructor stub
	}

	public Viaggio(int idViaggi, Date dataViaggio, int numeroBiglietti, Tratta tratta, Utente utente) {
		super();
		this.idViaggi = idViaggi;
		this.dataViaggio = dataViaggio;
		this.numeroBiglietti = numeroBiglietti;
		this.tratta = tratta;
		this.utente = utente;
	}

	public int getIdViaggi() {
		return idViaggi;
	}

	public void setIdViaggi(int idViaggi) {
		this.idViaggi = idViaggi;
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

	@Override
	public String toString() {
		return "Viaggio [idViaggi=" + idViaggi + ", dataViaggio=" + dataViaggio + ", numeroBiglietti=" + numeroBiglietti
				+ ", tratta=" + tratta + ", utente=" + utente + "]";
	}

	
}
