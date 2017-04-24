package com.bridgelabz.Util;

public class Stack {

	int capacity = 0;
	char stack[];
	int top = -1;

	Stack(int capacity) {
		this.capacity = capacity;
		stack = new char[capacity];
	}

	void push(char obj) {
		if (top == capacity - 1) {
			System.out.println("stack overflow");
		}
		top++;
		stack[top] = obj;
	}

	char pop() {
		if (top == -1) {
			System.out.println("stack underflow");
		}
		return stack[top--];
	}

	boolean isEmpty() {
		return top == -1;
	}
}
