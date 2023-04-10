package Exemplo1;

public class Email {
private String enderecoRemetente;
private String enderecoDestino;
private EmailHeadler inter;


	Email (String enderecoDestino, EmailHeadler inter){
		this.enderecoDestino =  enderecoDestino;
		this.inter=inter;
	}
	
	public void verificacao(Email email) {
		inter.verificarEmail(email);
	}
	
	
	public String getEnderecoDestino() {
		return enderecoDestino;
	}
	

}
