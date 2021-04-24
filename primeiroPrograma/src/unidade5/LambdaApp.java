package unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp {

	public static void main(String[] args) {
		List<Integer> integers  = Arrays.asList(1,2,3,4);// Cria uma lista de inteiros
		// System.out.println(integers); Comando usando para impressão
		
		// Usando expressões Lambda
		
		integers.forEach(x -> System.out.println(x+10/2)); // Usando a expressão Lambda

	}

}
