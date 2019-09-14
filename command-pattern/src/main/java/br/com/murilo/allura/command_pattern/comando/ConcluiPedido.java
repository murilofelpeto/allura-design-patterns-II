package br.com.murilo.allura.command_pattern.comando;

import br.com.murilo.allura.command_pattern.model.Pedido;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ConcluiPedido implements Comando {

	private Pedido pedido;

	@Override
	public void executa() {
		System.out.println("Concluindo o pedido do -> " + pedido.getCliente());
		pedido.finaliza();
	}

}
