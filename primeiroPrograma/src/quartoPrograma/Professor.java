package quartoPrograma;

public class Professor extends Funcionario implements Autenticavel, Cidadao, Contribuinte{

	@Override // Métodos que fazem a anulação
	public void getBonificação() {
		// TODO Auto-generated method stub
		
	}//Criada a Sub classe Professor filha de Funcionario

	@Override // Métodos que fazem a anulação
	public void pagaIR() {
		// TODO Auto-generated method stub
		
	}

	@Override // Métodos que fazem a anulação
	public String getCPF() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override // Métodos que fazem a anulação
	public void vota() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getRG() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean atentica(String senha) {
		// TODO Auto-generated method stub
		return false;
	}

}
