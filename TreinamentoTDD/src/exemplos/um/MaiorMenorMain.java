package exemplos.um;

public class MaiorMenorMain {

	// LISTA DE NÚMEROS QUE FUNCIONA
	static int[] listaNumerosOK = {15,7,8,18};
	
	// LISTA DE NÚMEROS QUE NÃO FUNCIONA
	static int[] listaNumerosErro = {7,8,9,10};
	
	public static void main(String[] args) {
		MaiorMenor mm = new MaiorMenor();
		mm.encontra(listaNumerosOK);
		
		System.out.println("Maior {15,7,8,18}: " + mm.getMaior());
		System.out.println("Menor {15,7,8,18}: " + mm.getMenor());
		
		mm = new MaiorMenor();
		mm.encontra(listaNumerosErro);
		
		System.out.println("Maior {7,8,9,10}: " + mm.getMaior());
		System.out.println("Menor {7,8,9,10}: " + mm.getMenor());
		
	}
}
