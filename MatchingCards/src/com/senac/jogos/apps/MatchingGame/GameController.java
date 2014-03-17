package com.senac.jogos.apps.MatchingGame;

import static java.lang.System.out;
import com.senac.jogos.Jogador;
import com.senac.jogos.cartas.Baralho;
import com.senac.jogos.cartas.Carta;
import com.senac.jogos.rules.MatchingGame;

public class GameController {

	private MatchingGame game;
	private Baralho baralho;
	private Jogador jogador;
	private Jogador[] numJogadores = new Jogador[4];
	private GameView view;
	
	public GameController() {
		baralho = new Baralho();
		jogador = new Jogador();
		game = new MatchingGame(baralho.drawCarta());
		view = new GameView();
	}
	
	public void criaJogador(int numJogador){
			for(int i = 0; i < numJogador; i ++){
				numJogadores[i] = jogador;
			}
	}
	
	public void realizaJogada(int i) {
		if (view.getUserInput().equalsIgnoreCase("jogar")) {
			Carta comprada = baralho.drawCarta();
			view.mostraMesa(comprada);
			int score = game.matchCards(comprada);
			numJogadores[i].addPontos(score);
			game.setMesa(comprada);
		}
	}

	public boolean isOver() {
		return baralho.isEmpty();
	}

	public void showStatus(int i) {
		view.mostraJogador(numJogadores[i]);
		view.mostraMesa(game.getMesa());
	}	
}
