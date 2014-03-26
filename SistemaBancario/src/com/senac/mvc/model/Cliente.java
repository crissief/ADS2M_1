package com.senac.mvc.model;

public class Cliente {
	String nome;
	int anoNasc;
	
	public Cliente(String nome, int anoNasc){
		setNome(nome);
		setAnoNasc(anoNasc);
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
}
