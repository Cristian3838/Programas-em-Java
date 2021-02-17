package terceiroPrograma.sisAlucar;

public class Cliente {
	long idCliente; //Atributo idCliente
	String cpf; //Atributo cpf
	String nome; //Atributo nome
	String cnh; //Atributo cnh
	
	
	
	public Cliente(long idCliente, String cpf, String nome, String cnh) {// Cria um método construtor para passarmos os valores das variáveis declaradas referente aos atributos declarados
    	//dentro da classe.
		
		
		this.idCliente = idCliente; //Significa que o atributo long idCliente vai receber a variável idCliente para fazer a distinção se usa o this
		this.cpf = cpf;
		this.nome = nome;
		this.cnh = cnh;
	}
	
	public Cliente() {
		//Cria um método construtor vazio para criarmos ou declararmos objetos vazios
	}
	
	
	
	

}
