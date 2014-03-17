package com.senac.mvc.controller;

import com.senac.mvc.model.Pessoa;
import com.senac.mvc.view.ContatoView;
import java.util.Random;

public class PessoaController {
		private Pessoa contato;
		private String montaTelefone;
		private String tipoTel;
		String[] Nome = new String[50];
		String[] Endereco = new String[50];
		String[] Sobrenome = new String[50];
		Random geraNumero = new Random();
		
		//cria e mota em uma string o teleofne
		public void criaTelefone(){
			int a=0, b=0, c=0, d=0, e=0, f=0, g=0;
			int [] telefone = new int[7];
			for(int i = 0; i < 7; i++){
				
				telefone[i] = geraNumero.nextInt(9);
			
				a = telefone[0];
				b = telefone[1];
				c = telefone[2];
				d = telefone[3];
				e = telefone[4];
				f = telefone[5];
				g = telefone[6];
			}
			montaTelefone = a+""+b+""+c+"-"+d+""+e+""+f+""+g;
		}
		
		// cria o tipo de telefone casa/trabalho/celular
		public void criarTipoTel(){
			//parametro 0, 1 e 2
			int tipo = geraNumero.nextInt(3);
			
			if(tipo == 0){
				tipoTel = "Casa";
			}
			else{
				if(tipo == 1){
					tipoTel = "Trabalho";
				}
				else{
					tipoTel = "Celular";
				}
			}
		}
		
		//cria 50 nomes
		public void criarNome(){
			// cria a lista de nomes

			Nome[0] = "Adriana";
			Nome[1] = "Angélica";
			Nome[2] = "Maria Eloisa";
			Nome[3] = "Aline Cristina";
			Nome[4] = "Roger";
			Nome[5] = "Lucas";
			Nome[6] = "Camila";
			Nome[7] = "Luana Elisa";
			Nome[8] = "Fabiana";
			Nome[9] = "Fernanda";
			Nome[10] = "Fernando";
			Nome[11] = "Bruno";
			Nome[12] = "Cassiano";
			Nome[13] = "Jéssica";
			Nome[14] = "Daphyni";
			Nome[15] = "Igor";
			Nome[16] = "Mário Augusto";
			Nome[17] = "Márcio";
			Nome[18] = "Mariana";
			Nome[19] = "Priscila";
			Nome[20] = "Nicole";
			Nome[21] = "Bernardo";
			Nome[22] = "Sandro";
			Nome[23] = "Vinicius";
			Nome[24] = "Cristiane Angélica";
			Nome[25] = "Jessé";
			Nome[26] = "Henrique";
			Nome[27] = "Paulo Henrique";
			Nome[28] = "Ana Clara";
			Nome[29] = "Felipe";
			Nome[30] = "Arthur";
			Nome[31] = "Guilherme";
			Nome[32] = "Gilberto";
			Nome[33] = "Renata";
			Nome[34] = "Keise";
			Nome[35] = "Silvana";
			Nome[36] = "Diego";
			Nome[37] = "Luzia Thais";
			Nome[38] = "Luciana";
			Nome[39] = "Elias";
			Nome[40] = "Fancisco José";
			Nome[41] = "Josué";
			Nome[42] = "Arthur";
			Nome[43] = "Rodrigo";
			Nome[44] = "Luis Fernando";
			Nome[45] = "William";
			Nome[46] = "Paulo Cesar";
			Nome[47] = "Ricardo";
			Nome[48] = "Elizabeth";
			Nome[49] = "Bruna";
		}
		
		//cria 50 sobrenomes
		public void criarSobrenome(){
			Sobrenome[0] = "Castro Ramos";
			Sobrenome[1] = "da Neiva Costa";
			Sobrenome[2] = "Farias";
			Sobrenome[3] = "Rocha";
			Sobrenome[4] = "Rodrigues Cruz";
			Sobrenome[5] = "de Oliveira Sousa";
			Sobrenome[6] = "Miguel Farias";
			Sobrenome[7] = "Stein";
			Sobrenome[8] = "Dias da Hora";
			Sobrenome[9] = "da Silva Borges";
			Sobrenome[10] = "da Silva";
			Sobrenome[11] = "Chiappa Ferreira";
			Sobrenome[12] = "Farias";
			Sobrenome[13] = "Santelmo de Souza";
			Sobrenome[14] = "da Silva";
			Sobrenome[15] = "Castilho Cabral";
			Sobrenome[16] = "de oliveira";
			Sobrenome[17] = "Barreto Santana";
			Sobrenome[18] = "Barreta";
			Sobrenome[19] = "Doneles Nunes";
			Sobrenome[20] = "Redeker";
			Sobrenome[21] = "Azevedo";
			Sobrenome[22] = "da Silva Guedes";
			Sobrenome[23] = "Cunha Aranda";
			Sobrenome[24] = "Gabriel";
			Sobrenome[25] = "Silveira";
			Sobrenome[26] = "Brum Santos";
			Sobrenome[27] = "Alves Junior";
			Sobrenome[28] = "Rocha";
			Sobrenome[29] = "Maia";
			Sobrenome[30] = "Vaz";
			Sobrenome[31] = "Barcante Leal";
			Sobrenome[32] = "Junior";
			Sobrenome[33] = "de Farias";
			Sobrenome[34] = "Menegusso";
			Sobrenome[35] = "Lima de Matos";
			Sobrenome[36] = "Alves dos Santos";
			Sobrenome[37] = "da Silva";
			Sobrenome[38] = "da Silva Soares";
			Sobrenome[39] = "Barbosa Ramos";
			Sobrenome[40] = "Macedo";
			Sobrenome[41] = "Dias Junior";
			Sobrenome[42] = "Farias Chiappa";
			Sobrenome[43] = "Korb";
			Sobrenome[44] = "Barbosa";
			Sobrenome[45] = "Vieira da Silva";
			Sobrenome[46] = "Faria";
			Sobrenome[47] = "Paz Gross";
			Sobrenome[48] = "Cabral da Silva";
			Sobrenome[49] = "Borne";	
		}
		
