package com.senac.mvc.view;

import static java.lang.System.*;

public class CompactView extends ContatoView {

		@Override
		public void printContato(String nome, String endereco, String telefone) {
			out.println(String.format("Contato: %s - %s - %s", nome, endereco, telefone));
		}
}
