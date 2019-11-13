// append at the beginning of list
void append(int d) {
	Node start = new Node(d);
	start.next = head;
	head = start;
}

// append between two nodes
void append(int position, int d) {
	Node newNode = new Node(d);
	if (head == null) return newNode;
	
	Node current = this.head;
    Node previous = null;
    int i = 0;
    while (i < position) {
      previous = current;
      current = current.nextNode;
       i++;
      }
      newNode.nextNode = current;
      previous.nextNode = newNode;
}

	
// append to end of list
void append(int d) {
	Node end = new Node(d);
	Node n = this;
	while (n.next != null) {
		n = n.next;
	}
	n.next = end;
}
========================================================
/ * Doubly linked list */
//append at beginning
Node append(int d) {
	Node n = new Node(d);
	Node head = this.head;
	n.next = head;
	head.prev = n;
	n.prev = null;
	head = n; //update head
}

//append between two nodes
Node append(int d, int position) {
	Node newNode = new Node(d);
	int = 0;
	Node curr = this.head;
	while ( 1< position) {
		curr = curr.next;
	}
	Node storeCurrNextP = null;
	storeCurrNextP = curr.next;
	curr.next = newNode;
	newNode.prev = curr;
	newNode.next = storeCurrNextP;
	storeCurrNextP.prev = newNode;
}

//append at end
Node append(int d) {
	Node newNode = new Node(d);
	Node curr = this.head;
	while (curr.next != null) {
		curr = curr.next;
	}
	curr.next = newNode;
	newNode.prev = curr;
	newNode.next = null;
}
	