package segundoPrograma;
import java.util.Scanner; 

public class oitavoPrograma {
	
	public static void main(String[] args) {

	Scanner scn = new Scanner(System.in);
	
	
	System.out.println("Digite o primeiro valor= ");
	int numero1 = scn.nextInt();
	System.out.println("Digite o segundo valor= ");
	int numero2 = scn.nextInt();
	
	if(numero1<numero2) {
		
		   System.out.println("Este numero � menor");
		
	}else {
		  
		   System.out.println("Retorno inv�lido");
		
	}	
	
	
    if(numero1>numero2) {
		
		   System.out.println("Este numero � maior");
		
	}else {
		
		   System.out.println("Retorno inv�lido");
		
	}	

   if(numero1==numero2) {
	
	       System.out.println("Estes valores s�o iguais");
	
    }else {
	
	      System.out.println("Retorno inv�lido");
	
}	
	
	}

}
