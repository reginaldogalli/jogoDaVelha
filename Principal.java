package pacote;

import java.util.Scanner;

public class Principal {
	public static String jogada;
	public static String vez;

	public static void main(String[] args) {
		
		while (true) {
			Tabuleiro tab = new Tabuleiro();
			Jogador jog = new Jogador();
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("\n# # # # # # JOGO DA VELHA v1.0 # # # # # #");
			
			int recebenivel = 0;
			int nivel = 0;
			while(recebenivel == 0) { // Este loop solicita ao jogador para selecionar o nivel de dificuldade
				System.out.println("\nSelecione o nivel de dificuldade do jogo:\n\n[1] - Facil\n[2] - Medio\n[3] - Dificil");
	
				try {// Caso o jogador digite algum caractere invalido, exibe a mensagem de erro
					nivel = entrada.nextInt();
					entrada.nextLine();
				} catch (Exception e) {
					System.out.println("Valor invalido digitado!");
				}
				
				if (nivel>0 && nivel<4) {// Verifica se o nivel digitado esta dentro dos parametros aceitos pelo jogo
					System.out.println("Nivel selecionado: # " + nivel + " #");
					recebenivel = 1;
				}
				else {
					System.out.println("\nDigite um numero de 1 a 3");
					recebenivel = 0;
				}
			}
			
			if(nivel == 1) {// Instancia a classe ComputadorA caso o usuario selecione o nivel 1
				ComputadorA comp = new ComputadorA();
				vez = "X";
				while(tab.checaSituacao() == 0) {
					if (vez == "X") {
						tab.imprimeTabuleiro();
						jogada = jog.jogar(); // Recebe a jogada do jogador e salva na variavel jogada que sera lida pelo tabuleiro
						while(tab.recebeJogada() == false) {
							jogada = jog.jogar(); // Caso jogada invalida entra no loop ate validar
						}
						vez = "O";	
					}	
						
					else if (vez == "O"){
						jogada = comp.compJogar(); // Recebe a jogada do computador e salva na variavel jogada que sera lida pelo tabuleiro
						while(tab.recebeJogada() == false) {
							jogada = comp.compJogar(); // Caso jogada invalida entra no loop ate validar
						}	
						vez = "X";
					}
				}
			}
			else if(nivel == 2) {// Instancia a classe ComputadorB caso o usuario selecione o nivel 2
				ComputadorB comp = new ComputadorB();
				vez = "X";
				while(tab.checaSituacao() == 0) {
					if (vez == "X") {
						tab.imprimeTabuleiro();
						jogada = jog.jogar(); // Recebe a jogada do jogador e salva na variavel jogada que sera lida pelo tabuleiro
						while(tab.recebeJogada() == false) {
							jogada = jog.jogar(); // Caso jogada invalida entra no loop ate validar
						}
						vez = "O";	
					}	
						
					else if (vez == "O"){
						comp.JogaCompB();
						jogada = comp.compJogar(); // Recebe a jogada do computador e salva na variavel jogada que sera lida pelo tabuleiro
						while(tab.recebeJogada() == false) {
							jogada = comp.compJogar(); // Caso jogada invalida entra no loop ate validar
						}	
						vez = "X";
					}
				}
			}
			else if(nivel == 3) {// Instancia a classe ComputadorC caso o usuario selecione o nivel 3
				ComputadorC comp = new ComputadorC();
				vez = "O";
				while(tab.checaSituacao() == 0) {
					if (vez == "X") {
						tab.imprimeTabuleiro();
						jogada = jog.jogar(); // Recebe a jogada do jogador e salva na variavel jogada que sera lida pelo tabuleiro
						while(tab.recebeJogada() == false) {
							jogada = jog.jogar(); // Caso jogada invalida entra no loop ate validar
						}
						vez = "O";	
					}	
						
					else if (vez == "O"){
						comp.JogaCompC();
						jogada = comp.compJogar(); // Recebe a jogada do computador e salva na variavel jogada que sera lida pelo tabuleiro
						while(tab.recebeJogada() == false) {
							jogada = comp.compJogar(); // Caso jogada invalida entra no loop ate validar
						}	
						vez = "X";
					}
				}
			}
			if(tab.checaSituacao() == 1) {// Exibe o resultado do jogo
				System.out.println("Parabens, voce venceu!!!");
				tab.imprimeTabuleiro();
			}
			else if(tab.checaSituacao() == 2) {
				System.out.println("Computador venceu ...");
				tab.imprimeTabuleiro();
			}
			else if (tab.checaSituacao() == 3){
				System.out.println("Jogo deu velha...");
				tab.imprimeTabuleiro();
			}
			System.out.println("\nDigite [1] para jogar novamente. Para encerrar, digite qualquer outra tecla.");
			int valor = 0;
			try {// Caso o jogador digite algum caractere invalido, exibe a mensagem de erro
				valor = entrada.nextInt();
				entrada.nextLine();
			} catch (Exception e) {
				System.out.println("Valor invalido digitado!");
			}
			if(valor == 1) {// Caso o jogador digite 1, reinicia o jogo
				continue;
			}
			else {
				entrada.close();// Caso o jogador digite outra tecla, encerra o jogo e fecha o teclado
				break;
			}
			}
		}
}
