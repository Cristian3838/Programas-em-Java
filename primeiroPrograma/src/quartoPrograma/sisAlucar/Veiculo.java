package quartoPrograma.sisAlucar;

public class Veiculo {
	
	// Criar os 4 métodos dessa Super classe
	protected float autonomia;// Se Privado a subclasse não vê, Se Protected a subclasse vê.
	public void acelera() {}
	public void freia() {}
	public float getVelocidade() {return 0;} // Float precisa de retorno
	public int getPassageiros() {return 0;} // Int precisa de retorno

}
