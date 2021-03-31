package quartoPrograma.sisAlucar;

//Na Classe Carro criar um atributo de classe Revendedor do tipo enumeration com as seguintes propriedades de um revendedor de carros
//cnpj, endere�o, fabricante.

public enum Revendedor {

	//Criar 03 revendedores
	//Esses revendedores ter�o 03 propr�edades CNPJ, Endere�o e fabricante.
	
	ABCVE�CULOS("101010/0001", "Rua das Perdizes, 1500", "Volkswagen"), 
	SIM�OVE�CULOS("010101/0001", "Av. Morumbi, 2500", "Honda"), 
	EMANUELVE�CULOS("111111/0001", "Av. das Na��es, 100", "Toyota");
	
	private Revendedor(String cnpj, String endereco, String fabricante) {//Criado um m�todo construtor para essas 03 propriedades
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.fabricante = fabricante;
	}
	String cnpj;
	String endereco;
	String fabricante;
	
	
	
	
}


