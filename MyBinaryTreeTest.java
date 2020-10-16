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
}
