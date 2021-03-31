package quartoPrograma.sisAlucar;

//Na Classe Carro criar um atributo de classe Revendedor do tipo enumeration com as seguintes propriedades de um revendedor de carros
//cnpj, endereço, fabricante.

public enum Revendedor {

	//Criar 03 revendedores
	//Esses revendedores terão 03 propríedades CNPJ, Endereço e fabricante.
	
	ABCVEÍCULOS("101010/0001", "Rua das Perdizes, 1500", "Volkswagen"), 
	SIMÃOVEÍCULOS("010101/0001", "Av. Morumbi, 2500", "Honda"), 
	EMANUELVEÍCULOS("111111/0001", "Av. das Nações, 100", "Toyota");
	
	private Revendedor(String cnpj, String endereco, String fabricante) {//Criado um método construtor para essas 03 propriedades
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.fabricante = fabricante;
	}
	String cnpj;
	String endereco;
	String fabricante;
	
	
	
	
}


