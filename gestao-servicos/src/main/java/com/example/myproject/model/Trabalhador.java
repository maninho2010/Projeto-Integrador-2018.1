package com.example.myproject.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("T")
public class Trabalhador extends Usuario{
	
	private static final long serialVersionUID = 1L;
	
	private Float rating;
	
	@ManyToOne
	private Categoria categoria;
	
	@OneToMany(mappedBy="destinatario")
	private List<Comentario> comentariosRecebidos;
	
	
	public Float getRating() {
		return rating;
	}
	public void setRating(Float rating) {
		this.rating = rating;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public List<Comentario> getComentariosRecebidos() {
		return comentariosRecebidos;
	}
	public void setComentariosRecebidos(List<Comentario> comentariosRecebidos) {
		this.comentariosRecebidos = comentariosRecebidos;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
