package br.com.murilo.allura.bridge_pattern.mapa;

public class MapLink implements Mapa {

	@Override
	public String getMapa(String endereco) {
		//Código para implementacao do map link
		return "MapLink: " + endereco;
	}

}
