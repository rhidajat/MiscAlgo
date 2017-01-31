package com.rheezy.practice.bst;

public class Node {
	
	private Integer value;
	private Node rightChild;
	private Node leftChild;
	
	public Integer getValue() {
		return value;
	}
	
	public void setValue(Integer value) {
		this.value = value;
	}
	
	public Node getRightChild() {
		return rightChild;
	}
	
	public void setRightChild(Node rightChild) throws BinarySearchTreeIntegrityException {
		if (rightChild != null) {
			if (rightChild.getValue() == null || rightChild.getValue() < this.value) {
				throw new BinarySearchTreeIntegrityException();
			}
		}
		
		this.rightChild = rightChild;
	}
	
	public Node getLeftChild() {
		return leftChild;
	}
	
	public void setLeftChild(Node leftChild) throws BinarySearchTreeIntegrityException {
		if (leftChild != null) {
			if (leftChild.getValue() == null || leftChild.getValue() > this.value) {
				throw new BinarySearchTreeIntegrityException();
			}
		}
		
		this.leftChild = leftChild;
	}
}
