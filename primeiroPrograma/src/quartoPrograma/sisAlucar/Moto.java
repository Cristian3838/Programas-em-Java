package quartoPrograma.sisAlucar;

public class Moto extends Veiculo {
	
	public int getPassageiros() {// Exemplo de anula��o
		return 1;
	}
	
	public void acelera(int limiteVelocidade) {// Exemplo de Sobrecarga
		
		System.out.println("Obede�a o limite de velocidade que �:  "+ limiteVelocidade);
	}

}
