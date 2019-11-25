package comparacoes;

import java.math.BigDecimal;

public class Produto implements Comparable<Produto>{
	String nome;
	String descricao;
	BigDecimal preco;

	
	public int compareTo(Produto p) {
		return nome.compareTo(p.getNome());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}	
	
	public String toString() {
		return "\n\n Nome: "+ this.nome + "\n Descrição: " + this.descricao + "\n Preço: " + this.preco;
	}
	
	public static void main(String[] args) {
		System.out.println(new Produto());
	}
}
