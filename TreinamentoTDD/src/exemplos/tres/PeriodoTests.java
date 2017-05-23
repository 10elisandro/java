package exemplos.tres;

import java.util.Arrays;

import org.junit.*;

public class PeriodoTests {

	private static PeriodoBuilder builder;
	private Periodo periodo;
	
	@BeforeClass
	public static void setupClass() {
		builder = new PeriodoBuilder();
	}
	
	@Test
	public void podeInicio1Fim1Periodicidade1() {
		periodo = builder.comDiaFimEPeriodicidade(1, 1).constroi();
		
		Assert.assertEquals(Arrays.asList(1), periodo.calcularPeriodicidades());
	}
	
	@Test
	public void podeInicio1Fim15Periodicidade7() {
		periodo = builder.comDiaFimEPeriodicidade(15, 7).constroi();
		
		Assert.assertEquals(Arrays.asList(1, 8, 15), periodo.calcularPeriodicidades());
	}
	
	@Test
	public void podeInicio1Fim15Periodicidade30() {
		periodo = builder.comDiaFimEPeriodicidade(15, 30).constroi();
		
		Assert.assertEquals(Arrays.asList(1), periodo.calcularPeriodicidades());
	}
	
	@Test
	public void podeInicio1Fim30Periodicidade1() {
		periodo = builder.comDiaFimEPeriodicidade(30, 1).constroi();
		
		Assert.assertEquals(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30), periodo.calcularPeriodicidades());
	}	
	
	@Test
	public void podeInicio1Fim7Periodicidade7() {
		periodo = builder.comDiaFimEPeriodicidade(7, 7).constroi();
		
		Assert.assertEquals(Arrays.asList(1), periodo.calcularPeriodicidades());
	}	
	
	@Test
	public void podeInicio1Fim30Periodicidade30() {
		periodo = builder.comDiaFimEPeriodicidade(30, 30).constroi();
		
		Assert.assertEquals(Arrays.asList(1), periodo.calcularPeriodicidades());
	}		
}