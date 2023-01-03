package it.bracaletti.progetto.repository;

import org.springframework.data.repository.CrudRepository;

import it.bracaletti.progetto.model.Utente;

public interface UtenteRepository extends CrudRepository<Utente, Long> {

}
