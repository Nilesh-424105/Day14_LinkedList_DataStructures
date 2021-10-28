package com.datastructure;

/*
 * Ability to insert 40 after 30 to the Linked List sequence of 56->30->70
 */
public class MyNodeTest {

	public static void main(String[] args) {

		System.out.println("Welcome To Linked List Computation Program");

		// create a nodes
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyNode<Integer> myNewNode = new MyNode<Integer>(40);

		MyLinkedList myLinkedList = new MyLinkedList();

		// add the new element to the head (at the start)
		// append the new element to the tail (at the end)
		// insert the new node
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		myLinkedList.printNodes();

		// Insert new element node 40 after node 30
		System.out.println("LinkedList After adding 40 after 30");
		INode searchForNode = myLinkedList.search();
		myLinkedList.insert(searchForNode, myNewNode);
		myLinkedList.printNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myFirstNode);
		if (result == true)
			System.out.println("Nodes are linked");
		else
			System.out.println("Nodes are not linked");
	}

}
