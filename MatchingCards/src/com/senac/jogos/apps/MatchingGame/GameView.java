package com.senac.jogos.apps.MatchingGame;

import java.util.Scanner;

import com.senac.jogos.Jogador;
import com.senac.jogos.cartas.Carta;

import static java.lang.System.out;

public class GameView {

	private Scanner teclado = new Scanner(System.in);
	private String numeroCarta;
	public String getUserInput()
	{
		return teclado.nextLine();
	}
	
	public void mostraMesa(Carta carta) {		
		if(carta.getNumero() == 1 || carta.getNumero() == 2 || carta.getNumero() == 3 || carta.getNumero() == 4 || carta.getNumero() == 5 || carta.getNumero() == 6 || carta.getNumero() == 7 || carta.getNumero() == 8 || carta.getNumero() == 9 || carta.getNumero() == 10){
			out.println(String.format("Carta: %d%c", carta.getNumero(), carta.getNaipe()));
		}
		else{
			// verifica se é o número 11 e mostra para o usuário J
			if(carta.getNumero() == 11){
				out.println(String.format("Carta: %c%c", 'J', carta.getNaipe()));
			}
			else{
				// verifica se é o número 12 e mostra para o usuário Q
				if(carta.getNumero() == 12){
					out.println(String.format("Carta: %c%c", 'Q', carta.getNaipe()));
				}
				// verifica se é o número 13 e mostra para o usuário K
				else{
					out.println(String.format("Carta: %c%c", 'K', carta.getNaipe()));
				}
			}			
		}
	}
		
	
	public void mostraJogador(Jogador jogador) {
		out.println(String.format("Pontos: %d",
				                  jogador.getPontos()));
	}
}
