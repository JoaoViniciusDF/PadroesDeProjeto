package Exemplo1;

public class Somar implements Interpreter {

    private Interpreter esquerda;
    private Interpreter direita;

    public Somar(Interpreter esquerda, Interpreter direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }
    
    @Override
    public int interpretar() {
        return this.esquerda.interpretar() + this.direita.interpretar();
    }

}