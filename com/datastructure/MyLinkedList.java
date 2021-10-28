package com.datastructure;

/*
 * Custom Linked List Implementation with operation
 */

public class MyLinkedList {

	public INode head;
	public INode tail;
	private int size;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	/*
	 * Add Node to Front of the List (To the head of the list) and Increments the
	 * size of the list
	 */
	public void add(INode node) {
		if (this.head == null) {
			this.head = node;
		}
		if (this.tail == null) {
			this.tail = node;
		} else {
			INode temp = this.head;
			this.head = node;
			this.head.setNext(temp);
		}
		size++;

	}

	/*
	 * returns the size of the List
	 */
	public int size() {
		return this.size;
	}

	/*
	 * Pints the node keys in the List
	 */
	public void printNodes() {

		StringBuilder nodes = new StringBuilder("Node keys: ");

		INode temp = this.head;
		while (temp != null) {
			nodes.append(temp.getKey());
			if (temp != tail) {
				nodes.append("->");
			}
			temp = temp.getNext();
		}
		System.out.println(nodes);

	}
}
