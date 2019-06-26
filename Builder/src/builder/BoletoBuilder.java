package builder;

import java.util.Calendar;

import product.Boleto;

public interface BoletoBuilder {
	void buildSacado(String sacado);
	void buildCedente(String cedente);
	void buildValor(double valor);
	void buildVencimento(Calendar vencimento);
	void buildNossoNumero(int nossoNumero);
	
	Boleto getBoleto();
}
