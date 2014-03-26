package com.senac.mvc.model;

public class Especial extends Conta{
	private double limite = 0;
	
	public Especial(double saldo, int numConta, int numVerificacao, double limite){
		super(saldo, numConta, numVerificacao);
		setLimite(limite);
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
