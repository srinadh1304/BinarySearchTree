package com.bridgelabz.binarysearchtree;

public class BinarySearchTreeMain {
	public static void main(String args[]) {
		System.out.println("******Welcome to Binary Search Tree Program **********");
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		
		System.out.println("Inorder traversal : ");
		myBinaryTree.inorderTraversal();
	}
}
