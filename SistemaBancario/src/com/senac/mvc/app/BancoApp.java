package com.senac.mvc.app;
import com.senac.mvc.controller.*;
import com.senac.mvc.excecao.SaldoInsuficienteException;
import com.senac.mvc.model.*;

public class BancoApp {
	public static void main(String[] args) {
		BancoController bc = new BancoController();
		
		bc.criarCliente();
	}

}
