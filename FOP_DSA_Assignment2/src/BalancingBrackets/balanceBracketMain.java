package BalancingBrackets;

public class balanceBracketMain {

	public static void main(String[] args) {

		String expression = "([[{}]])"; // replace expression, expression2 with input String brackets with Scanner class
		String expression1 = "([[{}]]))";

		BalanceBrackets bb = new BalanceBrackets(expression);

		if (bb.checkBalanceImplementation()) {
			System.out.println("Given expression: " + bb.e);
			System.out.println("The entered String has Balanced Brackets.");
		} else {
			System.out.println("Given expression: " + bb.e);
			System.out.println("The entered String do not contain Balanced Brackets.");
		}

		bb = new BalanceBrackets(expression1);

		if (bb.checkBalanceImplementation()) {
			System.out.println("Given expression: " + bb.e);
			System.out.println("The entered String has Balanced Brackets.");
		} else {
			System.out.println("Given expression: " + bb.e);
			System.out.println("The entered String do not contain Balanced Brackets.");
		}

	}

}
