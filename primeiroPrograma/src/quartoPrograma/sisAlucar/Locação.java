package quartoPrograma.sisAlucar;

import java.time.LocalDate;

public class Loca��o {
	
	private long idLoca��o; //Atributo idloca��o
	private long idCarro; //Atributo idCarro
	private long idCliente; //Atributo idCliente
	private float valorLocado; //Atributo valorLocado
	private LocalDate datainicio; //Atributo datainicio.
	private LocalDate datafim ; //Atributo datafim
      
	
	public long getIdLoca��o() {
		return idLoca��o;
	}

	public void setIdLoca��o(long idLoca��o) {
		this.idLoca��o = idLoca��o;
	}

	public long getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(long idCarro) {
		this.idCarro = idCarro;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public float getValorLocado() {
		return valorLocado;
	}

	public void setValorLocado(float valorLocado) {
		this.valorLocado = valorLocado;
	}

	public LocalDate getDatainicio() {
		return datainicio;
	}

	public void setDatainicio(LocalDate datainicio) {
		this.datainicio = datainicio;
	}

	public LocalDate getDatafim() {
		return datafim;
	}

	public void setDatafim(LocalDate datafim) {
		this.datafim = datafim;
	}

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
