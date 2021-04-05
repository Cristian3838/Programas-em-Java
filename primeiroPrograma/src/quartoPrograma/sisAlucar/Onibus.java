package quartoPrograma.sisAlucar;

public class Onibus extends Veiculo {
	
	public int getPassageiros() {//Exemplo de anulação
		return 40;
		
	}
	
	public void acelera(int limiteVelocidade) {// Exemplo de Sobrecarga
		
		System.out.println("Obedeça o limite de velocidade que é: " + limiteVelocidade);
		
	}
	
	

}
