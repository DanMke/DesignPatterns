package concreteCommand;

import command.Comando;
import receiver.Player;

public class DiminuiVolumeComando implements Comando {
	private Player player;
	private int levels;

	public DiminuiVolumeComando(Player player, int levels) {
		this.player = player;
		this.levels = levels;
	}

	public void executa() {
		this.player.decreaseVolume(this.levels);
	}
}
