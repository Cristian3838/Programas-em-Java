package terceiroPrograma.sisAlucar;

//Criar atributos e metodos para a classe 
//Carro ( idCarro, placa, fabricante, modelo, ano, cor, valorDiaria)
//Na Classe Carro criar um atributo de classe Revendedor do tipo enumeration com as seguintes propriedades de um revendedor de carros
//cnpj, endere�o, fabricante.




public class Carro { //Classe Carro
	
	long idCarro; //Atributo idCarro
	String placa; //Atributo placa
	String fabricante; //Atributo fabricante
	String modelo; //Atributo modelo
	int ano; // Atributo ano
	String cor; // Atributo cor
	float valorDiaria; // Atributo valorDiaria
	Revendedor revendedor; // Queremos saber de qual revendedor compramos aquele determinado carro.
	
	
	
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
