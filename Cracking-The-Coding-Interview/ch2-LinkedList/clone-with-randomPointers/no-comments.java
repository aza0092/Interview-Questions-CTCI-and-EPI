class ConstantSpaceApproach {
  public RandomListNode copyRandomList(RandomListNode head) {

    RandomListNode curr = head;
    RandomListNode next = null;

    while (curr != null) {
      next = curr.next;

      RandomListNode copy = new RandomListNode(curr.label);
      curr.next = copy;

      copy.next = next;
      curr = next; 
    }

    curr = head;
    while (curr != null) {
      if (curr.random != null) { 
        curr.next.random = curr.random.next;
      }
      curr = curr.next.next;
    }

    curr = head;

    RandomListNode dummyHead = new RandomListNode(0);
    RandomListNode cloneListTail = dummyHead;
    RandomListNode copy = null;

    while (curr != null) {
      next = curr.next.next;
      copy = curr.next;
      cloneListTail.next = copy;
      cloneListTail = copy;
      curr.next = next;
      curr = next;
    }
    return dummyHead.next;
  }
}
