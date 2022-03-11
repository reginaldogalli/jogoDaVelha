package pacote;

import java.util.Random;

public class ComputadorB extends Computador{//Esta classe extende a classe computador e utiliza um gerador de numeros randomicos para escolher a jogada do computador
	
	public void JogaCompB() {
		Random random = new Random();
		int b = random.nextInt(9);
		Computador.classCompJoga = Integer.toString(b);
	}
}