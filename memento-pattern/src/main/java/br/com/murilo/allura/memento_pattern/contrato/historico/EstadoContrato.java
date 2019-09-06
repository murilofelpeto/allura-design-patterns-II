package br.com.murilo.allura.memento_pattern.contrato.historico;

import br.com.murilo.allura.memento_pattern.contrato.Contrato;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class EstadoContrato {

	private Contrato contrato;
}
