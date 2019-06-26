package main;

import singleton.Configuracao;

public class TestaSingleton {

	public static void main(String[] args) {
		Configuracao configuracao = Configuracao.getInstance();
		System.out.println(configuracao.getPropriedade("time-zone"));
		System.out.println(configuracao.getPropriedade("currency-code"));

	}

}
