package it.bracaletti.progetto.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.bracaletti.progetto.model.Utente;
import it.bracaletti.progetto.repository.UtenteRepository;

@Component
public class BootstrapData implements CommandLineRunner{
	
	@Autowired
	private UtenteRepository utenteRepository;
	
	@Override
	public void run(String...args) throws Exception{
		
		Utente utenteEmanuele = new Utente("Emanuele", "Bracaletti");
		Utente utenteGiovanni = new Utente("Giovanni", "Omni");
		
		utenteRepository.save(utenteEmanuele);
		utenteRepository.save(utenteGiovanni);
		
	}
	
	

}
