package exemplos.quatro;

public class NumeralRomano {

	public int converte(String numeralEmRomano) {
		int somaTotal = 0;
		int valorAnterior = 0;
		int valorAtual = 0;
		
		for (int i=0; i< numeralEmRomano.length(); i++) {
			
			valorAtual = getNumeralIndividual(numeralEmRomano.substring(i, i+1));
			
			// Se o valor atual for maior que o anterior então o retorno será o valor atual menos tudo que já somou
			if (valorAtual > valorAnterior) {
				somaTotal = valorAtual - somaTotal;
			} else {
				somaTotal += valorAtual;
			}
			
			valorAnterior = valorAtual;
		}
		
		return somaTotal;
	}

	private int getNumeralIndividual(String individual) {
		int retorno = 0;
		
		if ("I".equals(individual)) {
			retorno = 1;
 		} else if ("V".equals(individual)) {
 			retorno = 5;
 		} else if ("X".equals(individual)) {
 			retorno = 10;
 		} else if ("L".equals(individual)) {
 			retorno = 50;
 		} else if ("C".equals(individual)) {
 			retorno = 100;
 		} else if ("D".equals(individual)) {
 			retorno = 500;
 		} else if ("M".equals(individual)) {
 			retorno = 1000;
 		}
		
		return retorno;
	}
}
