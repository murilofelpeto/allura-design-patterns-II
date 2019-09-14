package br.com.murilo.allura.facade_singleton_pattern.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Fatura {

	private Cliente cliente;
	private Double valor;
}
