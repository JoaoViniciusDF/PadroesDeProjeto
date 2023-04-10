package Exemplo1;

public class Main {

	public static void main(String[] args) {
		EmailHeadler Yahoo = new YahooHandler(null);
		EmailHeadler Outlook = new Outlook(Yahoo);
		EmailHeadler gmail = new GmailHadler(Outlook);
		
		Email email = new Email ("Ana@gmail.com",gmail);
		Email ana = new Email ("Ana@Outlook.com",gmail);
		Email jacson = new Email ("jacson@Yahoo.com",gmail);
		
		email.verificacao(email);
		ana.verificacao(ana);
		jacson.verificacao(jacson);
	}

}
