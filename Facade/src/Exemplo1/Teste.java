package Exemplo1;

public class Teste {

	public static void main(String[] args) {
	Cliente cliente = new Cliente();
	Cpu cpu = new Cpu();
	HardDrive hd = new HardDrive();
	Memoria memoria = new Memoria();
	ComputadorFacade facade = new ComputadorFacade(cpu, memoria, hd);
	facade.ligarComputador();

	}

}
