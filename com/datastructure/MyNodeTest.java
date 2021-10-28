package com.datastructure;

/*
 * Ability to delete the Last element in the LinkedList of sequence 56->30->70
 */
public class MyNodeTest {

	public static void main(String[] args) {

		System.out.println("Welcome To Linked List Computation Program");

		// create a nodes
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);

		MyLinkedList myLinkedList = new MyLinkedList();

		// add the new element to the head (at the start)
		// append the new element to the tail (at the end)
		// insert the new node
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		myLinkedList.printNodes();

		// To Delete Last Element In Linked List By PopLast
		myLinkedList.popLast();
		System.out.println("LinkedList after popping the last element");
		myLinkedList.printNodes();

		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myFirstNode);
		if (result == true)
			System.out.println("Nodes are linked");
		else
			System.out.println("Nodes are not linked");
	}

}
