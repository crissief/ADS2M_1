package com.senac.mvc.view;
import java.util.*;

import com.senac.mvc.model.Cliente;

public class BancoView {
	private int menu = 0, menuC = 0;
	Scanner ler = new Scanner(System.in);
	
	// metodo que mostra o menu de opções ao usuário
	public int menu(){
		System.out.println("Selecione uma das opções: " +
				"\n1- Criar Cliente" +
				"\n2- Criar Conta" +
				"\n3- Criar Conta Especial" +
				"\n4- Criar Conta Investimento");
		return menu = ler.nextInt();
	}
	
	public int menuConta(){
		System.out.println("Selecione uma das opções: " +
				"\n1 - Sacar" +
				"\n2 - Depositar");
		return menuC = ler.nextInt();
	}
}
