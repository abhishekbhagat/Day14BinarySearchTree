package com.bridgelabz.problemday14;

public class MyBinaryNode<T> {
	T data;
	MyBinaryNode<T> left;
	MyBinaryNode<T> right;

	public MyBinaryNode(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public MyBinaryNode<T> getLeft() {
		return left;
	}

	public void setLeft(MyBinaryNode<T> left) {
		this.left = left;
	}

	public MyBinaryNode<T> getRight() {
		return right;
	}

	public void setRight(MyBinaryNode<T> right) {
		this.right = right;
	}

}
