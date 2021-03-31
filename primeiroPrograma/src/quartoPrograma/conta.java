package quartoPrograma;

import terceiroPrograma.Conta;

public class conta {
	
	//Atributos
    private int numero;
    private double saldo;
    private double limite;
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

	public boolean saca(double valor) // Cria um método construtor double do tipo boolena que retorna verdadeiro ou falso
    {
 	   if (valor <= saldo)
 	   {
 		   saldo = saldo - valor;
 		   return true;
 		   
 	   }else
 	   return false; // Como foi criado um método construtor do tipo boolean é obrigatório retornar ou veradeiro ou falso
 	   //Não tem saldo
    
    }
    
    public void deposita(double valor){
 	   
 		   saldo = saldo + valor;
 	}
    
    public void transfere(Conta destino, double valor) {
 	   if(valor<= saldo) {
 		   saldo = saldo - valor;
 		   destino.deposita(valor);
 		   
 	   }else
 		   System.out.println("Não foi possível realizar a transferência");
 	   
    }

}
