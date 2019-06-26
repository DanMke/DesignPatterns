package concreteProduct;

import product.Emissor;

public class EmissorEmail implements Emissor {

	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando por email a mensagem: ");
		System.out.println(mensagem);

	}

}
