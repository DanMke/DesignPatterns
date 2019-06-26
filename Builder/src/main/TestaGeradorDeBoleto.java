package main;

import builder.BoletoBuilder;
import concreteBuilder.BBBoletoBuilder;
import director.GeradorDeBoleto;
import product.Boleto;

public class TestaGeradorDeBoleto {

	public static void main(String[] args) {
		BoletoBuilder boletoBuilder = new BBBoletoBuilder();
		GeradorDeBoleto geradorDeBoleto = new GeradorDeBoleto(boletoBuilder);
		Boleto boleto = geradorDeBoleto.geraBoleto();
		System.out.println(boleto);

	}

}
