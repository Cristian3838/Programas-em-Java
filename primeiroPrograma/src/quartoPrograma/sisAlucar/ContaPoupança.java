package quartoPrograma.sisAlucar;

import quartoPrograma.Conta;

public class ContaPoupan�a extends Conta {
	
	public void atualiza(double taxa){ //Exemplo de anula��o da Super classe Conta de met�do atualiza
	 	   super.saldo = super.saldo + super.saldo*taxa*3;
	 	   
	 	   
	    }

}
