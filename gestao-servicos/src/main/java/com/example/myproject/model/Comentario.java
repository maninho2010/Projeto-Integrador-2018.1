package com.example.myproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comentario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private Usuario remetente;
	
	@ManyToOne
	private Trabalhador destinatario;
	
	private String mensagem;
	
	@Override
	public String toString() {
		return "Comentario [id=" + id + ", remetente=" + remetente + ", destinatario=" + destinatario + ", mensagem="
				+ mensagem + "]";
	}
	
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	

}
