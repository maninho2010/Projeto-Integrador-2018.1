package com.example.myproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.myproject.model.Comentario;
import com.example.myproject.model.Trabalhador;
import com.example.myproject.repository.ComentarioRepository;
import com.example.myproject.repository.TrabalhadorRepository;

@Controller
@RequestMapping("/comentarios")
public class ComentarioController {
	
	@Autowired
	private TrabalhadorRepository trabalhadorRepository;
	
	@Autowired
	private ComentarioRepository comentarioRepository;
	
	@PostMapping("/{login}")
	public String comentar(Comentario comentario, @PathVariable String login) {
		
		Trabalhador destinatario = trabalhadorRepository.getOne(login);
		Trabalhador remetente = trabalhadorRepository.getOne("maninho2010");
		comentario.setDestinatario(destinatario);
		comentario.setRemetente(remetente);
		//comentarioRepository.save(comentario);
		
		System.out.println(" >>> " + destinatario);
		System.out.println(" >>> " + remetente);
		
		comentarioRepository.save(comentario);
		
		return "redirect:/trabalhadores/" + login;
	}
	

}
