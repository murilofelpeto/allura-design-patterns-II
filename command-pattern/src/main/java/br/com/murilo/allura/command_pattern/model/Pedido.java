package br.com.murilo.allura.command_pattern.model;

import java.util.Calendar;

import lombok.Getter;

@Getter
public class Pedido {

	private String cliente;
	private Double valor;
	private Status status;
	private Calendar dataFinalizacao;

	public Pedido(String cliente, Double valor) {
		this.cliente = cliente;
		this.valor = valor;
		this.status = Status.NOVO;
	}
	
	public void paga() {
		status = Status.PAGO;
	}
	
	public void finaliza() {
		dataFinalizacao = Calendar.getInstance();
		status = Status.ENTREGUE;
	}
}
