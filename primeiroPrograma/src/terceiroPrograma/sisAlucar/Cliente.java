package terceiroPrograma.sisAlucar;

public class Cliente {
	long idCliente; //Atributo idCliente
	String cpf; //Atributo cpf
	String nome; //Atributo nome
	String cnh; //Atributo cnh
	
	
	
	public Cliente(long idCliente, String cpf, String nome, String cnh) {// Cria um m�todo construtor para passarmos os valores das vari�veis declaradas referente aos atributos declarados
    	//dentro da classe.
		
		
		this.idCliente = idCliente; //Significa que o atributo long idCliente vai receber a vari�vel idCliente para fazer a distin��o se usa o this
		this.cpf = cpf;
		this.nome = nome;
		this.cnh = cnh;
	}
	
	public Cliente() {
		//Cria um m�todo construtor vazio para criarmos ou declararmos objetos vazios
	}
	
	
	
	

}
