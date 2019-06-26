package leaf;

import component.Trecho;

public class TrechoDeCarro implements Trecho {

	private String direcao;
	private double distancia;

	public TrechoDeCarro(String direcao, double distancia) {
		this.direcao = direcao;
		this.distancia = distancia;
	}

	public void imprime() {
		System.out.println(" Vá de Carro : ");
		System.out.println(this.direcao);
		System.out.println(" A distância percorrida será de : " + this.distancia + " metros .");
	}
}
