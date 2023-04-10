package Incremental;

import Singleton.Singleton;

public class Incremental {
private static int count = 0;
private int numero;
private static Incremental incremento;

	private Incremental () {
		numero =++count;
	}
	
	public static synchronized Incremental getInt() {
		if(incremento == null) {
			incremento = new Incremental();
		}
		
		System.out.println(incremento);
		return incremento;
	}
	
}
