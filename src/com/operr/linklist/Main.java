package com.operr.linklist;

public class Main {
	
	public static void main(String args[]){
		// Main function to test singly link list
		LinkList ll = new LinkList();
		ll.append(5);
		ll.print();
		ll.removeTail();
		ll.print();
		
		ll.append(10);
		ll.removeAllGreater(10);
		ll.print();
		ll.removeAllGreater(5);
		ll.print();
		
		ll.append(5);
		ll.append(10);
		ll.append(15);
		ll.append(20);
		ll.print();
		ll.removeAllGreater(10);
		ll.print();
		ll.removeTail();
		ll.print();
		
		ll.append(10);
		ll.append(5);
		ll.append(20);
		ll.append(7);
		ll.append(50);
		ll.print();
		ll.removeAllGreater(10);
		ll.print();
		ll.removeTail();
		ll.print();
	}

}
