package terceiroPrograma.sisAlucar;

import java.time.LocalDate;

public class Loca��o {
	
	long idLoca��o; //Atributo idloca��o
	long idCarro; //Atributo idCarro
	long idCliente; //Atributo idCliente
	float valorLocado; //Atributo valorLocado
	LocalDate datainicio; //Atributo datainicio.
	LocalDate datafim ; //Atributo datafim
      
	
	public Loca��o(long idLoca��o, long idCarro, long idCliente, float valorLocado, LocalDate datainicio, LocalDate datafim) {
		// Cria um m�todo construtor para passarmos os valores das vari�veis declaradas referente aos atributos declarados
    	//dentro da classe.
		
		this.idLoca��o = idLoca��o; //Significa que o atributo long idLoca��o vai receber a vari�vel idLoca��o para fazer a distin��o se usa o this
		this.idCarro = idCarro;
		this.idCliente = idCliente;
		this.valorLocado = valorLocado;
		this.datainicio = datainicio;
		this.datafim = datafim;
		
		
	}
	
	public Loca��o() {
		
		//Cria um m�todo construtor vazio para criarmos ou declararmos objetos vazios
	}
}
