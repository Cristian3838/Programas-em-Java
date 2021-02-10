package segundoPrograma;

public class vetorApp {

	public static void main(String[] args) {
		// Vetor de tipos primitvos
		
		
		// Parâmetros
		int fibo [] = //Váriavel de inicialização
				new int [20]; // Vetor de 10 posições sendo a primeira começando com numero 0
		
		//Processamentos 
		
		fibo[0] = 1;
		fibo[1] = fibo[0];
		fibo[2] = fibo[0]+fibo[1];
		
		//Vamos ultilizar um for each para o cáuculo 
        
		for(int i=3; i<20; i++)
			fibo[i]= fibo[i-1]+fibo[i-2];
			
			
			
		for (int i:fibo ) {
			  
			System.out.println(i+ ",");
			
		}
	}

}
