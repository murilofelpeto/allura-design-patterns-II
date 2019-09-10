package br.com.murilo.allura.visitor_pattern.calculadora;

import br.com.murilo.allura.visitor_pattern.visitor.Visitor;

public interface Expressao {

	public int avalia();
	public void aceita(Visitor visitor);
}
