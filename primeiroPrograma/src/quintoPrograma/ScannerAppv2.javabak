package quintoPrograma;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ScannerAppv2 {
	
	public static void main(String[] args) throws Exception {
		Scanner entrada = new Scanner(new FileReader("C:\\Users\\CRISTIAN\\git\\Programas-em-Java\\primeiroPrograma\\src\\quintoPrograma\\numeros.txt"));
	    double soma = 0;
	    String valor;
	    while(entrada.hasNext()) {
	    	
	    	valor = entrada.next();
	    	soma = soma + Double.parseDouble(valor);
	    	
	    }
	    
	    
	    entrada.close();
	    JOptionPane.showInternalMessageDialog(null, " A Soma de valores é: " + soma);
	
	}

}
