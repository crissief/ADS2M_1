package com.senac.mvc.model;

public class Conta {
	private double saldo = 0;
	private int numConta = 0;
	private int numVerificacao = 0;
	
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

	public void depositar(double valor){
		
	}
	
	public void sacar(double valor){
		
	}
}
