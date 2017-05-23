package exemplos.dois;

public class MaiorMenor {
	
	private int maior = Integer.MIN_VALUE;
	private int menor = Integer.MAX_VALUE;

	public void encontra(int[] numeros) {
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maior ) {
				setMaior(numeros[i]);
			} else		 // NÃO DEVERIA TER O ELSE NO CÓDIGO	
			if (numeros[i] < menor ) {
				setMenor(numeros[i]);
			}
		}
	}

	public int getMaior() {
		return maior;
	}

	public void setMaior(int maior) {
		this.maior = maior;
	}

	public int getMenor() {
		return menor;
	}

	public void setMenor(int menor) {
		this.menor = menor;
	}
}