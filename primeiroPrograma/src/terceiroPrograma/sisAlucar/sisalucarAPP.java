package terceiroPrograma.sisAlucar;

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
	
		
		}

}
