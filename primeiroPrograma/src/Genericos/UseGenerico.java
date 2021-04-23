package Genericos;

// Exemplo de manipu�a��o de gen�ricos

public class UseGenerico {

	public static void main(String[] args) {
		
		
		ExemploGenerics<Integer> iob = new ExemploGenerics<>(88); //Cria��o de um objeto fazendo o uso de gen�ricos passando um inteiro
		iob.showType(); // Imprime qual � o tipo dele
		
		
		
		ExemploGenerics<String> sob = new ExemploGenerics<String>("Cristian"); //Cria��o de um segundo tipo gen�rico
		sob.showType(); // Imprime qual � o tipo dele

	}

}
