package creator;

import abstractProduct.Emissor;
import concreteProduct.EmissorMastercard;
import concreteProduct.EmissorVisa;

public class EmissorCreator {
	public static final int VISA = 0;
	public static final int MASTERCARD = 1;

	public Emissor create(int tipoDoEmissor) {
		if (tipoDoEmissor == EmissorCreator.VISA) {
			return new EmissorVisa();
		} else if (tipoDoEmissor == EmissorCreator.MASTERCARD) {
			return new EmissorMastercard();
		} else {
			throw new IllegalArgumentException(" Tipo de emissor não suportado ");
		}
	}
}