package concreteVisitor;

import concreteElement.Gerente;
import concreteElement.Telefonista;
import visitor.AtualizadorDeFuncionario;

public class AtualizadorSalarial implements AtualizadorDeFuncionario {
	public void atualiza(Gerente g) {
		g.setSalario(g.getSalario() * 1.43);
	}

	public void atualiza(Telefonista t) {
		t.setSalario(t.getSalario() * 1.27);
	}

}
