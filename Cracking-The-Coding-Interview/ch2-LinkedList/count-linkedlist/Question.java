int count(Node head) {
	if (head == null) return 0;
	
	Node curr = head;
	int count = 1;
	while (curr.next != null) {
		curr = curr.next;
		count ++;
	}
	return count;
}