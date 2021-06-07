package exemplo;

public class Principal {

	public static void main(String[] args){
		Incrementador[] incrementadores = new Incrementador[5];

		for(int i=0; i<5; i++){
			incrementadores[i] = new Incrementador();
		}

		for(int i=0; i<5; i++){
			for(int j=0;j<3;j++){
				incrementadores[i].incrementar();
			}
		}

		for(int i=0;i<5;i++){

			System.out.println("Incrementador "+i+" instancia ="+
					incrementadores[i].getValorInstancia());

			System.out.println("Incrementador "+i+" estatica ="+
					incrementadores[i].getValorEstatica());
		}
	}

}