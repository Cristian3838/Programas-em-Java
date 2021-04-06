package quartoPrograma;

public class Funcionario {// Criada a Superclasse Funcionário
	
	public static void main(String[] args) {
	
	Funcionario Jose = new Funcionario();//Criado o objeto Funcionario Jose
    Funcionario Antonio = new Professor(); //Polimorfismo, instânciada novo professor filho da super classe Funcionario
    Funcionario Andre = new Administrativo(); //Polimorfismo, instânciada novo administrativo filho da super classe Funcionario
    Funcionario Pedro = new Diretor();
    Pedro.verificarTipoFuncionario(Pedro);// Instaciado o objeto Pedro
    Antonio.verificarTipoFuncionario(Antonio);//Instaciado o objeto Antonio
    Andre.verificarTipoFuncionario(Andre);//Instaciado o objeto Andre
     
    
 }

          void verificarTipoFuncionario(Funcionario objeto){//Cria um metodo do tipo void verificarTipoFuncionario para verificar 
        	  //Funcionario
        	  
        	  if (objeto instanceof Diretor)
        		  System.out.println("Diretor");
        	  else if (objeto instanceof Professor)
        	  System.out.println("Professor");
        	  else 
        		  System.out.println("Administrativo");
        	  
        	  
          }

}