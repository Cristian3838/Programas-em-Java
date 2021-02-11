package segundoPrograma;

public class matrizDiagonal {

	public static void main(String[] args) {
		// Contrua uma matriz diagonal identidade I=3 onde apenas os valores diagonais são igual a 1
		// e todos os outros são iguais a 0.
		
		
		
		int matriz[][] = new int [3][3]; // Cria uma matriz de 3x3.
		    
		for(int x=0; x<=2; x++)
			for(int y=0; y<=2; y++) {
				
				if(x != y) //Quando x for diferente de y ou seja seus indices não forem iguais
					matriz[x][y]=0;
				
				
				else matriz[x][y]=3;
				
			}
				
		    for(int x=0; x<=2; x++)
		    {
				
					for(int y=0; y<=2; y++)
					
					
					{
						System.out.print(matriz[x][y]);
				    }

				       System.out.println(""); // Instrução para tudo o que tiver dentro do colchete pular uma linha 
		}		
	
	}

}
