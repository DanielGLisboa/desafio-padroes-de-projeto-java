package com.dio;

public class Policial {
	
	private Executar executar;

	public void setExecutar(Executar executar) {
		this.executar = executar;
	}
	
	public void acao() {
		executar.acao();
	}

}
