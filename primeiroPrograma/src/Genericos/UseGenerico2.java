package Genericos;

public class UseGenerico2 {
	
	public static void main(String[] args) {
		
		Login<String, String> iob = new Login< String, String>("Cristian", "@123");
				
				iob.showType();
	}
	
	

}
