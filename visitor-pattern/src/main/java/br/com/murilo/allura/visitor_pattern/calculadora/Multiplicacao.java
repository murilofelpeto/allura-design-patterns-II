package br.com.murilo.allura.visitor_pattern.calculadora;

import br.com.murilo.allura.visitor_pattern.visitor.Visitor;
import lombok.Getter;

@Getter
public class Multiplicacao implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Multiplicacao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;		
	}

	@Override
	public int avalia() {
		int resultadoEsquerda = esquerda.avalia();
		int resultadoDireita = direita.avalia();
		return resultadoEsquerda * resultadoDireita;
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaMultiplicacao(this);
	}
}
