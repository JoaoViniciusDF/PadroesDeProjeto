package Exemplo2;

import java.util.ArrayList;

public class FerramentaBackup {
	
    private final ArrayList<ShadowCopy> mementos = new ArrayList<ShadowCopy>();

    public void save(ShadowCopy memento) {
        mementos.add(memento);
    }

    public ShadowCopy restore(int posicao) {
        return mementos.get(posicao);
    }
}
