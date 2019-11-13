/*
 reverse iteratively
 time: On 
 memory: O1
*/

public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    while (curr != null) {
        ListNode nextTemp = curr.next;  // save next
        curr.next = prev;              // reverse
        prev = curr;                  //  advance prev
        curr = nextTemp;              //  advance curr
    }
    return prev;                     // new head at end
}

/*
 reverse recursively
 time: On 
 memory: On
*/

public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode p = reverseList(head.next);
    head.next.next = head;
    head.next = null;
	/* fix the head pointer */
    return p;
}
=====================================================
//doubly linked list
// https://www.youtube.com/watch?v=uz6dimvl40Q

public Node(Node head) {
	Node curr = head;
	Node newHead = head;
	while (curr != null) {
		Node prev = curr.prev; 
		curr.prev = curr.next; //reverser arrows
		curr.next = prev;     // reverse arrows
		newHead = curr;
		curr = curr.prev; // move to next node
	}
	return newHead;
}
	

