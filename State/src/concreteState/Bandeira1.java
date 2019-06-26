package concreteState;

import state.Bandeira;

public class Bandeira1 implements Bandeira {
	public double calculaValorDaCorrida(double tempo, double distancia) {
		return 5.0 + tempo * 1.5 + distancia * 1.7;
	}
}
