package segundoPrograma;
import java.util.Scanner;

public class mediaAritmetica {

	public static void main(String[] args) {
		 
		//Declaração de váriaveis
		Scanner scn  = new Scanner (System.in);// Entrada de valor digitado pelo usuario 1º passo
		System.out.println("Digite o valor: ");// Valor a ser digitado pelo usuário 2º passo
		int valor = scn.nextInt(); //Valor digitado pelo usúario se ra guardado aqui 3º passo
		double media = 0; // Média double para possobilitar a média com casas decimais 4º passo
		double soma = 0; // Soma como double para somar também com casas decimais 5º passo
		int numeros = 0; // Váriavel para guardar a quantidade de nuemros digitados 6º passo
		int maior = valor; // Variável para guardar o maior valor digitado pelo usuário 7º passo
		int menor = valor; // Variável para digitar o menor valor digitado pelo usuário 8º passo
		
		//Processamento de dados
		
		while(valor != -1) {
			
			soma = soma + valor;  // Guarda o valor digitado junto com a soma se começa com 0 e vai aumentando conforme dados inseridos
			numeros++;
			System.out.println("Digite o valor: ");
			valor = scn.nextInt();
			
			if (valor >maior) 
				maior = valor;
			 else if(valor < menor)
				menor = valor;
			
		}
           
		    media = soma/numeros;
		    
		    
		    // Saída de dados
		    System.out.println("O Maior valor é: "+maior);
		    System.out.println("O Menor valor é: "+valor);
		    System.out.printf("A Média é = %.2f " , media); 
		
	}

}

//Quando não sabemos quantos valores serão lidos usamos o while