package quartoPrograma.sisAlucar;

import java.time.LocalDate;
import java.util.Locale;

public class sisalucarAPP {
    
	
	
	static int totalCarros = 0; // TotalCarros � um atributo est�tico da classe sisalucarAPP
	//A medida que vamos criando objetos carros, vamos incrementando este contador
	
	
	public static void main(String[] args) {
		Carro carro1 = new Carro(); //Realizada a cria��o de um objeto.
		carro1.setIdCarro(1);
		carro1.setModelo("gol");
		carro1.setPlaca("jdk-0001");
		carro1.setCor("azul");
		carro1.setAno(2013);
		carro1.setValorDiaria(99.90f);
		carro1.setFabricante("volkswagen");
		
		totalCarros = totalCarros + 1;
		
		
		Carro carro2 = new Carro(); //Realizada a cria��o do segundo objeto.
		
		Cliente cliente1 = new Cliente(); //Rralizada a cria��o do objeto Cliente
		cliente1.setIdCliente(1);
		cliente1.setCpf("12345678-90");
		cliente1.setNome("Jo�o Pedro");
		cliente1.setCnh("XYZ0001");
		
		sisalucarAPP sisalucar = new sisalucarAPP();
		sisalucar.realizarLocacao(carro1.getIdCarro(), cliente1.getIdCliente(),carro1.getValorDiaria());
		
		gerarRealt�rioLoca��o(carro1, LocalDate.now(), LocalDate.now().plusDays(5));// M�todo de classe n�o precisa chamar a classe sisalucarAPP
		
		
		Cliente cliente2 = new Cliente(); //Realizada a cria��o do segundo objeto Cliente.
		
		
		

	}
	
	

	public void realizarLocacao(long idCarro, long idCliente, float valorDiaria) {
		Loca��o loca��o = new Loca��o();
		loca��o.setIdCarro(idCarro);
		loca��o.setIdCliente(idCliente);
		loca��o.setIdLoca��o(1);
		loca��o.setDatainicio(LocalDate.now()); //Usu�rio Aloca o carro hoje
		loca��o.setDatafim(LocalDate.now().plusDays(2)); //Usu�rio devolve daqui a dois dias o carro.
	    loca��o.setValorLocado(2 * valorDiaria);
		
		}
       //Criar um m�todo gerarRelat�tioLoca��o que mostre todas as loca��es realizadas nos ultimos 5 dias, crie pelo menos uma vari�vel local 
	   //para calcular o total faturado neste per�odo.
	
	  // public void gerarRelat�rioLoca��o(LocalDate datainicial, LocalDate dataFinal) { Exemplos de vari�veis locais, s� vis�veis pelo m�todo
	
	    public static void gerarRealt�rioLoca��o(Carro carro1, LocalDate now, LocalDate ...datas) { // Exemplo de varargs para descrever quantas vari�veis poss�veis do c�digo do desenvolvedor
		  //static define o m�todo como sendo um m�todo de classe
		  float totalFaturado = carro1.getValorDiaria(); // Cria uma vari�vel loca��o que mostra o total faturado.
		  
		  
		  
	  } //Transformamos o m�todo gerarRealt�rioLoca��o em um m�todo de classe, que no caso sisalucarAPP
}
