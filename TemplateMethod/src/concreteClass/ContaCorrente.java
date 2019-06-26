package concreteClass;

import abstractClass.Conta;

public class ContaCorrente extends Conta {
	@Override
	public double calculaTaxa() {
		return 3;
	}
}
