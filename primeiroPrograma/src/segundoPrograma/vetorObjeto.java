package segundoPrograma;

public class vetorObjeto {

	public static void main(String[] args) {
		
		//Vetor de Objetos
		String vetor[] = new String [5];
		vetor[0] = new String("Banana");
		vetor[1] = new String("Maçã");
		vetor[2] = new String("Abacate");
		vetor[3] = new String("Uva");
		vetor[4] = new String("Abacaxi");
		
		for(String i: vetor) //For each
			System.out.print(i+",");
			
			

	}

}
