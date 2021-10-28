package com.datastructure;

/*
 * Ability to create Linked List by appending 30 and 70 to 56
 */
public class MyNodeTest {

	public static void main(String[] args) {

		System.out.println("Welcome To Linked List Computation Program");

		// create a nodes
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);

		MyLinkedList myLinkedList = new MyLinkedList();

		// append the new element to the tail (at the end)
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.printNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myFirstNode);
		if (result == true)
			System.out.println("Nodes are linked");
		else
			System.out.println("Nodes are not linked");
	}

}
