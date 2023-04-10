package Exemplo1;

public class YahooHandler implements EmailHeadler{
	private EmailHeadler sucessor;
	
	YahooHandler(EmailHeadler sucessor){
		this.sucessor=sucessor;
	}
	public void verificarEmail(Email email) {
		if(email.getEnderecoDestino().endsWith("@Yahoo.com")){
			System.out.println(String.format("Yahoo: e-mail armazenado na Caixa de Entrada", null));
			}else{
			sucessor.verificarEmail(email);
			}
	}

}
