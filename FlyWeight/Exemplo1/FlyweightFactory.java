package Exemplo1;

import java.util.ArrayList;

public class FlyweightFactory {

    protected ArrayList<SpriteFlyweight> flyweights;

    public enum Sprite {
        JOGADOR, INIMIGO_1, INIMIGO_2, INIMIGO_3, CENARIO_1, CENARIO_2
    }

    public FlyweightFactory() {
    	
        flyweights = new ArrayList<SpriteFlyweight>();
        flyweights.add(new SpriteFlyweight("jogador.png"));
        flyweights.add(new SpriteFlyweight("inimigo1.png"));
        flyweights.add(new SpriteFlyweight("inimigo2.png"));
        flyweights.add(new SpriteFlyweight("inimigo3.png"));
        flyweights.add(new SpriteFlyweight("cenario1.png"));
        flyweights.add(new SpriteFlyweight("cenario2.png"));
        
    }

    public SpriteFlyweight getFlyweight(Sprite sprite) {
        switch (sprite) {
            case JOGADOR:
                return flyweights.get(0);
            case INIMIGO_1:
                return flyweights.get(1);
            case INIMIGO_2:
                return flyweights.get(2);
            case INIMIGO_3:
                return flyweights.get(3);
            case CENARIO_1:
                return flyweights.get(4);
            case CENARIO_2:
                return flyweights.get(5);
            default:
                return null;
        }
    }
}
