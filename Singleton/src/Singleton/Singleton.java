package Singleton;

public class Singleton {
private static Singleton instancia;

	private Singleton ( ) {
		
	}
	
	public static synchronized Singleton getInstancia() {
		
		if(instancia == null) {
			instancia = new Singleton();
		}
		
		System.out.println(instancia);
		return instancia;
		
	}
}
