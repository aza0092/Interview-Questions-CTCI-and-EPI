// O(max(m,n)), O(max(m,n)+1) space
// if nodes do not have equal length, the addition will have a zero in one of the two nums
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) return null;
		ListNode result = new ListNode(0); // to make O(1) space, we could make this: ListNode cur = l1!=null?l1:(l2!=null?l2:(new ListNode(0)));
		ListNode l3 = result; // why create result and l3? we want to return the front of the list, and we want to keep track of the end of the list
		int carry = 0;
		
		while (l1 != null || l2 != null) { // we wanna add two nums in their same positions 
			int l1_val = (l1 != null)? l1.val : 0;
			int l2_val = (l2 != null)? l2.val : 0;
			
			int sum = l1_val + l2_val + carry;
			carry = sum / 10;
			int lastDigit = sum % 10;
			ListNode twoNumsResult = new ListNode(lastDigit);
			l3.next = twoNumsResult;
			
			if (l1 != null) l1 = l1.next;
			if (l2 != null) l2 = l2.next;
			l3 = l3.next;
		}
			if (carry == 1) { //carry can be either 0 or 1
				ListNode newNode = new ListNode(carry);
				l3.next = newNode;
				l3 = l3.next;				
			}
			return result.next; // (dot next) to skip the zero, meaning put head in right place, return dummy head's next node
		}
