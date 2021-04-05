package quartoPrograma.sisAlucar;

public class Moto extends Veiculo {
	
	public int getPassageiros() {// Exemplo de anulação
		return 1;
	}
	
	public void acelera(int limiteVelocidade) {// Exemplo de Sobrecarga
		
		System.out.println("Obedeça o limite de velocidade que é:  "+ limiteVelocidade);
	}

}
