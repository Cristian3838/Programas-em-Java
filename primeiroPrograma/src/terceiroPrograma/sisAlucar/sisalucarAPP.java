package terceiroPrograma.sisAlucar;

import java.time.LocalDate;
import java.util.Locale;

public class sisalucarAPP {

	public static void main(String[] args) {
		Carro carro1 = new Carro(); //Realizada a criação de um objeto.
		carro1.idCarro = 1;
		carro1.modelo = "gol";
		carro1.placa = "jdk-0001";
		carro1.cor = "azul";
		carro1.ano = 2013;
		carro1.valorDiaria = 99.90f;
		carro1.fabricante = "volkswagen";
		
		
		Carro carro2 = new Carro(); //Realizada a criação do segundo objeto.
		
		Cliente cliente1 = new Cliente(); //Rralizada a criação do objeto Cliente
		cliente1.idCliente = 1;
		cliente1.cpf = "12345678-90";
		cliente1.nome = "João Pedro";
		cliente1.cnh = "XYZ0001";
		
		
		Cliente cliente2 = new Cliente(); //Realizada a criação do segundo objeto Cliente.
		
		
		

	}
	
	public void realizarLocacao(long idCarro, long idCliente) {
		Locação locação = new Locação();
		locação.idCarro = idCarro;
		locação.idCliente = idCliente;
		locação.idLocação = 1;
		locação.datainicio = LocalDate.now(); //Usuário Aloca o carro hoje
		locação.datafim = LocalDate.now().plusDays(2); //Usuário devolve daqui a dois dias o carro.
	    locação.valorLocado = 2 * 99.90f;
		
		}
       //Criar um método gerarRelatótioLocação que mostre todas as locações realizadas nos ultimos 5 dias, crie pelo menos uma variável local 
	   //para calcular o total faturado neste período.
	
	  // public void gerarRelatórioLocação(LocalDate datainicial, LocalDate dataFinal) { Exemplos de variáveis locais, só visíveis pelo método
	
	    public void gerarRealtórioLocação(LocalDate...datas) { // Exemplo de varargs para descrever quantas variáveis possíveis do código do desenvolvedor
		  
		  float totalFaturado = 2 * 99.90f; // Cria uma variável locação que mostra o total faturado.
		  
		  
		  
	  }
}
