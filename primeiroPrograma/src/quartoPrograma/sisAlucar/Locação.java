package quartoPrograma.sisAlucar;

import java.time.LocalDate;

public class Locação {
	
	private long idLocação; //Atributo idlocação
	private long idCarro; //Atributo idCarro
	private long idCliente; //Atributo idCliente
	private float valorLocado; //Atributo valorLocado
	private LocalDate datainicio; //Atributo datainicio.
	private LocalDate datafim ; //Atributo datafim
      
	
	public long getIdLocação() {
		return idLocação;
	}

	public void setIdLocação(long idLocação) {
		this.idLocação = idLocação;
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
