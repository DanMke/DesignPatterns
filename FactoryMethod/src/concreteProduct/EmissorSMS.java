package concreteProduct;

import product.Emissor;

public class EmissorSMS implements Emissor {

	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando por SMS a mensagem: ");
		System.out.println(mensagem);
	}

}
