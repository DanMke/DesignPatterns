package element;

import visitor.AtualizadorDeFuncionario;

public interface Atualizavel {
	void aceita(AtualizadorDeFuncionario atualizador);
}
