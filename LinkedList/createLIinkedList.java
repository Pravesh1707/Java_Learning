package LinkedList;
//import LinkedList.insertAtBeg;

public class createLIinkedList {
	class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public Node head=null;
	public Node tail=null;
	public void addNode(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
			tail=n;
		}
		else {
			tail.next=n;
			tail=n;
		}
			
	}
	
	public void display() {
		Node temp=head;
		if(head==null) {
			System.out.println("Empity list");
		}
		while(temp!=null) {
			System.out.print(temp.data +"");
			temp=temp.next;
		}
		System.out.println();
	}
	
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
	
	public void deletAtSpeci(int data) {
		Node temp = head;
		while (temp.data != data){
			temp = temp.next;
		}
		temp.data = temp.next.data;
		temp.next = temp.next.next;
	}
	
	public void deletAtLast() {
		Node temp = head;
		while (temp.next.next != null){
			temp = temp.next;
		}
		temp.next = null;
	}
	
//	public void deletAtStart() {
//		Node temp = head;
//		temp.next = head;
//	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createLIinkedList ll=new createLIinkedList();
		//Creating LinkedList
		
		ll.addNode(1);
		ll.addNode(2);
		ll.addNode(3);
		ll.addNode(4);
		
		//Displaying LinkedList
		ll.display();
		
		//insertAtBegg
		ll.insertAtBegg(0);
		ll.display();
		
//		//deletAtSpeci
//		ll.deletAtSpeci(2);
//		ll.display();
//		
//		//deletAtLast
//		ll.deletAtLast();
//		ll.display();
//		
//		//deletAtStart
////		ll.deletAtStart();
//		ll.display();
	}
}
