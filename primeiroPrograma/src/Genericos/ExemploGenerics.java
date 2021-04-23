package Genericos;

//Exemplo de classe Genérica

public class ExemploGenerics<T> {
	
	T obj; // Chama T de objeto.
		
		public  ExemploGenerics(T obj) { // Cria um construtor que recebe esse T genérico
		
		super();
		this.obj = obj;
	}

		public T getObj() {
			return obj;
		}

		public void setObj(T obj) {
			this.obj = obj;
		}
		
		
		public void showType() {
			
			
			System.out.println(obj.getClass().getName()); // Traz o nome da classe e o nome do objeto
			
		}

}
