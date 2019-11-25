package chapter6;

import java.io.Serializable;

public class Produto implements Serializable{
	private Long id;
	private String nome;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
	
	public String toString() {
		return this.id + " - " + this.nome;
	}
}
