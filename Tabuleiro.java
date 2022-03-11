package pacote;

public class Tabuleiro {
	private String [][] tab = {{"1","2","3"}, {"4","5","6"}, {"7","8","9"}};
	private int situacao = 0;
	
	public void imprimeTabuleiro() {// Este metodo apenas imprime o tabuleiro na tela
		System.out.println("\n");
		System.out.println( "          " + tab [0][0] + " | " + tab [0][1] + " | " + tab [0][2]);	
		System.out.println("          ---------");
		System.out.println( "          " + tab [1][0] + " | " + tab [1][1] + " | " + tab [1][2]);
		System.out.println("          ---------");
		System.out.println( "          " + tab [2][0] + " | " + tab [2][1] + " | " + tab [2][2]);
		System.out.println("\n");
	}
	
	public int checaSituacao() { // Verfica a situacao do jogo, se ainda nao terminou, quem ganhou ou se acabou empatado
		if (this.tab [0][0] == this.tab [0][1] && this.tab [0][1] == this.tab [0][2] && this.tab [0][2] == "X"|| // Verifica se o jogador ganhou
			this.tab [1][0] == this.tab [1][1] && this.tab [1][1] == this.tab [1][2] && this.tab [1][2] == "X"||
			this.tab [2][0] == this.tab [2][1] && this.tab [2][1] == this.tab [2][2] && this.tab [2][2] == "X"||
			this.tab [0][0] == this.tab [1][0] && this.tab [1][0] == this.tab [2][0] && this.tab [2][0] == "X"||
			this.tab [0][1] == this.tab [1][1] && this.tab [1][1] == this.tab [2][1] && this.tab [2][1] == "X"||
			this.tab [0][2] == this.tab [1][2] && this.tab [1][2] == this.tab [2][2] && this.tab [2][2] == "X"||
			this.tab [0][0] == this.tab [1][1] && this.tab [1][1] == this.tab [2][2] && this.tab [2][2] == "X"||
			this.tab [0][2] == this.tab [1][1] && this.tab [1][1] == this.tab [2][0] && this.tab [2][0] == "X"){
			situacao = 1;
			}
		
		else if (this.tab [0][0] == this.tab [0][1] && this.tab [0][1] == this.tab [0][2] && this.tab [0][2] == "O"|| // Verifica se o computador ganhou
				 this.tab [1][0] == this.tab [1][1] && this.tab [1][1] == this.tab [1][2] && this.tab [1][2] == "O"||
				 this.tab [2][0] == this.tab [2][1] && this.tab [2][1] == this.tab [2][2] && this.tab [2][2] == "O"||
				 this.tab [0][0] == this.tab [1][0] && this.tab [1][0] == this.tab [2][0] && this.tab [2][0] == "O"||
				 this.tab [0][1] == this.tab [1][1] && this.tab [1][1] == this.tab [2][1] && this.tab [2][1] == "O"||
				 this.tab [0][2] == this.tab [1][2] && this.tab [1][2] == this.tab [2][2] && this.tab [2][2] == "O"||
				 this.tab [0][0] == this.tab [1][1] && this.tab [1][1] == this.tab [2][2] && this.tab [2][2] == "O"||
				 this.tab [0][2] == this.tab [1][1] && this.tab [1][1] == this.tab [2][0] && this.tab [2][0] == "O"){
				 situacao = 2;
				 }
		
		else if ((this.tab [0][0] == "X" || this.tab [0][0] == "O") && // Verifica se o jogo terminou empatado
				 (this.tab [0][1] == "X" || this.tab [0][1] == "O") && 
				 (this.tab [0][2] == "X" || this.tab [0][2] == "O") && 
				 (this.tab [1][0] == "X" || this.tab [1][0] == "O") && 
				 (this.tab [1][1] == "X" || this.tab [1][1] == "O") && 
				 (this.tab [1][2] == "X" || this.tab [1][2] == "O") && 
				 (this.tab [2][0] == "X" || this.tab [2][0] == "O") && 
				 (this.tab [2][1] == "X" || this.tab [2][1] == "O") &&
				 (this.tab [2][2] == "X" || this.tab [2][2] == "O") ){
				 situacao = 3;
				 }
		else { // Neste caso, o jogo ainda nao terminou
			situacao = 0;
			}
		return situacao;
	}
	
	public boolean recebeJogada() { // Recebe a jogada do jogador e verifica se a posicao solicitada e valida
		switch(Principal.jogada) {
			case "1":
				if (this.tab [0][0] == "1") { // Verifica se a posicao ja nao foi ocupada anteriormente
					this.tab [0][0] = Principal.vez;
					return true; // Retorna o valor indicando que a jogada foi realizada
				}
				else if (Principal.vez == "X"){
					System.out.println("Posicao ja ocupada!!!"); 
					return false; // Retorna o valor indicando que a jogada nao foi realizada
				}
			case "2":
				if (this.tab [0][1] == "2") {
					this.tab [0][1] = Principal.vez;
					return true;
				}
				else if (Principal.vez == "X"){
					System.out.println("Posicao ja ocupada!!!");
					return false;
				}
			case "3":
				if (this.tab [0][2] == "3") {
					this.tab [0][2] = Principal.vez;
					return true;
				}
				else if (Principal.vez == "X"){
					System.out.println("Posicao ja ocupada!!!");
					return false;
				}
			case "4":
				if (this.tab [1][0] == "4") {
					this.tab [1][0] = Principal.vez;
					return true;
				}
				else if (Principal.vez == "X"){
					System.out.println("Posicao ja ocupada!!!");
					return false;
				}
			case "5":
				if (this.tab [1][1] == "5") {
					this.tab [1][1] = Principal.vez;
					return true;
				}
				else if (Principal.vez == "X"){
					System.out.println("Posicao ja ocupada!!!");
					return false;
				}
			case "6":
				if (this.tab [1][2] == "6") {
					this.tab [1][2] = Principal.vez;
					return true;
				}
				else if (Principal.vez == "X"){
					System.out.println("Posicao ja ocupada!!!");
					return false;
				}
			case "7":
				if (this.tab [2][0] == "7") {
					this.tab [2][0] = Principal.vez;
					return true;
				}
				else if (Principal.vez == "X"){
					System.out.println("Posicao ja ocupada!!!");
					return false;
				}
			case "8":
				if (this.tab [2][1] == "8") {
					this.tab [2][1] = Principal.vez;
					return true;
				}
				else if (Principal.vez == "X"){
					System.out.println("Posicao ja ocupada!!!");
					return false;
				}
			case "9":
				if (this.tab [2][2] == "9") {
					this.tab [2][2] = Principal.vez;
					return true;
				}
				else if (Principal.vez == "X"){
					System.out.println("Posicao ja ocupada!!!");
					return false;
				}
			default:
				if (Principal.vez == "X") {
					System.out.println("Jogada invalida!!!");
				}
				else if (Principal.vez == "O") {
					Computador.classCompJoga = "1";
				}
				return false;
		}
	}
     
	
	
}

