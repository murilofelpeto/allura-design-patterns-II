package br.com.murilo.allura.interpreter_pattern.calculadora;

public class Divisao implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Divisao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia() {
		int resultadoEsquerda = esquerda.avalia();
		int resultadoDireita = direita.avalia();
		return resultadoEsquerda / resultadoDireita;
	}
}
