package segundoPrograma;

import java.util.Scanner;

public class setimoPrograma {

	public static void main(String[] args) {
		
		
		Scanner scn  = new Scanner(System.in);//L� o que sera digitado pelo usu�rio
		
		
		System.out.println("Digite o primeiro valor: ");
		int numero1 = scn.nextInt();
		System.out.println("Digite o segundo valor: ");
		int numero2 = scn.nextInt();
		
		int soma = numero1+numero2;
		int subtra��o = numero1-numero2;
		int multiplica��o = numero1*numero2;
		float divis�o = (float)numero1/numero2;
		
		
		System.out.println("O Resultado da soma entre numero1 e numero2 �: " + soma);
		System.out.println("O Resultado da subtra��o entre numero1 e numero2 �: " + subtra��o);
		System.out.println("O Resultado da multiplica��o entre numero1 e numero2 �: " + multiplica��o);
		System.out.printf("O Resultado da divis�o �: %.3f", divis�o);//%.3f mostra 3 casas depois do zero 
		System.out.printf("\nO Resultado da divis�o �: " + divis�o);
	}

}
