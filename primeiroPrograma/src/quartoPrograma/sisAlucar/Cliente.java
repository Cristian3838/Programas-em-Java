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
