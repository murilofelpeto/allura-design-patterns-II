package br.com.murilo.allura.facade_singleton_pattern;

import br.com.murilo.allura.facade_singleton_pattern.facade.EmpresaFacade;
import br.com.murilo.allura.facade_singleton_pattern.facade.EmpresaSingleton;
import br.com.murilo.allura.facade_singleton_pattern.model.TipoCobranca;

public class App {
	public static void main(String[] args) {
		EmpresaFacade empresa = EmpresaSingleton.getEmpresa();
		empresa.fazContato(empresa.buscaPorCpf("123"), empresa.gerarCobranca(empresa.criarFatura(empresa.buscaPorCpf("123"), 500.00), TipoCobranca.DEBITO));
	}
}
