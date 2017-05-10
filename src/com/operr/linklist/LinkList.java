package com.operr.linklist;

public class LinkList {
	
	Node head;
	
	public void append(int data){
		
		//check if head is null
		if(head==null){
			head = new Node(data);
			return;
		}
		
		Node current = head;
		Node newNode = new Node(data);
		
		// traverse to last node
		while(current.getNext()!=null){
			current = current.getNext();
		}
		
		current.setNext(newNode);
	}
	
	public Node removeTail(){
		// check if head is null
		if(head==null) return null;
		
		// check if only one node exists
		if(head.getNext()==null) {
			Node temp = head;
			head = null;
			return temp;
		}
		
		Node current = head;
		Node previous = null;
		
		// traverse to last node
		while(current.getNext()!=null){
			previous = current;
			current = current.getNext();
		}
		
		// remove the last node
		Node tail = previous.getNext();
		previous.setNext(null);
		
		return tail;
	}
	
	public void removeAllGreater(int target){

		// remove all nodes from start which are greater than target
		while(head!=null && head.getData()>target){
			head = head.getNext();
		}
		
		// check if no node exists
		if(head==null) return;
		
		Node current = head;
		
		// check for next nodes and remove them if greater than target
		while(current.getNext()!=null){
			// if next's data is greater than target then set current.next = current.next.next
			// else set current = current.next
			if(current.getNext().getData()>target)
				current.setNext(current.getNext().getNext());
			else 
				current = current.getNext();
		}
	}
	
	public void print(){
		Node current = head;
		
		while(current!=null){
			System.out.print(current.getData() + " ");
			current = current.getNext();
		}
		System.out.println();
	}
}
