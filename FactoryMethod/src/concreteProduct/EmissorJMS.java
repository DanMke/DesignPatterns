package concreteProduct;

import product.Emissor;

public class EmissorJMS implements Emissor {

	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando por JMS a mensagem: ");
		System.out.println(mensagem);
	}

}
