package Exemplo2;

public class Main {

	public static void main(String[] args) {
		Expression isMale = InterpreterPatternDemo.getMaleExpression();
	    Expression isMarriedWoman = InterpreterPatternDemo.getMarriedWomanExpression();

	     System.out.println("John é homem? " + isMale.interpret("John"));
	     System.out.println("Julie é uma mulher casada? " + isMarriedWoman.interpret("Married Julie"));

	}

}
