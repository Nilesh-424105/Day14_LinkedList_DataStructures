package com.datastructure;

public class MyNodeTest {

	public static void main(String[] args) {

		System.out.println("Welcome To Linked List Computation Program");

		// create a nodes
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);

		MyLinkedList myLinkedList = new MyLinkedList();

		// add the new element to the head (at the start)
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myFirstNode);
		if (result == true)
			System.out.println("Nodes are linked");
		else
			System.out.println("Nodes are not linked");
	}

}
