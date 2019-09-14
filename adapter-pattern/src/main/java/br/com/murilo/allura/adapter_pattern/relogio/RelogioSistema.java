package br.com.murilo.allura.adapter_pattern.relogio;

import java.util.Calendar;

public class RelogioSistema implements Relogio {

	@Override
	public Calendar hoje() {
		return Calendar.getInstance();
	}

}
