package br.com.murilo.allura.memento_pattern;

import java.util.Calendar;

import br.com.murilo.allura.memento_pattern.contrato.Contrato;
import br.com.murilo.allura.memento_pattern.contrato.historico.Historico;

public class App {
	public static void main(String[] args) {
		Historico historico = new Historico();

		Contrato contrato = new Contrato(Calendar.getInstance(), "Mauricio");
		historico.adiciona(contrato.salvarEstado());
		//NOVO
		System.out.println(contrato.getEstado());
		
		contrato.avancar();
		historico.adiciona(contrato.salvarEstado());
		//EM ANDAMENTO
		System.out.println(contrato.getEstado());
		
		contrato.retroceder(historico.pega());
		historico.adiciona(contrato.salvarEstado());
		//NOVO
		System.out.println(contrato.getEstado());
		
		contrato.avancar();
		historico.adiciona(contrato.salvarEstado());
		contrato.avancar();
		historico.adiciona(contrato.salvarEstado());
		//AVANCAR
		System.out.println(contrato.getEstado());
		
		contrato.retroceder(historico.pega());
		historico.adiciona(contrato.salvarEstado());
		//EM ANDAMENTO
		System.out.println(contrato.getEstado());
		
		contrato.avancar();
		historico.adiciona(contrato.salvarEstado());
		contrato.avancar();
		historico.adiciona(contrato.salvarEstado());
		//Concluido
		System.out.println(contrato.getEstado());
		
		contrato.retroceder(historico.pega());
		historico.adiciona(contrato.salvarEstado());
		//Acertado
		System.out.println(contrato.getEstado());
	}
}
