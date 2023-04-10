package Exemplo1;

public class GmailHadler implements EmailHeadler{
	private EmailHeadler sucessor;
	
		GmailHadler(EmailHeadler sucessor){
			this.sucessor=sucessor;
		}

	public void verificarEmail(Email email) {
		
		if(email.getEnderecoDestino().endsWith("@gmail.com")){
			System.out.println(String.format("Gmail: e-mail armazenado na Caixa de Entrada", null));
			}else{
			sucessor.verificarEmail(email);
			}
	}
}
