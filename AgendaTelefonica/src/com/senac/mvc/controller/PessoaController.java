package com.senac.mvc.controller;

import com.senac.mvc.model.Pessoa;
import com.senac.mvc.view.ContatoView;
import java.util.Random;

public class PessoaController {
		private Pessoa contato;
		private String montaTelefone;
		String[] Nome = new String[50];
		String[] Endereco = new String[50];
				
		public void criaTelefone(){
			int a=0, b=0, c=0, d=0, e=0, f=0, g=0;
			int [] telefone = new int[7];
			Random geraNumero = new Random();
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
		
		public void criarNome(){
			// cria a lista de nomes

			Nome[0] = "Adriana Castro Ramos";
			Nome[1] = "Angélica da Neiva Costa";
			Nome[2] = "Maria Eloisa Farias";
			Nome[3] = "Aline Cristina Rocha";
			Nome[4] = "Roger Rodrigues Cruz";
			Nome[5] = "Lucas de Oliveira Sousa";
			Nome[6] = "Camila Miguel Farias";
			Nome[7] = "Luana Elisa Stein";
			Nome[8] = "Fabiana Dias da Hora";
			Nome[9] = "Fernanda da Silva Borges";
			Nome[10] = "Fernando Cesar da Silva";
			Nome[11] = "Bruno Chiappa Ferreira";
			Nome[12] = "Cassiano Farias";
			Nome[13] = "Jéssica Santelmo de Souza";
			Nome[14] = "Daphyni da Silva";
			Nome[15] = "Igor Castilho Cabral";
			Nome[16] = "Mário Augusto de oliveira";
			Nome[17] = "Márcio Barreto Santana";
			Nome[18] = "Mariana Barreta";
			Nome[19] = "Priscila Doneles Nunes";
			Nome[20] = "Nicole Redeker";
			Nome[21] = "Bernardo Acevedo";
			Nome[22] = "Sandro da Silva Guedes";
			Nome[23] = "Vinicius Cunha Aranda";
			Nome[24] = "Cristiane Angélica Gabriel";
			Nome[25] = "Jessé Silveira";
			Nome[26] = "Henrique Brum Santos";
			Nome[27] = "Paulo Henrique Alves Junior";
			Nome[28] = "Ana Clara Rocha";
			Nome[29] = "Felipe Maia";
			Nome[30] = "Arthur Vaz";
			Nome[31] = "Guilherme Barcante Leal";
			Nome[32] = "Gilberto Junior";
			Nome[33] = "Renata Farias";
			Nome[34] = "Keise Menegusso";
			Nome[35] = "Silvana Lima de Matos";
			Nome[36] = "Diego Alves dos Santos";
			Nome[37] = "Luzia Thais da Silva";
			Nome[38] = "Luciana da Silva Soares";
			Nome[39] = "Elias Barbosa Ramos";
			Nome[40] = "Fancisco José Macedo";
			Nome[41] = "Josué Dias Junior";
			Nome[42] = "Arthur Farias Chiappa";
			Nome[43] = "Rodrigo Korb";
			Nome[44] = "Luis Fernando Barbosa";
			Nome[45] = "William Vieira da Silva";
			Nome[46] = "Paulo Cesar Faria";
			Nome[47] = "Ricardo Paz Gross";
			Nome[48] = "Elizabeth Cabral da Silva";
			Nome[49] = "Bruna Borne";
		}
		
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
		
		public void criarContato(int i){
			//cria uma nova pessoa
			contato = new Pessoa();
			
			criarNome();
			criarEndereco();
			//cria telefone;
			criaTelefone();
			
			contato.setNome(Nome[i]);
			contato.setEndereco(Endereco[i]);
			contato.setTelefone(montaTelefone);
		}

		public void exibirContato(ContatoView view )
		{
			view.printContato(contato.getNome(), contato.getEndereco(), contato.getTelefone());
		}
	}
