package Exemplo2;

public class Server {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public ShadowCopy save() {
        return new ShadowCopy(state);
    }

    public void restore(ShadowCopy memento) {
        state = memento.getState();
    }

	public String getState() {
		
		return state;
	}
}
