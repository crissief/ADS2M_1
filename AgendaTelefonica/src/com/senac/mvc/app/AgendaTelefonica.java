package com.senac.mvc.app;

import com.senac.mvc.controller.PessoaController;
import com.senac.mvc.view.CompactView;

public class AgendaTelefonica {
		public static void main(String[] args) {
			PessoaController controller = new PessoaController();
			
			for(int i = 0; i < 2500; i++){
				controller.criarContato();
				controller.exibirContato(new CompactView());
			}	
		}
	}

