package exemplos.quatro;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumeralRomanoTest {

	private NumeralRomano numeralRomano;

	@Before
	public void setup() {
		numeralRomano = new NumeralRomano();
	}
	
	@Test
	public void converteIndividual() {
		Assert.assertEquals(1, numeralRomano.converte("I"));
		Assert.assertEquals(5, numeralRomano.converte("V"));
		Assert.assertEquals(10, numeralRomano.converte("X"));
	}
	
	@Test
	public void converteII() {
		Assert.assertEquals(2, numeralRomano.converte("II"));
	}
	
	@Test
	public void converteIV() {
		Assert.assertEquals(4, numeralRomano.converte("IV"));
	}
	
	@Test
	public void converteIX() {
		Assert.assertEquals(9, numeralRomano.converte("IX"));
	}
	
	@Test
	public void converteXC() {
		Assert.assertEquals(90, numeralRomano.converte("XC"));
	}
	
	@Test
	public void converteDCCC() {
		Assert.assertEquals(800, numeralRomano.converte("DCCC"));
	}
}
