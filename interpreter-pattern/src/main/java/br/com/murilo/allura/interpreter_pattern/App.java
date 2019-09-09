package br.com.murilo.allura.interpreter_pattern;

import br.com.murilo.allura.interpreter_pattern.calculadora.Divisao;
import br.com.murilo.allura.interpreter_pattern.calculadora.Expressao;
import br.com.murilo.allura.interpreter_pattern.calculadora.Multiplicacao;
import br.com.murilo.allura.interpreter_pattern.calculadora.Numero;
import br.com.murilo.allura.interpreter_pattern.calculadora.Soma;
import br.com.murilo.allura.interpreter_pattern.calculadora.Subtracao;

public class App {
	public static void main(String[] args) {

		Expressao esquerda = new Soma(new Subtracao(new Numero(30), new Numero(5)),
				new Multiplicacao(new Numero(2), new Numero(4)));

		Expressao direita = new Subtracao(new Numero(10), new Divisao(new Numero(8), new Numero(2)));

		Expressao conta = new Soma(esquerda, direita);
		int resultado = conta.avalia();
		System.out.println(resultado);
	}
}
