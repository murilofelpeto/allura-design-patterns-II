package br.com.murilo.allura.memento_pattern.contrato;

public class Concluido implements Estado {

	@Override
	public void avancar(Contrato contrato) {
		throw new RuntimeException("Contrato no estágio final");
		
	}
}
