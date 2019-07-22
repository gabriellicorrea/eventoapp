package com.eventosapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eventosapp.models.Evento;
import com.eventosapp.repository.EventoRepository;

@Controller
public class EventoController {
	@Autowired
	private EventoRepository er;
	
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.GET)
	private String form() {
		return "evento/formEvento";
	}
	
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.POST)
	private String form(Evento evento) {
		
		er.save(evento);
		
		return "redirect:/cadastrarEvento";
	}
}
