package br.com.murilo.allura.flyweight_pattern;

import java.util.Arrays;
import java.util.List;

import br.com.murilo.allura.flyweight_pattern.instrumento.Piano;
import br.com.murilo.allura.flyweight_pattern.notas.Nota;
import br.com.murilo.allura.flyweight_pattern.notas.NotasMusicais;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		NotasMusicais notas = new NotasMusicais();

		List<Nota> doReMiFa = Arrays.asList(notas.pega("do"), notas.pega("re"), notas.pega("mi"), notas.pega("fa"),
				notas.pega("fa"), notas.pega("fa"), notas.pega("do"), notas.pega("re"), notas.pega("do"),
				notas.pega("re"), notas.pega("re"), notas.pega("re"), notas.pega("do"), notas.pega("sol"),
				notas.pega("fa"), notas.pega("mi"), notas.pega("mi"), notas.pega("mi"), notas.pega("do"),
				notas.pega("re"), notas.pega("mi"), notas.pega("fa"), notas.pega("fa"), notas.pega("fa"));
		
		Piano.toca(doReMiFa);
	}
}
