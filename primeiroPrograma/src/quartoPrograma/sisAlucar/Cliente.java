package quartoPrograma.sisAlucar;

public class Cliente {
	private long idCliente; //Atributo idCliente
	private String cpf; //Atributo cpf
	private String nome; //Atributo nome
	private String cnh; //Atributo cnh
	
	
	
	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

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
