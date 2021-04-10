package quintoPrograma;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StreamApp {
	
	private static char letra;


	public static void byteStream() throws Exception {
		
		FileInputStream entrada = new FileInputStream ("C:\\Users\\CRISTIAN\\git\\Programas-em-Java\\primeiroPrograma\\src\\quintoPrograma\\dados.txt");
	    
		int contador = 0;// Inicializa uma variável contador
	    
		while((entrada.read()) != -1) // Enquanto o caracter lido for diferente de -1 significa que ainda não foi encontrado
	    contador++;// Vai verificando quantos caracteres tem esse arquivo
	    
	    System.out.println("O Numero de caracteres é= " + contador);
	    
	    entrada.close();
	
	}
	
	
	public static void caracterStream(char letra) throws Exception{
		
		
        FileInputStream entrada = new FileInputStream ("C:\\Users\\CRISTIAN\\git\\Programas-em-Java\\primeiroPrograma\\src\\quintoPrograma\\dados.txt");
	    
		int contador = 0;
		int c;// Inicializa uma variável contador
	    
		while((c = entrada.read()) != -1) // Enquanto o caracter lido for diferente de -1 significa que ainda não foi encontrado
	    // Vai verificando quantos caracteres tem esse arquivo
		
		{
			
			if(c==letra)
				contador++;
		}
	    
	    System.out.println("O Numero de vezes que a letra informada foi encontrada é: " + contador);
	    
	    entrada.close();
		
	}
	

	public static void main(String[] args) {
		
		try {
		byteStream();
		
		
		System.out.println("Informar a letra a ser encontrada: ");
		char letra = (char)System.in.read();
		caracterStream(letra);
		
	}
		
		
		catch(Exception e) {
			e.printStackTrace();
		
	}
	
	
	
	}

}
