package com.bridgelabz.binarysearchtree;

public class MyBinaryTree<K extends Comparable> {
	private MyBinaryNode<K> root;
	
	
	public void inorderTraversal() {
		inorder(this.root);
	}
	public void inorder(MyBinaryNode<K> current) {
		if(current == null) return;
		inorder(current.right);
		System.out.print(current.key+" ");
		inorder(current.left);
	}
	
	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key){
		if(current == null) {
			return new MyBinaryNode<K>(key);
		}
		int compareResult = key.compareTo(current.key);
		if(compareResult == 0) return current;
		if(compareResult > 0) {
			current.left = addRecursively(current.left, key);
		}
		else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}

	public void add(K key) {
		this.root = this.addRecursively(root,key);
	}
	

}
