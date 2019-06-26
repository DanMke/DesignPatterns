package adapter;

import adaptee.ControleDePontoNovo;
import product.Funcionario;
import target.ControleDePonto;

public class ControleDePontoAdapter extends ControleDePonto {
	private ControleDePontoNovo controleDePontoNovo;
	
	public ControleDePontoAdapter() {
		this.controleDePontoNovo = new ControleDePontoNovo();
	}

	public void registraEntrada(Funcionario f) {
		this.controleDePontoNovo.registra(f, true);
	}

	public void registraSaida(Funcionario f) {
		this.controleDePontoNovo.registra(f, false);
	}
}
