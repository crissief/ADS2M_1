package com.senac.mvc.model;

import com.senac.mvc.excecao.SaldoInsuficienteException;

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
	
	public void sacar(double valor) throws SaldoInsuficienteException{
		if(this.saldo + limite < valor){
			throw new SaldoInsuficienteException("Saldo Insuficiente, tente um valor menor!");
		}
		else{
			this.saldo-=valor; 
		}
	}
	
	public void depositar(double valor){
			this.saldo = this.saldo + this.limite + valor;
	}

}
