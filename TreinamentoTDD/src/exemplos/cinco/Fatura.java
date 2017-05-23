package exemplos.cinco;

public class Fatura {
	
	private double valor;

	public Fatura(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	private void setValor(double valor) {
		this.valor = valor;
	}	

	public void registraValor() {
		setValor(getValor() + 1000.00);
	}
}