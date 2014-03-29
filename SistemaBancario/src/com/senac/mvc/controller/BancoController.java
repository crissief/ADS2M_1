package com.senac.mvc.controller;

import com.senac.mvc.excecao.SaldoInsuficienteException;
import com.senac.mvc.model.Cliente;
import com.senac.mvc.model.Conta;
import com.senac.mvc.model.Especial;
import com.senac.mvc.model.Investimento;
import com.senac.mvc.view.*;
import java.util.*;

public class BancoController {
	private int saldoC = 0, saldoE = 0, saldoI = 0;
	private int numCC = 0, numCE = 0, numCI = 0;
	private int numVC = 0, numVE = 0, numVI = 0;
	private int limite = 0;
	private int dataCriacao = 0;
	private double valorSaque = 0, valorDeposito = 0;
	private String nomeCli = null;	
	private int menuC = 0;
	Cliente cli;
	Conta conta;
	Especial contaEsp;
	Investimento contaInv;
	Scanner ler = new Scanner(System.in);
	BancoView bv = new BancoView();
	
	public void verificaOpcao(){
		int menu = bv.menu();
		
			switch(menu){
				case 1:
					criaCliente();
					break;
				case 2:
					criarConta();
					break;
				case 3:
					System.out.println("Digite o seu saldo: ");
					saldoE = ler.nextInt();
					
					System.out.println("Digite o número da sua conta: ");
					numCE = ler.nextInt();
					
					System.out.println("Digite o número de verificação: ");
					numVE = ler.nextInt();
					
					System.out.println("Digite o valor do limete da sua conta: ");
					limite = ler.nextInt();
					
					contaEsp = new Especial(saldoE, numCE, numVE, limite);
					break;
				case 4:
					System.out.println("Digite o seu saldo: ");
					saldoI = ler.nextInt();
					
					System.out.println("Digite o número da sua conta: ");
					numCI = ler.nextInt();
					
					System.out.println("Digite o número de verificação: ");
					numVI = ler.nextInt();
					
					System.out.println("Informe a data de criação da sua conta: ");
					dataCriacao = ler.nextInt();
					
					contaInv = new Investimento(saldoI, numCI, numVI, dataCriacao );
					break;
				default:
					System.out.println("Opção Inválida!");
					
			}	
	}
	
	public void criaCliente(){
		System.out.println("Digite seu nome: ");
		nomeCli = ler.nextLine();
		
		cli = new Cliente(nomeCli);
	}
	
	public void criarConta(){
		System.out.println("Digite o seu saldo: ");
		saldoC = ler.nextInt();
		
		System.out.println("Digite o número da sua conta: ");
		numCC = ler.nextInt();
		
		System.out.println("Digite o número de verificação: ");
		numVC = ler.nextInt();
		
		conta = new Conta(saldoC, numCC, numVC);
		
		// guarda o valor escolhido no menu de sque e deposito 
		menuC = bv.menuConta();		

		if(menuC == 1){
			System.out.println("Digite o valor que deseja sacar: ");
			valorSaque = ler.nextDouble();
			
			try{
				conta.sacar(valorSaque);
				System.out.println("Valor Saque: R$ " + valorSaque);
				System.out.println("Saldo Atual: R$ " + conta.getSaldo());
			}
			catch(SaldoInsuficienteException saldoInsuf){
				System.out.println(saldoInsuf.getMessage());							
			}
		}
		else{
			if(menuC == 2){
				System.out.println("Digite o valor que deseja sacar: ");
				valorDeposito = ler.nextDouble();							
				conta.depositar(valorDeposito);
			}
		}
		
	}
}



