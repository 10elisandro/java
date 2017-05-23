package exemplos.cinco;

public class BatchJob {
	
	private FaturaDAO faturaDAO;

	public BatchJob(FaturaDAO faturaDAO) {
		this.faturaDAO = faturaDAO;
	}
	
	public void executa() {
		for (Fatura fatura : faturaDAO.todos()) {
		
			fatura.registraValor();
			
			// Se comentar o código abaixo o @Test deveChamarAtualiza3X da BatchJobTest irá falhar indicando que não foi chamado o atualiza
			faturaDAO.atualiza(fatura);
		}
	}
}
