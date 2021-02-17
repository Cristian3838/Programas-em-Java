package terceiroPrograma.sisAlucar;

import java.time.LocalDate;

public class Locação {
	
	long idLocação; //Atributo idlocação
	long idCarro; //Atributo idCarro
	long idCliente; //Atributo idCliente
	float valorLocado; //Atributo valorLocado
	LocalDate datainicio; //Atributo datainicio.
	LocalDate datafim ; //Atributo datafim
      
	
	public Locação(long idLocação, long idCarro, long idCliente, float valorLocado, LocalDate datainicio, LocalDate datafim) {
		// Cria um método construtor para passarmos os valores das variáveis declaradas referente aos atributos declarados
    	//dentro da classe.
		
		this.idLocação = idLocação; //Significa que o atributo long idLocação vai receber a variável idLocação para fazer a distinção se usa o this
		this.idCarro = idCarro;
		this.idCliente = idCliente;
		this.valorLocado = valorLocado;
		this.datainicio = datainicio;
		this.datafim = datafim;
		
		
	}
	
	public Locação() {
		
		//Cria um método construtor vazio para criarmos ou declararmos objetos vazios
	}
}
