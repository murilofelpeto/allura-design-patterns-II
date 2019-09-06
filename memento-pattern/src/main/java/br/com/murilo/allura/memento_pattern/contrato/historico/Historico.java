package br.com.murilo.allura.memento_pattern.contrato.historico;

import java.util.ArrayList;
import java.util.List;

public class Historico {

	private List<EstadoContrato> estadoSalvo = new ArrayList<>();

	public EstadoContrato pega() {
		int tamanho = this.estadoSalvo.size();

		if (tamanho == 1 || tamanho == 2) {
			return this.estadoSalvo.get(0);
		}
		return this.estadoSalvo.get(tamanho - 2);

	}

	public void adiciona(EstadoContrato estado) {
		estadoSalvo.add(estado);
	}
}
