package com.queue;

public class Queue {
	private Node head;

	private class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void enQueue(int data) {
		Node newNode = new Node(data);

		if(head == null) {
			head = newNode;
		} else {
			Node temp = head;

			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public void deQueue() {
		if(head == null) {
			System.out.println("Queue is Empty");
		} else {
			System.out.println(head.data + " Deleted");
			head = head.next;
		}
	}

	public void print() {
		Node temp = head;

		if(temp == null) {
			System.out.println("Queue is Empty");
			return;
		} else {
			System.out.println("Queue");
		}

		while(temp.next != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
}
