package exemplos.cinco;

import java.util.ArrayList;
import java.util.List;

public class FiltroDeFaturas {
	
	public static final double VALOR_MINIMO_FATURA = 1000.00;
	private FaturaDAO faturaDAO;

	public FiltroDeFaturas(FaturaDAO faturaDAO) {
		this.faturaDAO = faturaDAO;
	}
	
	public List<Fatura> busca() {
		List<Fatura> listaFatura = new ArrayList<Fatura>();
		
		for (Fatura fatura : faturaDAO.todos()) {
			if (fatura.getValor() > VALOR_MINIMO_FATURA) {
				listaFatura.add(fatura);
			}
		}
		return listaFatura;
	}
	
}