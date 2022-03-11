package pacote;

import java.util.Scanner;

public class Jogador {
	private String jogJogada = null;
	Scanner joga = new Scanner(System.in);	
	
	public String jogar() { // Este metodo solicita ao usuario para digitar a posicao e retorna com o valor digitado
		System.out.println("\n# # # # # # # # # # # # # # # # # # # # #\n\nJogador X, digite a posicao da sua jogada:");		
		jogJogada = joga.next();
		joga.nextLine();
		return jogJogada;
		
	}
}

