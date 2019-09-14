package br.com.murilo.allura.adapter_pattern;

import br.com.murilo.allura.adapter_pattern.relogio.Relogio;
import br.com.murilo.allura.adapter_pattern.relogio.RelogioSistema;

public class App {
	public static void main(String[] args) {
		Relogio relogio = new RelogioSistema();
		System.out.println(relogio.hoje());
	}
}
