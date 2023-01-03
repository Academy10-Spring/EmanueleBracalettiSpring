package it.bracaletti.progetto.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import it.bracaletti.progetto.form.FormUtente;
import it.bracaletti.progetto.model.Utente;
import it.bracaletti.progetto.repository.UtenteRepository;

@Controller
public class WebController {
	
	@Autowired
	private UtenteRepository utenteRepository;

	@GetMapping("/")
	public String getHome(Model model) {
		
		List<Utente> listaUtenti = (List<Utente>) utenteRepository.findAll();
		model.addAttribute("utenti", listaUtenti);
		return "home";
	}
	
	@GetMapping("/utente")
	public String getFormUtente(FormUtente formUtente, Model model) {
		model.addAttribute("formUtente", formUtente);
		return "utente/form";
	}
	
	@PostMapping("/addUtente")
	public String addUtente(@Valid @ModelAttribute("formUtente") FormUtente formUtente, BindingResult bindingResult, Model model) {
		//Se errori, ricarico la pagina con gli errori
		if(bindingResult.hasErrors()) {
			return "utente/form";
		}
		
		utenteRepository.save(formUtente.getUtente());
		return "redirect:/";
	}
		
	}
