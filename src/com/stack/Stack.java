package com.stack;

public class Stack {

	private Node head;

	private class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void pop() {
		if(head == null) {
			System.out.println("Stack is Empty");
		} else {
			System.out.println(head.data + " Deleted");
			head = head.next;
		}
	}

	public void print() {
		Node temp = head;

		if(temp == null) {
			System.out.println("Stack is Empty");
			return;
		} else {
			System.out.println("Stack");
		}

		while(temp.next != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
}
