package br.com.murilo.allura.command_pattern.filas;

import java.util.ArrayList;
import java.util.List;

import br.com.murilo.allura.command_pattern.comando.Comando;

public class FilaPedido {

	private List<Comando> comandos;
	
	public FilaPedido() {
		comandos = new ArrayList<>();
	}
	
	public void adiciona(Comando comando) {
		comandos.add(comando);
	}
	
	public void processa() {
		comandos.forEach(comando -> comando.executa());
	}
}
