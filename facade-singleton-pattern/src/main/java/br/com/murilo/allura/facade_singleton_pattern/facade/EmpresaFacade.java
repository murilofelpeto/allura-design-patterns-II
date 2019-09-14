package br.com.murilo.allura.facade_singleton_pattern.facade;

import br.com.murilo.allura.facade_singleton_pattern.model.Cliente;
import br.com.murilo.allura.facade_singleton_pattern.model.Cobranca;
import br.com.murilo.allura.facade_singleton_pattern.model.ContatoCliente;
import br.com.murilo.allura.facade_singleton_pattern.model.Fatura;
import br.com.murilo.allura.facade_singleton_pattern.model.TipoCobranca;

public class EmpresaFacade {

	protected EmpresaFacade() {}
	
	public Cliente buscaPorCpf(String cpf) {
		return new Cliente("Murilo", cpf, "murilo@hotmail.com");
	}
	
	public Fatura criarFatura(Cliente cliente, Double valor) {
		return new Fatura(cliente, valor);
	}
	
	public Cobranca gerarCobranca(Fatura fatura, TipoCobranca cobranca) {
		return new Cobranca(cobranca, fatura);
	}
	
	public ContatoCliente fazContato(Cliente cliente, Cobranca cobranca) {
		return new ContatoCliente(cobranca, cliente);
	}
}
