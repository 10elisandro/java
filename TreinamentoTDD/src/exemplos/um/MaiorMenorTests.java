package exemplos.um;

import org.junit.Assert;
import org.junit.Test;

public class MaiorMenorTests {

	@Test
	public void deveEntenderNumerosUmElemento() {
		
		MaiorMenor mm = new MaiorMenor();
		mm.encontra(new int[] {10});
		
		// Passa por parâmetro ao assertEquals o valor que deveria ser e o valor que ficou
		Assert.assertEquals(10, mm.getMaior());
		Assert.assertEquals(10, mm.getMenor());
	}	
	
	@Test
	public void deveEntenderNumerosEmOrdemCrescente() {
		
		MaiorMenor mm = new MaiorMenor();
		mm.encontra(new int[] {7,8,9,10});
		
		// Passa por parâmetro ao assertEquals o valor que deveria ser e o valor que ficou
		Assert.assertEquals(10, mm.getMaior());
		Assert.assertEquals(7, mm.getMenor());
	}
	
	@Test
	public void deveEntenderNumerosEmOrdemDecrescente() {
		
		MaiorMenor mm = new MaiorMenor();
		mm.encontra(new int[] {10,9,8,7});
		
		// Passa por parâmetro ao assertEquals o valor que deveria ser e o valor que ficou
		Assert.assertEquals(10, mm.getMaior());
		Assert.assertEquals(7, mm.getMenor());
	}	
	
	@Test
	public void deveEntenderNumerosComMaiorMenorPossivel() {
		
		MaiorMenor mm = new MaiorMenor();
		mm.encontra(new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE});
		
		// Passa por parâmetro ao assertEquals o valor que deveria ser e o valor que ficou
		Assert.assertEquals(Integer.MAX_VALUE, mm.getMaior());
		Assert.assertEquals(Integer.MIN_VALUE, mm.getMenor());
	}	
	
	@Test
	public void deveEntenderNumerosComRepetidos() {
		
		MaiorMenor mm = new MaiorMenor();
		mm.encontra(new int[] {10,10,7,7,8,8});
		
		// Passa por parâmetro ao assertEquals o valor que deveria ser e o valor que ficou
		Assert.assertEquals(10, mm.getMaior());
		Assert.assertEquals(7, mm.getMenor());
	}	
	
	@Test
	public void deveEntenderNumerosVazio() {
		
		MaiorMenor mm = new MaiorMenor();
		mm.encontra(new int[] {});
		
		// Passa por parâmetro ao assertEquals o valor que deveria ser e o valor que ficou
		Assert.assertEquals(0, mm.getMaior());
		Assert.assertEquals(0, mm.getMenor());
	}	
	
	@Test
	public void deveEntenderNumerosComQtdeImpar() {
		
		MaiorMenor mm = new MaiorMenor();
		mm.encontra(new int[] {11,7,9,5});
		
		// Passa por parâmetro ao assertEquals o valor que deveria ser e o valor que ficou
		Assert.assertEquals(11, mm.getMaior());
		Assert.assertEquals(5, mm.getMenor());
	}	

}