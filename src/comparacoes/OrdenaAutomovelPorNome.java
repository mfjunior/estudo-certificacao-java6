package comparacoes;

import java.util.Comparator;

public class OrdenaAutomovelPorNome implements Comparator<Automovel>{


	public int compare(Automovel o1, Automovel o2) {
		return o1.getNome().compareTo(o2.getNome());
	}

}
