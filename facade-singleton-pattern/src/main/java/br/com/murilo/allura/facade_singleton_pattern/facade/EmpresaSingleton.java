package br.com.murilo.allura.facade_singleton_pattern.facade;

public class EmpresaSingleton {

	private volatile static EmpresaFacade empresa;

	private EmpresaSingleton() {
	}

	public static EmpresaFacade getEmpresa() {
		if (empresa == null) {
			synchronized (EmpresaSingleton.class) {
				if (empresa == null) {
					empresa = new EmpresaFacade();
				}
			}
		}
		return empresa;
	}

}