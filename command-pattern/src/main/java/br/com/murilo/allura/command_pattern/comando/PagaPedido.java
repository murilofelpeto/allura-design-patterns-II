package br.com.murilo.allura.command_pattern.comando;

import br.com.murilo.allura.command_pattern.model.Pedido;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PagaPedido implements Comando {

	private Pedido pedido;

	@Override
	public void executa() {
		System.out.println("Pagando o pedido do -> " + pedido.getCliente());
		pedido.paga();
	}

}
