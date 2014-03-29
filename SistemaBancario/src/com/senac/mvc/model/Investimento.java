package com.senac.mvc.model;

public class Investimento extends Conta {
	private int dataCriacao = 0;
	
	public Investimento(double saldo, int numConta, int numVerificacao, int dataCriacao){
		super(saldo, numConta, numVerificacao);
		setDataCriacao(dataCriacao);
	}
	
	public int getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(int dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public void dividendos(double taxa){
		double valorDiv = (taxa*this.saldo)/100;
		this.saldo+=valorDiv;
	}

}
