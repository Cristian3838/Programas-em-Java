package segundoPrograma;
import java.util.Scanner;

public class nonoPrograma {

	public static void main(String[] args) {


		Scanner scn = new Scanner(System.in);
		
		
		System.out.println("Digite o primeiro valor= ");
		int numero1 = scn.nextInt();
		System.out.println("Digite o segundo valor= ");
		int numero2 = scn.nextInt();
		
		System.out.println("O numero1 � menor que o numero2" + (numero1<numero2));
		System.out.println("O numero1 � maior que o numero2" + (numero1>numero2));//Retorna uma condi��o verdadeira ou falsa
		System.out.println("O numero1 � igual ao numero2" + (numero1==numero2));
		

	}

}
