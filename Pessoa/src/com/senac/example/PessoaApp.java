package com.senac.example;

import java.util.*;

public class PessoaApp {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Digite o seu nome: ");
			String nome = ler.nextLine();
			
			System.out.println("Digite o ano atual: ");
			int anoA = ler.nextInt();
			
			System.out.println("Digite o seu ano de nascimento: ");
			int anoN = ler.nextInt();
	
			Pessoa pes = new Pessoa(nome, anoN, anoA);
			
			int idade = pes.calcularIdade();
			
			System.out.println("Olá " + pes.getNome() + " você tem " + idade + " anos!");

		}
	}