package main;

import creator.EmissorCreator;
import product.Emissor;

public class TestaEMissores {

	public static void main(String[] args) {
		
		EmissorCreator creator = new EmissorCreator();
		
		Emissor emissor1 = creator.create(EmissorCreator.SMS);
		emissor1.enviar("K19 Treinamentos");
		
		Emissor emissor2 = creator.create(EmissorCreator.EMAIL);
		emissor2.enviar("K19 Treinamentos");
		
		Emissor emissor3 = creator.create(EmissorCreator.JMS);
		emissor3.enviar("K19 Treinamentos");
	}

}
