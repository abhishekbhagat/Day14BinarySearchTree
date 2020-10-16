package com.bridgelabz.problemday14;

import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeTest {

	/**
	 * uc1
	 * 
	 */
	@Test
	public void givenNumberWhenAddedToBSTShouldReturnSize3() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		Assert.assertEquals(3, myBinaryTree.size());

	}

	/**
	 * uc2
	 */
	@Test
	public void givenNumberWhenAddedToBSTShouldReturnSize13() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(11);
		myBinaryTree.add(65);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		Assert.assertEquals(13, myBinaryTree.size());

	}

}
