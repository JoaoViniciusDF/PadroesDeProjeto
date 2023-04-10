package Exemplo1;

public class Subtrair implements Interpreter {

    private Interpreter esquerda;
    private Interpreter direita;

    public Subtrair(Interpreter esquerda, Interpreter direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int interpretar() {
        return this.esquerda.interpretar() - this.direita.interpretar();
    }

}

