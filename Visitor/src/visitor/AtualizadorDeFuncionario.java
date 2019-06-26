package visitor;

import concreteElement.Gerente;
import concreteElement.Telefonista;

public interface AtualizadorDeFuncionario {
	void atualiza(Gerente g);

	void atualiza(Telefonista t);
}
