package br.com.murilo.allura.bridge_pattern;

import br.com.murilo.allura.bridge_pattern.mapa.GoogleMaps;
import br.com.murilo.allura.bridge_pattern.mapa.MapLink;
import br.com.murilo.allura.bridge_pattern.mapa.Mapa;

public class App {
	public static void main(String[] args) {
		Mapa mapa = new GoogleMaps();
		System.out.println(mapa.getMapa("Avenida 23 de maio"));
		
		mapa = new MapLink();
		System.out.println(mapa.getMapa("Avenida Zaki Narchi"));
	}
}
