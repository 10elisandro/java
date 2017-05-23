package exemplos.dois;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MaiorMenorTests {

	private MaiorMenor maiorMenor;	
	
	@Before
	public void setup() {
		System.out.println("Setup antes do início do metodo");
		maiorMenor = new MaiorMenor();
	}
	
	@Test
	public void deveEntenderNumerosUmElemento() {
		
		maiorMenor.encontra(new int[] {10});
		
		// Passa por parâmetro ao assertEquals o valor que deveria ser e o valor que ficou
		assertEquals(10, maiorMenor.getMaior());
		assertEquals(10, maiorMenor.getMenor());
	}	
	
	@Test
	public void deveEntenderNumerosEmOrdemCrescente() {
		
		maiorMenor.encontra(new int[] {7,8,9,10});
		
		// Passa por parâmetro ao assertEquals o valor que deveria ser e o valor que ficou
		assertEquals(10, maiorMenor.getMaior());
		assertEquals(7, maiorMenor.getMenor());
	}
	
	@Test
	public void deveEntenderNumerosEmOrdemDecrescente() {
		
		maiorMenor.encontra(new int[] {10,9,8,7});
		
		// Passa por parâmetro ao assertEquals o valor que deveria ser e o valor que ficou
		assertEquals(10, maiorMenor.getMaior());
		assertEquals(7, maiorMenor.getMenor());
	}	
	
	@Test
	public void deveEntenderNumerosComMaiorMenorPossivel() {
		
		maiorMenor.encontra(new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE});
		
		// Passa por parâmetro ao assertEquals o valor que deveria ser e o valor que ficou
		assertEquals(Integer.MAX_VALUE, maiorMenor.getMaior());
		assertEquals(Integer.MIN_VALUE, maiorMenor.getMenor());
	}	
	
	@Test
	public void deveEntenderNumerosComRepetidos() {
		
		maiorMenor.encontra(new int[] {10,10,7,7,8,8});
		
		// Passa por parâmetro ao assertEquals o valor que deveria ser e o valor que ficou
		assertEquals(10, maiorMenor.getMaior());
		assertEquals(7, maiorMenor.getMenor());
	}	
	
	@Test
	public void deveEntenderNumerosVazio() {
		
		maiorMenor.encontra(new int[] {});
		
		// Passa por parâmetro ao assertEquals o valor que deveria ser e o valor que ficou
		assertEquals(0, maiorMenor.getMaior());
		assertEquals(0, maiorMenor.getMenor());
	}	
	
	@Test
	public void deveEntenderNumerosComQtdeImpar() {
		
		maiorMenor.encontra(new int[] {11,7,9,5});
		
		// Passa por parâmetro ao assertEquals o valor que deveria ser e o valor que ficou
		assertEquals(11, maiorMenor.getMaior());
		assertEquals(5, maiorMenor.getMenor());
	}	

}