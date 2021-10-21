package java8Features;

class LinkedList { 
	  
    static Node head; 
  
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    public static void main(String[] args) 
    { 
    	LinkedList list = new LinkedList();
    	list.head = new Node(1);
    	list.head.next = new Node(2);
    	list.head.next.next = new Node(3);
    	list.head.next.next.next = new Node(4);
    	
    	Node res = list.reverseUtil(head, null); 
        System.out.println("Reversed linked list "); 
        list.printList(res); 
    }

	private void printList(Node node) {
		while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
	}

	private Node reverseUtil(Node curr, Node prev) {
		if(curr.next == null) {
			head = curr;
			curr.next = prev;
			return head;
		}
		Node next1 = curr.next;
		curr.next = prev;
		reverseUtil(next1,curr);
		return head; 
	} 
} 
  
