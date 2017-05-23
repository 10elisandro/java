package exemplos.cinco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class FiltroDeFaturasTest {

	@Test
	public void eliminaTodasFaturasMenorMinimo() {
		Fatura f1 = new Fatura(FiltroDeFaturas.VALOR_MINIMO_FATURA + 0.01);
		Fatura f2 = new Fatura(FiltroDeFaturas.VALOR_MINIMO_FATURA);
		Fatura f3 = new Fatura(FiltroDeFaturas.VALOR_MINIMO_FATURA - 0.01);
		
		// Vamos efetuar a simulação do DAO, dizendo pra ele que não acesse o todos real pois efetua acesso ao banco e não queremos isso.
		FaturaDAO daoSimulado = Mockito.mock(FaturaDAOImpl.class);
		
		// Simular o retorno do método uma lista com 3 itens.
		Mockito.when(daoSimulado.todos()).thenReturn(Arrays.asList(f1, f2, f3));
		
		// Cria uma nova instância da classe passando o DAO simulado.
		FiltroDeFaturas fdf = new FiltroDeFaturas(daoSimulado);
		
		// Vai buscar as faturas (f1, f2 e f3).
		List<Fatura> faturas = fdf.busca();
		
		// Valida se a lista possui realmente 1 item.
		Assert.assertEquals(1, faturas.size());
		
		// Valida se o valor do item é realmente 1000.01.
		Assert.assertEquals(FiltroDeFaturas.VALOR_MINIMO_FATURA + 0.01, faturas.get(0).getValor(), 0.0001);
		
	}
	
	@Test
	public void listaVazia() {
		
		// Vamos efetuar a simulação do DAO, dizendo pra ele que não acesse o todos real pois efetua acesso ao banco e não queremos isso.
		FaturaDAO daoSimulado = Mockito.mock(FaturaDAOImpl.class);

		// Simular como retorno do método uma lista vazia.
		Mockito.when(daoSimulado.todos()).thenReturn(new ArrayList<Fatura>());
		
		// Cria uma nova instância da classe passando o DAO simulado.
		FiltroDeFaturas fdf = new FiltroDeFaturas(daoSimulado);
		
		// Vai buscar as faturas (lista vazia).
		List<Fatura> faturas = fdf.busca();
		
		// Valida se a lista não possui itens.
		Assert.assertEquals(0, faturas.size());
	}
	
	@Test
	public void nenhumaFaturaMaiorMinimo() {
		
		Fatura f1 = new Fatura(0.00);
		Fatura f2 = new Fatura(FiltroDeFaturas.VALOR_MINIMO_FATURA);
		
		// Vamos efetuar a simulação do DAO, dizendo pra ele que não acesse o todos real pois efetua acesso ao banco e não queremos isso.
		FaturaDAO daoSimulado = Mockito.mock(FaturaDAOImpl.class);
		
		// Simular o retorno do método uma lista com 2 itens (nenhum com valor maior que 1000).
		Mockito.when(daoSimulado.todos()).thenReturn(Arrays.asList(f1, f2));
		
		// Cria uma nova instância da classe passando o DAO simulado.
		FiltroDeFaturas fdf = new FiltroDeFaturas(daoSimulado);
		
		// Vai buscar as faturas (f1 e f2).
		List<Fatura> faturas = fdf.busca();
		
		// Valida se a lista não possui itens.
		Assert.assertEquals(0, faturas.size());
	}	
	
	@Test
	public void todas2FaturasMaiorMinimo() {
		
		Fatura f1 = new Fatura(Double.MAX_VALUE);
		Fatura f2 = new Fatura(FiltroDeFaturas.VALOR_MINIMO_FATURA + 0.01);
		
		// Vamos efetuar a simulação do DAO, dizendo pra ele que não acesse o todos real pois efetua acesso ao banco e não queremos isso.
		FaturaDAO daoSimulado = Mockito.mock(FaturaDAOImpl.class);
		
		// Simular o retorno do método uma lista com 2 itens (todos com valor maior que 1000).
		Mockito.when(daoSimulado.todos()).thenReturn(Arrays.asList(f1, f2));
		
		// Cria uma nova instância da classe passando o DAO simulado.
		FiltroDeFaturas fdf = new FiltroDeFaturas(daoSimulado);
		
		// Vai buscar as faturas (f1 e f2).
		List<Fatura> faturas = fdf.busca();
		
		// Valida se a lista possui 2 itens.
		Assert.assertEquals(2, faturas.size());
		
		// Valida se os valor dos itens estão corretos.
		Assert.assertEquals(Double.MAX_VALUE, faturas.get(0).getValor(), 0.0001);
		Assert.assertEquals(FiltroDeFaturas.VALOR_MINIMO_FATURA + 0.01, faturas.get(1).getValor(), 0.0001);
	}	
}
