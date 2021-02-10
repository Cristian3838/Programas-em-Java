package segundoPrograma;

public class exemploMatriz {

	//Escreva um programa que leia um vetor A de 50 elementos, construa e imprima  outro vetor B da seguinte forma:
	// Os elementos de ordem par são correspondentes a (2*A);
	//OS elementos de ordem impar são correspondentes a (A/2);
	public static void main(String[] args) {
	
	int A[] = new int[50];
	int B[] = new int[50];
	
	
	
	for(int i=0; i<50; i++) 
	{
		
		
		A[i]=i;
	
	if(i%2 == 0)
		B[i] = 2*A[i];
	
	else
		B[i]= A[i]/2;
	
	}			
			for(int a: A)
			
			System.out.print(a+"_");
			
			System.out.println("");
			
			for(int b: B)
			System.out.print(b+"_");
			
			
			
		
	 
	

	}

}
