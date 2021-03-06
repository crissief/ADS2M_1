package com.senac.mvc.model;

import com.senac.mvc.excecao.*;

public class Conta {
	protected double saldo = 0;
	protected int numConta = 0;
	protected int numVerificacao = 0;
	
	public Conta(double saldo, int numConta, int numVerificacao){
		setSaldo(saldo);
		setNumConta(numConta);
		setNumVerificacao(numVerificacao);
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public int getNumVerificacao() {
		return numVerificacao;
	}

	public void setNumVerificacao(int numVerificacao) {
		this.numVerificacao = numVerificacao;
	}

	public void sacar(double valor) throws SaldoInsuficienteException{
		if(this.saldo < valor){
			throw new SaldoInsuficienteException("Saldo Insuficiente, tente um valor menor!");
		}
		else{
			this.saldo-=valor;
		}
	}
	
	public void depositar(double valor){
			this.saldo+=valor;
	}
}
