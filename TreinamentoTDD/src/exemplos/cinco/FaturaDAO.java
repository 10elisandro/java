package exemplos.cinco;

import java.util.List;

public interface FaturaDAO {
	
	public List<Fatura> todos();

	public void atualiza(Fatura fatura);
}
