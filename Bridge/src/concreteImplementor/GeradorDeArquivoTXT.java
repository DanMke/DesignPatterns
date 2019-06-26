package concreteImplementor;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import implementor.GeradorDeArquivo;

public class GeradorDeArquivoTXT implements GeradorDeArquivo {

	public void gera(String conteudo) {
		try {
			PrintStream saida = new PrintStream("arquivo.txt");
			saida.println(conteudo);
			saida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
