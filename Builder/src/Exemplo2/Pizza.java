package Exemplo2;
public class Pizza {
    private String molho;
    private String queijo;
    private String cogumelos;
    private String pimentoes;

    public Pizza(String molho, String queijo, String cogumelos, String pimentoes) {
    	
        this.molho = molho;
        this.queijo = queijo;
        this.cogumelos = cogumelos;
        this.pimentoes = pimentoes;
        
    }

    public String getMolho() {
        return molho;
    }

    public String getQueijo() {
        return queijo;
    }

    public String getCogumelos() {
        return cogumelos;
    }

    public String getPimentoes() {
        return pimentoes;
    }
    
    @Override
    public String toString() {
    	return "queijo - " + queijo + " - cogumelos - " + cogumelos + " - pimentões - " + pimentoes;
    }
}





