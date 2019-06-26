package main;

import concreteCommand.AumentaVolumeComando;
import concreteCommand.DiminuiVolumeComando;
import concreteCommand.TocaMusicaComando;
import invoker.ListaDeComandos;
import receiver.Player;

public class TestaListaDeComandos {
	public static void main(String[] args) {
		Player player = new Player();
		ListaDeComandos listaDeComandos = new ListaDeComandos();

		listaDeComandos.adiciona(new TocaMusicaComando(player, " musica1 . mp3 "));
		listaDeComandos.adiciona(new AumentaVolumeComando(player, 3));
		listaDeComandos.adiciona(new TocaMusicaComando(player, " musica2 . mp3 "));
		listaDeComandos.adiciona(new DiminuiVolumeComando(player, 3));
		listaDeComandos.adiciona(new TocaMusicaComando(player, " musica3 . mp3 "));
			
		listaDeComandos.executa();
	}
}
