package com.bridgelabz.Util;

public class Queue {
	Object queue[];
	int rear, front, capacity;

	Queue() {
		capacity = 10;
		rear = front = -1;
		queue = new Object[capacity];
	}

	public Queue(int capacity) {
		this.capacity = capacity;
		rear = front = -1;
		queue = new Object[capacity];
	}

	public void enque(Object object) {
		if (rear == -1) {
			rear = front = 0;
			queue[rear] = object;
			return;
		}
		if (rear >= capacity - 1) {
			System.out.println("queue is full");
			return;
		}
		rear++;
		queue[rear] = object;
	}

	public Object deque() {
		if (front == -1) {
			System.out.println("Queue empty");
			front = rear = -1;
			return null;
		}
		if (front >= rear) {
			Object object = queue[front];
			front = rear = -1;
			return object;
		}
		return queue[front++];
	}

}
