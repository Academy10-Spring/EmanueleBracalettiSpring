package it.bracaletti.progetto.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import it.bracaletti.progetto.model.Utente;

public class FormUtente {
	
	private long id;
	
	@NotEmpty
	@Size(min = 2, max = 30)
	private String nome;
	
	@NotEmpty
	@Size(min = 2, max = 30)
	private String cognome;

	public FormUtente() {
		
	}
	
	public Utente getUtente() {
		Utente utente = new Utente();
		utente.setId(id);
		utente.setNome(nome);
		utente.setCognome(cognome);
		return utente;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	

}
