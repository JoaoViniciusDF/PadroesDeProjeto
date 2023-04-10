package Exemplo1;

public class Outlook implements EmailHeadler{
	private EmailHeadler sucessor;
	
		Outlook(EmailHeadler sucessor){
			this.sucessor=sucessor;
		}
	
		public void verificarEmail(Email email) {
			if(email.getEnderecoDestino().endsWith("@Outlook.com")){
				System.out.println(String.format("Outlook: e-mail armazenado na Caixa de Entrada", null));
				}else{
				sucessor.verificarEmail(email);
				}
		}
}
