package segundoPrograma;
import java.util.Scanner;

public class mediaAritmetica {

	public static void main(String[] args) {
		 
		//Declara��o de v�riaveis
		Scanner scn  = new Scanner (System.in);// Entrada de valor digitado pelo usuario 1� passo
		System.out.println("Digite o valor: ");// Valor a ser digitado pelo usu�rio 2� passo
		int valor = scn.nextInt(); //Valor digitado pelo us�ario se ra guardado aqui 3� passo
		double media = 0; // M�dia double para possobilitar a m�dia com casas decimais 4� passo
		double soma = 0; // Soma como double para somar tamb�m com casas decimais 5� passo
		int numeros = 0; // V�riavel para guardar a quantidade de nuemros digitados, essa v�riavel conta os numeros 6� passo
		int maior = valor; // Vari�vel para guardar o maior valor digitado pelo usu�rio 7� passo
		int menor = valor; // Vari�vel para digitar o menor valor digitado pelo usu�rio 8� passo
		
		//Processamento de dados
		
		while(valor != -1) {// O Programa fica ativo at� essa vari�vel ser verdadeira
			
			soma = soma + valor;  // Guarda o valor digitado junto com a soma se come�a com 0 e vai aumentando conforme dados inseridos
			numeros++;
			
			
			if (valor >maior) 
				maior = valor;
			 else if(valor < menor)
				menor = valor;
			
			System.out.println("Digite o valor: ");// Neste caso o usuario ao digitar -1 o programa termina.
			valor = scn.nextInt();
			
		}
           
		    media = soma/numeros;
		    
		    
		    // Sa�da de dados
		    System.out.println("O Maior valor �: "+maior);
		    System.out.println("O Menor valor �: "+valor);
		    System.out.printf("A M�dia � = %.2f " , media); 
		
	}

}

//Quando n�o sabemos quantos valores ser�o lidos usamos o while