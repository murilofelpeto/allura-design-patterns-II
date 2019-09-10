package br.com.murilo.allura.visitor_pattern.visitor;

import br.com.murilo.allura.visitor_pattern.calculadora.Divisao;
import br.com.murilo.allura.visitor_pattern.calculadora.Multiplicacao;
import br.com.murilo.allura.visitor_pattern.calculadora.Numero;
import br.com.murilo.allura.visitor_pattern.calculadora.RaizQuadrada;
import br.com.murilo.allura.visitor_pattern.calculadora.Soma;
import br.com.murilo.allura.visitor_pattern.calculadora.Subtracao;

public class PreFixoVisitor implements Visitor {

	@Override
	public void visitaSoma(Soma soma) {
		System.out.print(" + ");
		System.out.print("(");
		soma.getEsquerda().aceita(this);
		System.out.print(" ");
		soma.getDireita().aceita(this);
		System.out.print(")");
	}

	@Override
	public void visitaSubtracao(Subtracao subtracao) {
		System.out.print(" - ");
		System.out.print("(");
		subtracao.getEsquerda().aceita(this);
		System.out.print(" ");
		subtracao.getDireita().aceita(this);
		System.out.print(")");
	}

	@Override
	public void visitaMultiplicacao(Multiplicacao multiplicacao) {
		System.out.print(" * ");
		System.out.print("(");
		multiplicacao.getEsquerda().aceita(this);
		System.out.print(" ");
		multiplicacao.getDireita().aceita(this);
		System.out.print(")");
	}

	@Override
	public void visitaDivisao(Divisao divisao) {
		System.out.print(" / ");
		System.out.print("(");
		divisao.getEsquerda().aceita(this);
		System.out.print(" ");
		divisao.getDireita().aceita(this);
		System.out.print(")");
	}

	@Override
	public void visitaRaizQuadrada(RaizQuadrada raizQuadrada) {
		System.out.print("(");
		System.out.print("√");
		System.out.print(raizQuadrada.getNumero());
		System.out.print(")");
	}
	
	@Override
	public void visitaNumero(Numero numero) {
		System.out.print(numero.getNumero());
	}
}
