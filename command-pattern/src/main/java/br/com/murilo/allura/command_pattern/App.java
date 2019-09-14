package br.com.murilo.allura.command_pattern;

import br.com.murilo.allura.command_pattern.comando.ConcluiPedido;
import br.com.murilo.allura.command_pattern.comando.PagaPedido;
import br.com.murilo.allura.command_pattern.filas.FilaPedido;
import br.com.murilo.allura.command_pattern.model.Pedido;

public class App {
	public static void main(String[] args) {
		Pedido pedido1 = new Pedido("Murilo", 500.00);
		Pedido pedido2 = new Pedido("Leonardo", 700.00);
		
		FilaPedido fila = new FilaPedido();
		fila.adiciona(new PagaPedido(pedido1));
		fila.adiciona(new PagaPedido(pedido2));
		fila.adiciona(new ConcluiPedido(pedido1));
		
		fila.processa();
	}
}
