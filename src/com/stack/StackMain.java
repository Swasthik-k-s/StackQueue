package com.stack;

public class StackMain {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.print();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.print();
	}

}
