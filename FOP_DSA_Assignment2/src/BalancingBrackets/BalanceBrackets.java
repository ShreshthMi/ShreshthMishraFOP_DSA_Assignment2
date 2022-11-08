package BalancingBrackets;

public class BalanceBrackets {
	String e;
	Character[] brackets;

	BalanceBrackets(String expression) {
		this.e = expression;
	}

	public boolean checkBalanceImplementation() {

		int len = e.length();
		brackets = new Character[len];
		if (len % 2 != 0) {
			return false;
		} else {
			for (int j = 0; j < brackets.length; j++) {
				brackets[j] = e.charAt(j);
			}

			return checkBalance();
		}
	}

	public boolean checkBalance() {

		StackUtil openBrackets = new StackUtil();

		for (int i = 0; i < brackets.length; i++) {
			if (brackets[i] == '{' || brackets[i] == '[' || brackets[i] == '(') {
				openBrackets.push(brackets[i]);
				continue;
			}
			if (openBrackets.isEmpty()) {
				return false;
			}
			char lastOpenBracket;
			switch (brackets[i]) {
			case ')':
				lastOpenBracket = openBrackets.pop();
				if (lastOpenBracket == '{' || lastOpenBracket == '[')
					return false;
				break;

			case '}':
				lastOpenBracket = openBrackets.pop();
				if (lastOpenBracket == '(' || lastOpenBracket == '[')
					return false;
				break;

			case ']':
				lastOpenBracket = openBrackets.pop();
				if (lastOpenBracket == '(' || lastOpenBracket == '{')
					return false;
				break;
			}
		}

		return (openBrackets.isEmpty());
	}
}
