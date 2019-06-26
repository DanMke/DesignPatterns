package invoker;

import java.util.ArrayList;
import java.util.List;

import command.Comando;

public class ListaDeComandos {
	private List<Comando> comandos = new ArrayList<Comando>();

	public void adiciona(Comando comando) {
		this.comandos.add(comando);
	}

	public void executa() {
		for (Comando comando : this.comandos) {
			comando.executa();
		}
	}
}
