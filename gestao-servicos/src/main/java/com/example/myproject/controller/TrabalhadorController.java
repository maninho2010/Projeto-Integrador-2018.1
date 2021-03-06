package com.example.myproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.myproject.model.Comentario;
import com.example.myproject.model.Trabalhador;
import com.example.myproject.repository.ComentarioRepository;
import com.example.myproject.repository.TrabalhadorRepository;

@Controller
@RequestMapping("/trabalhadores")
public class TrabalhadorController {
	
	@Autowired
	TrabalhadorRepository trabalhadorRepository;
	
	@Autowired
	ComentarioRepository comentarioRepository;
	
	
	@GetMapping("/{login}")
	public ModelAndView details(@PathVariable String login) {
		//TODO: Criar a página
		ModelAndView mv = new ModelAndView("trabalhadores/trabalhador-detalhes");
		Trabalhador trab = trabalhadorRepository.getOne(login);
		mv.addObject("trabalhador", trab);
		mv.addObject("comentario", new Comentario());
		mv.addObject("comentarios",comentarioRepository.findAllByDestinatario(trab));
		
		System.out.println("Lista" + comentarioRepository.findAllByDestinatario(trab));
		System.out.println(trab);
		return mv;
		
	}
}
