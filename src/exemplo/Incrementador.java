package exemplo;

public class Incrementador {

	private int instancia = 0;
	private static int estatica = 0;

	public void incrementar(){
		instancia++;
		estatica++;
	}

	public int getValorInstancia(){
		return instancia;
	}

	public int getValorEstatica(){
		return estatica;
	}
}