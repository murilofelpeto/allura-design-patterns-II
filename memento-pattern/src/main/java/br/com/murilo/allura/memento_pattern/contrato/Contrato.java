package br.com.murilo.allura.memento_pattern.contrato;

import java.util.Calendar;

import br.com.murilo.allura.memento_pattern.contrato.historico.EstadoContrato;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Contrato {

	private Calendar data;
	private String nome;
	protected Estado estado;
	
	public Contrato(Calendar data, String nome) {
		this.data = data;
		this.nome = nome;
		this.estado = new Novo();
	}
	
	public void avancar() {
		estado.avancar(this);
	}
	
	public EstadoContrato salvarEstado() {
		return new EstadoContrato(new Contrato(this.data,this.nome,this.estado));
	}
	
	public void retroceder(EstadoContrato estado) {
		this.data = estado.getContrato().getData();
		this.nome = estado.getContrato().getNome();
		this.estado = estado.getContrato().getEstado();
	}
}
