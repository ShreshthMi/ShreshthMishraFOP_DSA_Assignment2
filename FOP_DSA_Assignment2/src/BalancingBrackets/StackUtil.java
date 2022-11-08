package BalancingBrackets;

public class StackUtil {

	static final int size = 1000;
	int current_pointer;
	Character[] stack = new Character[size];

	public StackUtil() {
		current_pointer = -1;
	}

	public void push(Character bracket) {
		if (current_pointer >= size) {
			System.out.println("Stack Overflow");
		} else {
			stack[++current_pointer] = bracket;
		}
	}

	public Character pop() {
		if (current_pointer < 0) {
			return null;
		} else {
			return stack[current_pointer--];
		}
	}

	public boolean isEmpty() {
		if (current_pointer < 0) {
			return true;
		} else {
			return false;
		}
	}

	public void printStack() {
		if (current_pointer == -1) {
			System.out.println("Stack is empty");
		} else {
			for (int i = current_pointer; i > -1; i--) {
				System.out.println(stack[i]);
			}
		}
	}
}
