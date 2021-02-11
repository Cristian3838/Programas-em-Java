package segundoPrograma;

public class exemploMatriz {

	//Escreva um programa que leia um vetor A de 50 elementos, construa e imprima  outro vetor B da seguinte forma:
	// Os elementos de ordem par são correspondentes a (2*A);
	//OS elementos de ordem impar são correspondentes a (A/2);
	public static void main(String[] args) {
	
	int A[] = new int[50]; // Declaração de um vetor de 50 posições int A[] = new int[50];
	int B[] = new int[50]; // Declaração de um vetor de 50 posições int B[] = new int[50];
	
	
	
	for(int i=0; i<50; i++) // laço condicional para atender as 50 posções definidas através de um vetor
	{
		
		
		A[i]=i; // Aloca as 50 posições "naturais" dentro de A[i]
	
	if(i%2 == 0) // Laço condicional se a variável declarada int B[] for par
		B[i] = 2*A[i]; // Se entre os 50 numeros A[i]=i tiverem os que forem i%2 == 0 e o resto da divisão for 0 valera B[i] = 2*A[i]
	
	else
		B[i]= A[i]/2; // Laço condicional se a variável declarada int B[] for ímpar, Se entre os 50 numeros A[i]=i forem ímpar então valera B[i]= A[i]/2
	
	}			
			for(int a: A) //For each extendido
			
			System.out.print(a+"_"); // Imprime o resultado de A[i]=i
			
			System.out.println(""); //Espeço para separa melhor a visualiação do resultado.
			
			for(int b: B)
			System.out.print(b+"_");// Imprime o resultado do laço condicional 
			
			
			
		
	 
	

	}

}
