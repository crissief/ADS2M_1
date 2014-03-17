package com.senac.mvc.view;

import static java.lang.System.out;

abstract public class ContatoView {

	public void printContato(String nome, String endereco, String telefone)
	{
		out.println("Nome: " + nome);
		out.println("Endereço:" + endereco);
		out.println("Telefone: " + telefone);
	}
}

