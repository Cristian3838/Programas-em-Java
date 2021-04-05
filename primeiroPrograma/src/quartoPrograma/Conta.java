package quartoPrograma;

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
           private int numero;
           private double saldo;
           private double limite;
           private Cliente cliente[];
		
           
           
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

		public Cliente[] getCliente() {
			return cliente;
		}

		public void setCliente(Cliente[] cliente) {
			this.cliente = cliente;
		}

		public boolean saca(double valor) // Cria um método construtor double do tipo boolena que retorna verdadeiro ou falso
           {
        	   if(valor<=saldo) {
        		   saldo = saldo-valor;
        		   return true;
        		   }
        	   else{
        	   
        		   return false;// Não conseguiu realizar o saque
        	   
        		   }
           }
           
           public void deposita(double valor){
        	   saldo = saldo+valor;
        	   
        	   
           }
           
           public void transfere(Conta destino, double valor) {
        	   if(valor<=saldo) {
        		   saldo = saldo - valor;
        		   destino.deposita(valor);
        	   }else {
        		   
        		   System.out.println("Não foi possível realizar a transferência");
        	   }
        	   
           }
           
           //Implemente o método transfere conforme o trecho de código abaixo
           //conta1.transfere(conta2, 50)
           //a leitura deste código seria "conta1 tranfere para a conta2 50 reais
           
           public static void main(String[] args) {
			Conta conta = new Conta(); // Cria o objeto conta
			conta.cliente = new Cliente[5];	// Cria a relação de 1 até 5 clientes	
		}
}
