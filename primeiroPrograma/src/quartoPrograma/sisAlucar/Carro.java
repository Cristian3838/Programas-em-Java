package quartoPrograma.sisAlucar;

//Criar atributos e metodos para a classe 
//Carro ( idCarro, placa, fabricante, modelo, ano, cor, valorDiaria)
//Na Classe Carro criar um atributo de classe Revendedor do tipo enumeration com as seguintes propriedades de um revendedor de carros
//cnpj, endere�o, fabricante.




public class Carro { //Classe Carro
	
	private long idCarro; //Atributo idCarro
	private String placa; //Atributo placa
	private String fabricante; //Atributo fabricante
	private String modelo; //Atributo modelo
	private int ano; // Atributo ano
	private String cor; // Atributo cor
	private float valorDiaria; // Atributo valorDiaria
	private Revendedor revendedor; // Queremos saber de qual revendedor compramos aquele determinado carro.
	
	public long getIdCarro() {
		
		return this.idCarro;
	}
	
	public void setIdCarro(long idCarro) {
		
	     this.idCarro = idCarro;
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public Revendedor getRevendedor() {
		return revendedor;
	}

	public void setRevendedor(Revendedor revendedor) {
		this.revendedor = revendedor;
	}

	public Carro(long idCarro, String placa,String fabricante,String modelo,int ano,String cor,float valorDiaria, Revendedor revendedor) { // Cria um m�todo construtor
	//passando como par�metro os atributos definidos acima.
	
	super(); //Chama o construtor da super classe
	this.idCarro = idCarro; //Significa que o atributo long idCarro vai receber a vari�vel idCarro para fazer a distin��o se usa o this
	this.placa = placa;
	this.fabricante = fabricante;
	this.modelo = modelo;
	this.ano = ano;
	this.cor = cor;
	this.valorDiaria = valorDiaria;
	this.revendedor = revendedor; 
}
	
	
	public Carro() {//Cria um m�todo construtor vazio para criarmos ou declararmos objetos vazios
		
	}
    public static void main(String[] args) {// Cria um m�todo construtor para passarmos os valores das vari�veis declaradas referente aos atributos declarados
    	//dentro da classe.
    	
    	
    	
    	Carro carro1 = new Carro(1, "ABC-0001", "Volks", "Gol", 2013, "Azul", 99.90f, Revendedor.EMANUELVE�CULOS);
    	Carro carro2 = new Carro(); // Este objeto vazio s� foi aceito pois criamos um m�todo construtor acima vazio.
    	
    
    }


}
