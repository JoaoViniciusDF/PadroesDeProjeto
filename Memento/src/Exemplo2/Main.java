package Exemplo2;

public class Main {
	
    public static void main(String[] args) {
        Server server = new Server();
        FerramentaBackup careTaker = new FerramentaBackup();

        server.setState("State 1");
        careTaker.save(server.save());

        server.setState("State 2");
        careTaker.save(server.save());

        server.restore(careTaker.restore(0));
        System.out.println("Versão do servidor: " + server.getState());

        server.restore(careTaker.restore(1));
        System.out.println("Versão do servidor: " + server.getState());
    }
}
