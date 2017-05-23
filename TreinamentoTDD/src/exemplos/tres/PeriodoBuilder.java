package exemplos.tres;

public class PeriodoBuilder {

	private int diaInicio = 1;
	private int diaFim = 30;
	private int periodicidade = 1;
	
	public PeriodoBuilder comDiaFimEPeriodicidade(int diaFim, int periodicidade) {
		this.diaFim = diaFim;
		this.periodicidade = periodicidade;
		return this;
	}
	
	public Periodo constroi() {
		return new Periodo(diaInicio, diaFim, periodicidade);
	}
}
