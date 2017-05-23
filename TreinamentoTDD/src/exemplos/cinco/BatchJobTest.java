package exemplos.cinco;

import java.util.Arrays;

import org.junit.Test;
import org.mockito.Mockito;

public class BatchJobTest {

	@Test
	public void deveChamarAtualiza3X() {
		Fatura f1 = new Fatura(FiltroDeFaturas.VALOR_MINIMO_FATURA + 0.01);
		Fatura f2 = new Fatura(FiltroDeFaturas.VALOR_MINIMO_FATURA);
		Fatura f3 = new Fatura(FiltroDeFaturas.VALOR_MINIMO_FATURA - 0.01);
		
		// Vamos efetuar a simulação do DAO, dizendo pra ele que não acesse o todos real pois efetua acesso ao banco e não queremos isso.
		FaturaDAO daoSimulado = Mockito.mock(FaturaDAOImpl.class);
		
		// Simular o retorno do método uma lista com 3 itens.
		Mockito.when(daoSimulado.todos()).thenReturn(Arrays.asList(f1, f2, f3));
		
		// Cria uma nova instância da classe passando o DAO simulado.
		BatchJob bj = new BatchJob(daoSimulado);
		bj.executa();
		
		// Verifica no DAO Simulado se foi chamado o atualiza do f1
		Mockito.verify(daoSimulado).atualiza(f1);
		
		// Verifica no DAO Simulado se foi chamado o atualiza do f2
		Mockito.verify(daoSimulado).atualiza(f2);
		
		// Verifica no DAO Simulado se foi chamado o atualiza do f3
		Mockito.verify(daoSimulado).atualiza(f3);
	}
	
}
