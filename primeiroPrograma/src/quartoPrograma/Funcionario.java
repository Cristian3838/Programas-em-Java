package quartoPrograma;

public abstract class Funcionario {// Criada a Superclasse Funcion�rio
	
	public static void main(String[] args) {
	
	
    Funcionario Antonio = new Professor(); //Polimorfismo, inst�nciada novo professor filho da super classe Funcionario
    Funcionario Andre = new Administrativo(); //Polimorfismo, inst�nciada novo administrativo filho da super classe Funcionario
    Funcionario Pedro = new Diretor();
    Pedro.verificarTipoFuncionario(Pedro);// Instaciado o objeto Pedro
    Antonio.verificarTipoFuncionario(Antonio);//Instaciado o objeto Antonio
    Andre.verificarTipoFuncionario(Andre);//Instaciado o objeto Andre
    Pedro = new Diretor();
    
    
 }

          public static void verificarTipoFuncionario(Funcionario objeto){//Cria um metodo do tipo void verificarTipoFuncionario para verificar 
        	  //Funcionario
        	  
        	  if (objeto instanceof Diretor)
        		  System.out.println("Objeto � do tipo DIretor");
        	  else if (objeto instanceof Professor)
        	  System.out.println("Professor");
        	  else 
        		  System.out.println("Administrativo");
        	  
        	  
          }
          
          public static void main1(String[] args) {
        	  
        	  Funcionario objeto;
        	  objeto = new Diretor();
        	  ((Diretor)objeto).departamento = "Rh";//Exemplo de casting
        	  verificarTipoFuncionario(objeto);
        	  
          }
          
          public abstract void getBonifica��o();
          
        	  
        	  
          

}