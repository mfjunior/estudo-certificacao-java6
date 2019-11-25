package comparacoes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenaTeste {

	public static void main(String[] args) {
/*		ArrayList<Automovel> veiculos = new ArrayList<Automovel>();
		OrdenaAutomovelPorDescricao ordenaPorDescricao = new OrdenaAutomovelPorDescricao();
		OrdenaAutomovelPorNome ordenaPorNome = new OrdenaAutomovelPorNome();		

		Automovel a1 = new Automovel();
		a1.setDescricao("Veículo pequeno bom para estacionar");
		a1.setNome("Corsa");
		a1.setTamanho(3);
		veiculos.add(a1);

		Automovel a2 = new Automovel();
		a2.setDescricao("Veículo médio bom para a família e cidade");
		a2.setNome("Parati");
		a2.setTamanho(4);
		veiculos.add(a2);

		Automovel a3 = new Automovel();
		a3.setDescricao("Veículo médio-grande bom para tudo");
		a3.setNome("Santana");
		a3.setTamanho(4);
		veiculos.add(a3);

		Automovel a4 = new Automovel();
		a4.setDescricao("Veículo grande bom para fazenda");
		a4.setNome("F-250");
		a4.setTamanho(5);
		veiculos.add(a4);

		System.out.println("Veículos sem ordenar: " + veiculos.toString());

		Collections.sort(veiculos, ordenaPorNome);		
		System.out.println("Veículos ordenados por nome: " + veiculos.toString());
		
		Collections.sort(veiculos, ordenaPorDescricao);		
		System.out.println("Veículos ordenados por descrição: " + veiculos.toString());
*/		
		
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		Produto p1 = new Produto();
		p1.setDescricao("DescricaGGGGG");
		p1.setNome("NomeGGGGG");
		p1.setPreco(new BigDecimal(15.000));
		produtos.add(p1);		
		
		Produto p2 = new Produto();
		p2.setDescricao("DescricaoLLLL");
		p2.setNome("NomeLLLL");
		p2.setPreco(new BigDecimal(7.000));
		produtos.add(p2);		

		Produto p3 = new Produto();
		p3.setDescricao("DescricaoEEEE");
		p3.setNome("NomeEEEE");
		p3.setPreco(new BigDecimal(77.000));
		produtos.add(p3);	
		
		System.out.println("Produtos sem ordenar: " + produtos);
		
		Collections.sort(produtos);
		
		System.out.println("Produtos ordenados: " + produtos);
	}
}
