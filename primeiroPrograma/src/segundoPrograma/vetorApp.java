package segundoPrograma;

public class vetorApp {

	public static void main(String[] args) {
		// Vetor de tipos primitvos
		
		
		// Par�metros
		int fibo [] = //V�riavel de inicializa��o
				new int [20]; // Vetor de 10 posi��es sendo a primeira come�ando com numero 0
		
		//Processamentos 
		
		fibo[0] = 1;
		fibo[1] = fibo[0];
		fibo[2] = fibo[0]+fibo[1];
		
		//Vamos ultilizar um for each para o c�uculo 
        
		for(int i=3; i<20; i++)
			fibo[i]= fibo[i-1]+fibo[i-2];
			
			
			
		for (int i:fibo ) {
			  
			System.out.println(i+ ",");
			
		}
	}

}
