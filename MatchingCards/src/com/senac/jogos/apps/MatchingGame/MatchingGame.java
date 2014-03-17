package com.senac.jogos.apps.MatchingGame;

import static java.lang.System.out;
import java.util.*;

public class MatchingGame {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		GameController game = new GameController();
		
		out.println("Quantos jogadores participarão do jogo?");
		int numJogadores = ler.nextInt();
		
		game.criaJogador(numJogadores);
				while (! game.isOver()) {
					for(int i = 0; i < numJogadores; i++){
						out.println("JOGADOR " + (i+1));
						game.showStatus(i);			
						game.realizaJogada(i);
					}
				}
	}	
}