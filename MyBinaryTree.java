package com.bridgelabz.problemday14;

public class MyBinaryTree<T extends Comparable<T>> {
	private MyBinaryNode<T> root;

	public void add(T data) {
		this.root = addRecursively(root, data);
	}

	public MyBinaryNode<T> addRecursively(MyBinaryNode<T> root, T data) {
		if (root == null)
			return new MyBinaryNode<T>(data);
		else if (root.getData().compareTo(data) > 0)
			root.left = addRecursively(root.left, data);
		else if (root.getData().compareTo(data) == 0)
			return root;
		else
			root.right = addRecursively(root.right, data);
		return root;
	}

	public int size() {
		return calculateSizeOfBinarySearchTree(root);
	}

	public int calculateSizeOfBinarySearchTree(MyBinaryNode<T> root) {
		if (root == null)
			return 0;
		else
			return 1 + calculateSizeOfBinarySearchTree(root.left) + calculateSizeOfBinarySearchTree(root.right);
	}
}
