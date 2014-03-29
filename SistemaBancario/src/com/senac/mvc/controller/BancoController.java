package com.senac.mvc.controller;

import com.senac.mvc.model.Cliente;
import com.senac.mvc.model.Conta;
import com.senac.mvc.model.Especial;
import com.senac.mvc.model.Investimento;
import java.util.*;

import org.omg.CORBA.PUBLIC_MEMBER;

public class BancoController {
	Cliente cli;
	Conta conta;
	Especial contEsp;
	Investimento contInv;
	Scanner ler = new Scanner(System.in);
	int menu = 0;
	
	// metodo que mostra o menu de opções ao usuário
	public void menu(){
		System.out.println("Selecione uma das opções: " +
				"\n1- Criar Cliente" +
				"\n2- Criar Conta" +
				"\n3- Criar Conta Especial" +
				"\n4- Criar Conta Poupança");
		menu = ler.nextInt();
	}
	
}


