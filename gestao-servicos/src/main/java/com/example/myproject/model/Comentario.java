package com.example.myproject.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Comentario {
	
	@Id
	private Long id;
	
	@ManyToOne
	private Usuario remetente;
	
	@ManyToOne
	private Trabalhador destinatario;
	
	private String mensagem;
	
	@OneToMany(mappedBy="comentario")
	private List<Resposta> respostas;
	
	
	public Usuario getRemetente() {
		return remetente;
	}
	public void setRemetente(Usuario remetente) {
		this.remetente = remetente;
	}
	public Trabalhador getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(Trabalhador destinatario) {
		this.destinatario = destinatario;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public List<Resposta> getRespostas() {
		return respostas;
	}
	public void setRespostas(List<Resposta> respostas) {
		this.respostas = respostas;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	

}
