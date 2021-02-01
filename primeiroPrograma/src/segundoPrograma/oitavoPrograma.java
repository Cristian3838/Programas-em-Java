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
		
		   System.out.println("Este numero é menor");
		
	}else {
		  
		   System.out.println("Retorno inválido");
		
	}	
	
	
    if(numero1>numero2) {
		
		   System.out.println("Este numero é maior");
		
	}else {
		
		   System.out.println("Retorno inválido");
		
	}	

   if(numero1==numero2) {
	
	       System.out.println("Estes valores são iguais");
	
    }else {
	
	      System.out.println("Retorno inválido");
	
}	
	
	}

}
