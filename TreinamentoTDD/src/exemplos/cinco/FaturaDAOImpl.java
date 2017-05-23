package exemplos.cinco;

import java.util.Arrays;
import java.util.List;

public class FaturaDAOImpl implements FaturaDAO {
	
	public List<Fatura> todos() {
		// Código deveria efetuar o acesso ao banco de dados e retorna vários registros
		// Como não temos banco para teste estamos retornando 5 registros
		return Arrays.asList(new Fatura(1.99), new Fatura(2.99), new Fatura(3.99), new Fatura(4.99), new Fatura(5.99));
	}

	@Override
	public void atualiza(Fatura fatura) {
		// Código deveria fazer o acesso ao banco de dados para atualizar o registro
	}
}
