package quartoPrograma;

public class Professor extends Funcionario implements Autenticavel, Cidadao, Contribuinte{

	@Override // M�todos que fazem a anula��o
	public void getBonifica��o() {
		// TODO Auto-generated method stub
		
	}//Criada a Sub classe Professor filha de Funcionario

	@Override // M�todos que fazem a anula��o
	public void pagaIR() {
		// TODO Auto-generated method stub
		
	}

	@Override // M�todos que fazem a anula��o
	public String getCPF() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override // M�todos que fazem a anula��o
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
