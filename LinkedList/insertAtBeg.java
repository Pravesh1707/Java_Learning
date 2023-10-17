package LinkedList;
//import createLinkedList.java;
class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
	
}

public class insertAtBeg {
	Node head;
	public void insertAtBegg(int data) {
		Node n = new Node(data);
		
		if (head == null) {
			head = n;
		}
		else {
			n.next = head;
			head = n;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
