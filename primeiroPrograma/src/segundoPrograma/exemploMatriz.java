package segundoPrograma;

public class exemploMatriz {

	//Escreva um programa que leia um vetor A de 50 elementos, construa e imprima  outro vetor B da seguinte forma:
	// Os elementos de ordem par s�o correspondentes a (2*A);
	//OS elementos de ordem impar s�o correspondentes a (A/2);
	public static void main(String[] args) {
	
	int A[] = new int[50]; // Declara��o de um vetor de 50 posi��es int A[] = new int[50];
	int B[] = new int[50]; // Declara��o de um vetor de 50 posi��es int B[] = new int[50];
	
	
	
	for(int i=0; i<50; i++) // la�o condicional para atender as 50 pos��es definidas atrav�s de um vetor
	{
		
		
		A[i]=i; // Aloca as 50 posi��es "naturais" dentro de A[i]
	
	if(i%2 == 0) // La�o condicional se a vari�vel declarada int B[] for par
		B[i] = 2*A[i]; // Se entre os 50 numeros A[i]=i tiverem os que forem i%2 == 0 e o resto da divis�o for 0 valera B[i] = 2*A[i]
	
	else
		B[i]= A[i]/2; // La�o condicional se a vari�vel declarada int B[] for �mpar, Se entre os 50 numeros A[i]=i forem �mpar ent�o valera B[i]= A[i]/2
	
	}			
			for(int a: A) //For each extendido
			
			System.out.print(a+"_"); // Imprime o resultado de A[i]=i
			
			System.out.println(""); //Espe�o para separa melhor a visualia��o do resultado.
			
			for(int b: B)
			System.out.print(b+"_");// Imprime o resultado do la�o condicional 
			
			
			
		
	 
	

	}

}
