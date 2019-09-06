package br.com.murilo.allura.memento_pattern.contrato;

public class Acertado implements Estado {

	@Override
	public void avancar(Contrato contrato) {
		contrato.estado = new Concluido();
		
	}
}
