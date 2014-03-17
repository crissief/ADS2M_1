package com.senac.example;

public class Pessoa {

	String nome;
	int anoNasc;
	int anoAtual;
	
	public Pessoa(String nome, int anoNasc, int anoAtual){
		setNome(nome);
		setAnoNasc(anoNasc);
		setAnoAtual(anoAtual);
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setAnoNasc(int anoNasc){
		this.anoNasc = anoNasc;
	}
	
	public void setAnoAtual(int anoAtual){
		this.anoAtual = anoAtual;
	}
	
	public int calcularIdade(){
		return this.anoAtual - anoNasc;
	}
}

