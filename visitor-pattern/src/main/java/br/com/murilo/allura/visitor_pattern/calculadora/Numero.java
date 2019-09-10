package br.com.murilo.allura.visitor_pattern.calculadora;

import br.com.murilo.allura.visitor_pattern.visitor.Visitor;
import lombok.Getter;

@Getter
public class Numero implements Expressao {

	private int numero;

	public Numero(int numero) {
		this.numero = numero;		
	}

	@Override
	public int avalia() {
		return numero;
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaNumero(this);
		
	}
}
