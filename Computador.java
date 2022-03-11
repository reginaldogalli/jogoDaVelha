package pacote;


public abstract class Computador {
	private String compJogada = null;
	public static String classCompJoga;
	
	public String compJogar() { // Este metodo faz com que o computador receba de uma subclasse uma posicao para ser preenchida
		this.compJogada = Computador.classCompJoga;
		return compJogada;
	}

}
