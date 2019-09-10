package br.com.murilo.allura.visitor_pattern.visitor;

import br.com.murilo.allura.visitor_pattern.calculadora.Divisao;
import br.com.murilo.allura.visitor_pattern.calculadora.Multiplicacao;
import br.com.murilo.allura.visitor_pattern.calculadora.Numero;
import br.com.murilo.allura.visitor_pattern.calculadora.RaizQuadrada;
import br.com.murilo.allura.visitor_pattern.calculadora.Soma;
import br.com.murilo.allura.visitor_pattern.calculadora.Subtracao;

public interface Visitor {

	void visitaSoma(Soma soma);

	void visitaSubtracao(Subtracao subtracao);

	void visitaMultiplicacao(Multiplicacao multiplicacao);

	void visitaDivisao(Divisao divisao);

	void visitaRaizQuadrada(RaizQuadrada raizQuadrada);

	void visitaNumero(Numero numero);

}