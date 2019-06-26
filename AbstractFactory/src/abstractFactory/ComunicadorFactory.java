package abstractFactory;

import abstractProduct.Emissor;
import abstractProduct.Receptor;

public interface ComunicadorFactory {
	Emissor createEmissor();
	Receptor createReceptor();
}
