package com.senac.example;

import java.util.*;
import static java.lang.System.out;

public class HelloWorldNome {
	public static void main(String[] Args){
		Scanner ler = new Scanner(System.in);
		
		out.println("Digite o seu nome: ");
		String nome = ler.nextLine();		
		
		out.println("Hello World, " + nome);
	}
}
