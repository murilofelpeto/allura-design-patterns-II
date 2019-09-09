package br.com.murilo.allura.interpreter_pattern.calculadora;

public class Numero implements Expressao {

	private int numero;

	public Numero(int numero) {
		this.numero = numero;		
	}

	@Override
	public int avalia() {
		return numero;
	}
}
