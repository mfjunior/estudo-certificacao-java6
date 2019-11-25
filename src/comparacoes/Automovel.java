package comparacoes;

public class Automovel {
	String nome;
	String descricao;
	int tamanho;
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
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}	
	
	public String toString() {
		return "\n\n Nome: "+ this.nome + "\n Descrição: " + this.descricao + "\n Tamanho: " + this.tamanho;
	}
	
}
