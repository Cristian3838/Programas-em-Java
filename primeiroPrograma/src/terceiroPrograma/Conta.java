package terceiroPrograma;

//Crie a classe Conta conforme o diagrama abaixo:

//numero: int
//saldo: double
//limite: double
//nome: String

// E 3 métodos 

//Saca (valor double): boolean
//deposita(valor: double)
//transfere(destino: Conta, valor: double)


public class Conta {// Criação da classe Conta
	
	       //Atributos
           int numero;
           double saldo;
           double limite;
           String nome;
           
           
           public boolean saca(double valor) // Cria um método double do tipo boolena que retorna verdadeiro ou falso
           {
        	   
        	   return false; // Como foi criado um método do tipo boolean é obrigatório retornar ou veradeiro ou falso
           
           }
           
           public void deposita(double valor){
        	   
        	   
        	   
           }
           
           public void transfere(Conta destino, double valor) {
        	   
        	   
           }
           
           //Implemente o método transfere conforme o trecho de código abaixo
           //conta1.transfere(conta2, 50)
           //a leitura deste código seria "conta1 tranfere para a conta2 50 reais
           
           public static void main(String[] args) {
			Conta conta1 = new Conta(); // Cria o objeto conta
					Conta conta2 = new Conta();  // Cria o segundo objeto conta
					
					conta1.transfere(conta2, 50); //a leitura deste código seria "conta1 tranfere para a conta2 50 reais
		}
}
