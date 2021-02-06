package segundoPrograma;
import java.util.Scanner;

public class listaTermos {

	public static void main(String[] args) {
		
		//Dados para a entrada de valores
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite o valor de x: ");
		
		//Declaração de variaveis
		double x = scn.nextDouble();
		double soma = 0;
		
		
		
		for(int y = 1; y<=50; y++) {
			
			soma =  soma + Math.pow(x, y)/y; // Se colocar novamente a soma "e" para ir acumulando, se não colocar o valor "e" regrido para um numero muito pequeno
			System.out.printf("\nO Valor de e(x) é: %2f", soma);
		}
		
	}

}
