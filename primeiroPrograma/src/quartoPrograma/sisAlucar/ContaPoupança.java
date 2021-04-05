package quartoPrograma.sisAlucar;

import quartoPrograma.Conta;

public class ContaPoupança extends Conta {
	
	public void atualiza(double taxa){ //Exemplo de anulação da Super classe Conta de metódo atualiza
	 	   super.saldo = super.saldo + super.saldo*taxa*3;
	 	   
	 	   
	    }

}
