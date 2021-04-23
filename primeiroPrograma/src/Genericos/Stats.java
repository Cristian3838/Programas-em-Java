package Genericos;

public class Stats<T extends Number> {
	
	
	T[] num; // Cria um vetor de T

	public Stats(T[] num) {
		super();
		this.num = num;
	}
	
	double media() {
		
		int i = 0;// Cria um contador
		double soma = 0;
		
		for(i=0; i<num.length;i++)
			
			soma = soma + num[i].doubleValue();
		
		
		return soma/i;
	}

}
