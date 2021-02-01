package segundoPrograma;

import java.util.Scanner;

public class setimoPrograma {

	public static void main(String[] args) {
		
		
		Scanner scn  = new Scanner(System.in);//Lê o que sera digitado pelo usuário
		
		
		System.out.println("Digite o primeiro valor: ");
		int numero1 = scn.nextInt();
		System.out.println("Digite o segundo valor: ");
		int numero2 = scn.nextInt();
		
		int soma = numero1+numero2;
		int subtração = numero1-numero2;
		int multiplicação = numero1*numero2;
		float divisão = (float)numero1/numero2;
		
		
		System.out.println("O Resultado da soma entre numero1 e numero2 é: " + soma);
		System.out.println("O Resultado da subtração entre numero1 e numero2 é: " + subtração);
		System.out.println("O Resultado da multiplicação entre numero1 e numero2 é: " + multiplicação);
		System.out.printf("O Resultado da divisão é: %.3f", divisão);//%.3f mostra 3 casas depois do zero 
		System.out.printf("\nO Resultado da divisão é: " + divisão);
	}

}
