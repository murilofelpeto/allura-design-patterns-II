package br.com.murilo.allura.bridge_pattern.mapa;

public class GoogleMaps implements Mapa {

	@Override
	public String getMapa(String endereco) {
		// Código para consumir a api do google maps
		return "Google Maps: " + endereco;
	}

}
