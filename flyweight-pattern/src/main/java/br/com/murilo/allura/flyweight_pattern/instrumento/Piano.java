package br.com.murilo.allura.flyweight_pattern.instrumento;

import java.util.List;

import org.jfugue.player.Player;

import br.com.murilo.allura.flyweight_pattern.notas.Nota;

public class Piano {

	public static void toca(List<Nota> notas) {
		Player player = new Player();
		
		StringBuilder musica = new StringBuilder();
		notas.forEach(nota -> musica.append(nota.simbolo() + " "));
		System.out.println(musica);
		player.play(musica.toString());
	}
}
