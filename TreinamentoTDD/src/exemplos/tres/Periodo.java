package exemplos.tres;

import java.util.ArrayList;
import java.util.List;

public class Periodo {
	
	private int diaInicio;
	private int diaFim;
	private int periodicidade;
	
	public Periodo(int diaInicio, int diaFim, int periodicidade) {
		this.diaInicio = diaInicio;
		this.diaFim = diaFim;
		this.periodicidade = periodicidade;
	}

	public List<Integer> calcularPeriodicidades() {
		List<Integer> lista = new ArrayList<Integer>();
		int diaFimAtual = diaInicio;
		
		do {
			lista.add(diaFimAtual);
			diaFimAtual += getPeriodicidade();
		} while (diaFimAtual <= getDiaFim());
		
		return lista;
	}

	public int getDiaInicio() {
		return diaInicio;
	}

	public int getDiaFim() {
		return diaFim;
	}

	public int getPeriodicidade() {
		return periodicidade;
	}
}