package terceiroPrograma;

//Crie a classe Conta conforme o diagrama abaixo:

//numero: int
//saldo: double
//limite: double
//nome: String

// E 3 m�todos 

//Saca (valor double): boolean
//deposita(valor: double)
//transfere(destino: Conta, valor: double)


public class Conta {// Cria��o da classe Conta
	
	       //Atributos
           private int numero;
           private double saldo;
           double limite;
           private String nome;
		
           
           
           public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public double getLimite() {
			return limite;
		}

		public void setLimite(double limite) {
			this.limite = limite;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public boolean saca(double valor) // Cria um m�todo construtor double do tipo boolena que retorna verdadeiro ou falso
           {
        	   
        	   return false; // Como foi criado um m�todo construtor do tipo boolean � obrigat�rio retornar ou veradeiro ou falso
           
           }
           
           public void deposita(double valor){
        	   
        	   
        	   
           }
           
           public void transfere(Conta destino, double valor) {
        	   
        	   
           }
           
           //Implemente o m�todo transfere conforme o trecho de c�digo abaixo
           //conta1.transfere(conta2, 50)
           //a leitura deste c�digo seria "conta1 tranfere para a conta2 50 reais
           
           public static void main(String[] args) {
			Conta conta1 = new Conta(); // Cria o objeto conta
					Conta conta2 = new Conta();  // Cria o segundo objeto conta
					
					conta1.transfere(conta2, 50); //a leitura deste c�digo seria "conta1 tranfere para a conta2 50 reais
		}
}
