package terceiroPrograma.sisAlucar;

import java.time.LocalDate;
import java.util.Locale;

public class sisalucarAPP {

	public static void main(String[] args) {
		Carro carro1 = new Carro(); //Realizada a cria��o de um objeto.
		carro1.idCarro = 1;
		carro1.modelo = "gol";
		carro1.placa = "jdk-0001";
		carro1.cor = "azul";
		carro1.ano = 2013;
		carro1.valorDiaria = 99.90f;
		carro1.fabricante = "volkswagen";
		
		
		Carro carro2 = new Carro(); //Realizada a cria��o do segundo objeto.
		
		Cliente cliente1 = new Cliente(); //Rralizada a cria��o do objeto Cliente
		cliente1.idCliente = 1;
		cliente1.cpf = "12345678-90";
		cliente1.nome = "Jo�o Pedro";
		cliente1.cnh = "XYZ0001";
		
		
		Cliente cliente2 = new Cliente(); //Realizada a cria��o do segundo objeto Cliente.
		
		
		

	}
	
	public void realizarLocacao(long idCarro, long idCliente) {
		Loca��o loca��o = new Loca��o();
		loca��o.idCarro = idCarro;
		loca��o.idCliente = idCliente;
		loca��o.idLoca��o = 1;
		loca��o.datainicio = LocalDate.now(); //Usu�rio Aloca o carro hoje
		loca��o.datafim = LocalDate.now().plusDays(2); //Usu�rio devolve daqui a dois dias o carro.
	    loca��o.valorLocado = 2 * 99.90f;
		
		}
       //Criar um m�todo gerarRelat�tioLoca��o que mostre todas as loca��es realizadas nos ultimos 5 dias, crie pelo menos uma vari�vel local 
	   //para calcular o total faturado neste per�odo.
	
	  // public void gerarRelat�rioLoca��o(LocalDate datainicial, LocalDate dataFinal) { Exemplos de vari�veis locais, s� vis�veis pelo m�todo
	
	    public void gerarRealt�rioLoca��o(LocalDate...datas) { // Exemplo de varargs para descrever quantas vari�veis poss�veis do c�digo do desenvolvedor
		  
		  float totalFaturado = 2 * 99.90f; // Cria uma vari�vel loca��o que mostra o total faturado.
		  
		  
		  
	  }
}
