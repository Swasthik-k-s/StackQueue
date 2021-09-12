package com.stackqueue;

public class Main {

	public static void main(String[] args) {
		StackQueue stackQueue = new StackQueue();
		stackQueue.push(70);
		stackQueue.push(30);
		stackQueue.push(56);
		stackQueue.print();
		stackQueue.pop();
		stackQueue.pop();
		stackQueue.pop();
		stackQueue.print();
	}

}
