package br.com.murilo.allura.visitor_pattern.calculadora;

import br.com.murilo.allura.visitor_pattern.visitor.Visitor;
import lombok.Getter;

@Getter
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

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaRaizQuadrada(this);
	}

}
