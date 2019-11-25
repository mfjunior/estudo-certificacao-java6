package comparacoes;

import java.util.Comparator;

public class OrdenaAutomovelPorDescricao implements Comparator<Automovel>{
	
	@Override
	public int compare(Automovel o1, Automovel o2) {
		return o1.getDescricao().compareTo(o2.getDescricao());
	}

}
