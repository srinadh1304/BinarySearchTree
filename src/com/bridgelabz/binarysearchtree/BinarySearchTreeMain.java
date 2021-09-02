package com.bridgelabz.binarysearchtree;

public class BinarySearchTreeMain {
	public static void main(String args[]) {
		System.out.println("******Welcome to Binary Search Tree Program **********");
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(25);
		myBinaryTree.add(20);
		myBinaryTree.add(51);
		myBinaryTree.add(37);
		myBinaryTree.add(1);
		myBinaryTree.add(7);
		myBinaryTree.add(40);
		myBinaryTree.add(35);
		myBinaryTree.add(57);
		myBinaryTree.add(69);
		myBinaryTree.add(67);
		System.out.println("Inorder traversal: ");
		myBinaryTree.inorderTraversal();
		System.out.println();
		System.out.println("The size of tree is :"+ myBinaryTree.getSize());
		
		System.out.println("Is 25 present? : "+ myBinaryTree.search(65));
	}
}
