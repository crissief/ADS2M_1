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
	private double valorSaque = 0, valorDeposito = 0, valorTaxa = 0;
	private String nomeCli = null;	
	private int menu = 0, menuC = 0;
	Cliente cli;
	Conta conta;
	Especial contaEsp;
	Investimento contaInv;
	Scanner ler = new Scanner(System.in);
	BancoView bv = new BancoView();
	
	public void verificaOpcao(){
		menu = bv.menu();
		
		while(menu != 0){
			switch(menu){
				case 1:
					criaCliente();
					
					menu = bv.menu();
					break;
				case 2:
					criarConta();
					
					menu = bv.menu();
					break;
				case 3:
					criaContaEspecial();
					
					menu = bv.menu();
					break;
				case 4:
					criaContaInvestimento();
					
					menu = bv.menu();
					break;
				default:
					System.out.println("Opção Inválida!");					
			}	
		}
		System.out.println("Aplicação Encerrada!");
	}
	
	public void criaCliente(){
		System.out.println("Digite seu nome: ");
		nomeCli = ler.nextLine();
		
		//cria o cliente
		cli = new Cliente(nomeCli);
	}
	
	public void criarConta(){
		System.out.println("Digite o seu saldo: ");
		saldoC = ler.nextInt();
		
		System.out.println("Digite o número da sua conta: ");
		numCC = ler.nextInt();
		
		System.out.println("Digite o número de verificação: ");
		numVC = ler.nextInt();
		
		//cria a conta
		conta = new Conta(saldoC, numCC, numVC);
		
		// guarda o valor escolhido no menu de saque e deposito 
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
				System.out.println("Saldo Atual: R$ " + conta.getSaldo());
			}
			else{
				System.out.println("Opção Inválida!");
			}
			
		}		
	}
	
	public void criaContaEspecial(){
		System.out.println("Digite o seu saldo: ");
		saldoE = ler.nextInt();
		
		System.out.println("Digite o número da sua conta: ");
		numCE = ler.nextInt();
		
		System.out.println("Digite o número de verificação: ");
		numVE = ler.nextInt();
		
		System.out.println("Digite o valor do limete da sua conta: ");
		limite = ler.nextInt();
		
		//cria a conta especial
		contaEsp = new Especial(saldoE, numCE, numVE, limite);
		
		// guarda o valor escolhido no menu de saque e deposito 
		menuC = bv.menuConta();	
		if(menuC == 1){
			System.out.println("Digite o valor que deseja sacar: ");
			valorSaque = ler.nextDouble();
			
			try{
				contaEsp.sacar(valorSaque);
				System.out.println("Valor Saque: R$ " + valorSaque);
				System.out.println("Saldo Atual: R$ " + contaEsp.getSaldo());
			}
			catch(SaldoInsuficienteException saldoInsuf){
				System.out.println(saldoInsuf.getMessage());							
			}
		}
		else{
			if(menuC == 2){
				System.out.println("Digite o valor que deseja sacar: ");
				valorDeposito = ler.nextDouble();							
				contaEsp.depositar(valorDeposito);
				System.out.println("Saldo Atual: R$ " + contaEsp.getSaldo());
			}
			else{
				System.out.println("Opção Inválida!");
			}
			
		}
	}
	
	public void criaContaInvestimento(){
		System.out.println("Digite o seu saldo: ");
		saldoI = ler.nextInt();
		
		System.out.println("Digite o número da sua conta: ");
		numCI = ler.nextInt();
		
		System.out.println("Digite o número de verificação: ");
		numVI = ler.nextInt();
		
		System.out.println("Informe a data de criação da sua conta: ");
		dataCriacao = ler.nextInt();
		
		//cria a conta de investimento
		contaInv = new Investimento(saldoI, numCI, numVI, dataCriacao );
		
		// guarda o valor escolhido no menu de saque e deposito 
		menuC = bv.menuContaInv();	
		
		if(menuC == 1){
			System.out.println("Digite o valor que deseja sacar: ");
			valorSaque = ler.nextDouble();
			
			try{
				contaInv.sacar(valorSaque);
				System.out.println("Valor Saque: R$ " + valorSaque);
				System.out.println("Saldo Atual: R$ " + contaInv.getSaldo());
			}
			catch(SaldoInsuficienteException saldoInsuf){
				System.out.println(saldoInsuf.getMessage());							
			}
		}
		else{
			if(menuC == 2){
				System.out.println("Digite o valor que deseja sacar: ");
				valorDeposito = ler.nextDouble();							
				contaInv.depositar(valorDeposito);
				System.out.println("Saldo Atual: R$ " + contaInv.getSaldo());
			}
			else{
				if(menuC == 3){
					System.out.println("Digite o valor da taxa: ");
					valorTaxa = ler.nextDouble();
					contaInv.dividendos(valorTaxa);
					System.out.println("Saldo Atual: " + contaInv.getSaldo());
				}
				System.out.println("Opção Inválida!");
			}
		}
	}
}