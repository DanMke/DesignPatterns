package concreteFactory;

import abstractFactory.ComunicadorFactory;
import abstractProduct.Emissor;
import abstractProduct.Receptor;
import creator.EmissorCreator;
import creator.ReceptorCreator;

public class VisaComunicadorFactory implements ComunicadorFactory {
	private EmissorCreator emissorCreator = new EmissorCreator();
	private ReceptorCreator receptorCreator = new ReceptorCreator();

	public Emissor createEmissor() {
		return emissorCreator.create(EmissorCreator.VISA);
	}

	public Receptor createReceptor() {
		return receptorCreator.create(ReceptorCreator.VISA);
	}
}