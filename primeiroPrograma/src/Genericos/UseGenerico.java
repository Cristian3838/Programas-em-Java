package Genericos;

// Exemplo de manipuçação de genéricos

public class UseGenerico {

	public static void main(String[] args) {
		
		
		ExemploGenerics<Integer> iob = new ExemploGenerics<>(88); //Criação de um objeto fazendo o uso de genéricos passando um inteiro
		iob.showType(); // Imprime qual é o tipo dele
		
		
		
		ExemploGenerics<String> sob = new ExemploGenerics<String>("Cristian"); //Criação de um segundo tipo genérico
		sob.showType(); // Imprime qual é o tipo dele

	}

}
