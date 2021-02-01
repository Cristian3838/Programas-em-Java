package segundoPrograma;
import java.util.Scanner;

public class decimoPrograma {

	public static void main(String[] args) {


		Scanner scn = new Scanner(System.in);
		
		
		System.out.println("Digite o valor da nota= ");
		int nota1 = scn.nextInt();
		
		if (nota1<0 || nota1>100) {// Testando a condição geral
			
			System.out.println("Nota Inválida");
			main(null);//Recursividade
		}else {
			
		if(nota1>0 && nota1<=50) 
	    System.out.println("Nota Insuficiente");
		
		else if(nota1>50 && nota1<=70) 
		    System.out.println("Nota Regular");
		
		else if(nota1>70 && nota1<=90) 
		    System.out.println("Nota Boa");
		
		else if(nota1>90 && nota1<=100)
			System.out.println("Nota Excelente");
		
		}
		
		
		
	}

}