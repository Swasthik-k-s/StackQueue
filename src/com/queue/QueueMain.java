package com.queue;

public class QueueMain {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enQueue(56);
		queue.enQueue(30);
		queue.enQueue(70);
		queue.print();
	}

}
