package pacote;

import java.util.Random;

public class ComputadorC extends Computador{//Esta classe extende a classe computador e utiliza um gerador de numeros randomicos para escolher a jogada do computador
	
	public void JogaCompC() {
		Random random = new Random();
		int b = random.nextInt(7);
		Computador.classCompJoga = Integer.toString(b+2);
	}
}