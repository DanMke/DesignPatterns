package observer;

import concreteSubject.Acao;

public interface AcaoObserver {
	void notificaAlteracao(Acao acao);
}
