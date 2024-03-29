package br.com.murilo.allura.flyweight_pattern.notas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotasMusicais {

	private static Map<String, Nota> notas = new HashMap<String, Nota>();

	private static List<Class<? extends Nota>> clazzes;

	static {
		clazzes = Arrays.asList(Do.class, DoSustenido.class, Re.class, ReSustenido.class, Mi.class, MiSustenido.class,
				Fa.class, FaSustenido.class, Sol.class, SolSustenido.class, La.class, LaSustenido.class, Si.class,
				SiSustenido.class);
	}

	public Nota pega(String nome) {
		try {
			if (!notas.containsKey(nome)) {
				for (Class<? extends Nota> clazz : clazzes) {
					if (clazz.getSimpleName().toLowerCase().equals(nome.toLowerCase())) {
						notas.put(nome, (Nota) clazz.newInstance());
						break;
					}
				}
			}

			return notas.get(nome);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
