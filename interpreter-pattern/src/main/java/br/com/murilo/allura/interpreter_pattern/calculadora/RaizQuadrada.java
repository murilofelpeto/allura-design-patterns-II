package br.com.murilo.allura.interpreter_pattern.calculadora;

public class RaizQuadrada implements Expressao {

	private Expressao numero;

	public RaizQuadrada(Expressao numero) {
		this.numero = numero;
	}

	@Override
	public int avalia() {
		int num = numero.avalia();
		return (int) Math.sqrt(num);
	}

}
