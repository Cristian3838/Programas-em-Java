package terceiroPrograma.sisAlucar;

//Criar atributos e metodos para a classe 
//Carro ( idCarro, placa, fabricante, modelo, ano, cor, valorDiaria)


public class Carro { //Classe Carro
	
	long idCarro; //Atributo idCarro
	String placa; //Atributo placa
	String fabricante; //Atributo fabricante
	String modelo; //Atributo modelo
	int ano; // Atributo ano
	String cor; // Atributo cor
	float valorDiaria; // Atributo valorDiaria
	
	
	public Carro(long idCarro, String placa,String fabricante,String modelo,int ano,String cor,float valorDiaria) { // Cria um método construtor
	//passando como parâmetro os atributos definidos acima.
	
	super(); //Chama o construtor da super classe
	this.idCarro = idCarro; //Significa que o atributo long idCarro vai receber a variável idCarro para fazer a distinção se usa o this
	this.placa = placa;
	this.fabricante = fabricante;
	this.modelo = modelo;
	this.ano = ano;
	this.cor = cor;
	this.valorDiaria = valorDiaria;
}
	
	
	public Carro() {//Cria um método construtor vazio para criarmos ou declararmos objetos vazios
		
	}
    public static void main(String[] args) {// Cria um método construtor para passarmos os valores das variáveis declaradas referente aos atributos declarados
    	//dentro da classe.
    	
    	
    	
    	Carro carro1 = new Carro(1, "ABC-0001", "Volks", "Gol", 2013, "Azul", 99.90f);
    	Carro carro2 = new Carro(); // Este objeto vazio só foi aceito pois criamos um método construtor acima vazio.
    	
    
    }


}
