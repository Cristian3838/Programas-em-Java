package quartoPrograma.sisAlucar;

public class Onibus extends Veiculo {
	
	public int getPassageiros() {//Exemplo de anula��o
		return 40;
		
	}
	
	public void acelera(int limiteVelocidade) {// Exemplo de Sobrecarga
		
		System.out.println("Obede�a o limite de velocidade que �: " + limiteVelocidade);
		
	}
	
	

}
