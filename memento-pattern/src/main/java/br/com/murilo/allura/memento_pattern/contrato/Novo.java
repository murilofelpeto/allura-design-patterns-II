package br.com.murilo.allura.memento_pattern.contrato;

public class Novo implements Estado{

	@Override
	public void avancar(Contrato contrato) {
		contrato.estado = new EmAndamento();
		
	}
}