		//cria 50 enderecos
		public void criarEndereco(){
		// cria a lista de enderecos
			
			Endereco[0] = "Av. Guilherme Shell, 790";
			Endereco[1] = "Av. Boqueirão, 98";
			Endereco[2] = "Rua Caravelas, 290";
			Endereco[3] = "Av. Rio Grande do Sul, 2004";
			Endereco[4] = "Rua Nazaré, 320";
			Endereco[5] = "Rua 	Tiradentes, 200";
			Endereco[6] = "Rua Santa Luzia, 78";
			Endereco[7] = "Rua Bahia, 360";
			Endereco[8] = "Rua XV de Janeiro 25";
			Endereco[9] = "Rua Fioravante Milanes, 220 Apt. 304";
			Endereco[10] = "Rua São Sebastião, 357";
			Endereco[11] = "Rua 7 de Setembro, 428";
			Endereco[12] = "Rua Castro Alves, 301";
			Endereco[13] = "Rua da paz, 690";
			Endereco[14] = "Rua Rio de Janeiro, 2089";
			Endereco[15] = "Rua Santa Rita, 2339";
			Endereco[16] = "Rua Boa Vista, 2051";
			Endereco[17] = "Rua Pará, 2020 Apt. 404";
			Endereco[18] = "Rua Dom Pedro II, 360";
			Endereco[19] = "Rua Mato Grosso, 275";
			Endereco[20] = "Rua Primeiro de Maio, 470";
			Endereco[21] = "Rua José Bonifácio, 96";
			Endereco[22] = "Rua Duque de Caxias, 200";
			Endereco[23] = "Rua Prof. Anne Dias, 1004 Apt. 504";
			Endereco[24] = "Rua Uruguai, 320";
			Endereco[25] = "Rua Doutor Flores, 320";
			Endereco[26] = "Av. orvaldo Aranha, 3020 Apt. 302";
			Endereco[27] = "Rua Carlos Chagas, 450";
			Endereco[28] = "Rua Coronel Vicente, 410";
			Endereco[29] = "Rua Sarmento Leite, 470";
			Endereco[30] = "Rua Vitória, 67";
			Endereco[31] = "Rua da Conceição, 80";
			Endereco[32] = "Rua Espirito Santo, 270";
			Endereco[33] = "Rua General Portinho,230 ";
			Endereco[34] = "Rua Senhor dos Passos, 320 Apt. 303";
			Endereco[35] = "Rua Marechal Floriano Peixoto, 2006, Apt. 204";
			Endereco[36] = "Rua General Vitorino, 360";
			Endereco[37] = "Rua General Vasco Alves, 560";
			Endereco[38] = "Rua Chaves Barcelos, 430";
			Endereco[39] = "Rua Capitão Montanha, 530";
			Endereco[40] = "Av. Padre Thomé, 220";
			Endereco[41] = "Rua Jerônimo coelho, 760";
			Endereco[42] = "Rua General Canabarro, 330";
			Endereco[43] = "Rua Caldas Júnior, 330";
			Endereco[44] = "Rua José do Patrocinio, 820";
			Endereco[45] = "Rua General Bento Martins, 2090";
			Endereco[46] = "Rua General Cipriano Ferreira, 2220";
			Endereco[47] = "Rua Vinte e Quatro de Maio, 390 ";
			Endereco[48] = "Rua Siqueira Campos, 620";
			Endereco[49] = "Rua Washington Luiz, 640";
		}
		
		//cria um novo contato chamandos os metodos
		public void criarContato(){
			//cria uma nova pessoa
			contato = new Pessoa();
			
			criarNome();
			criarEndereco();
			criarSobrenome();
			criaTelefone();
			criarTipoTel();
			
			int in = geraNumero.nextInt(50);
			int is = geraNumero.nextInt(50);
			int ie = geraNumero.nextInt(50);
			
			contato.setNome(Nome[in]+" "+Sobrenome[is]);
			contato.setEndereco(Endereco[ie]);
			contato.setTelefone(montaTelefone + " - " + tipoTel);
		}

		public void exibirContato(ContatoView view )
		{
			view.printContato(contato.getNome(), contato.getEndereco(), contato.getTelefone());
		}
	}