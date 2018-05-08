package medium;
//Two Pass
public class Remove_Nth_Node {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(0);
		ListNode first = head;
		dummy.next = first;
		int length = 0;
		while(first.next != null){
			length++;
			first = first.next;
		}
		
		length -= n;
		first = dummy;
		while(length > 0){
			length --;
			first = first.next;
		}
		first.next = first.next.next;
		return dummy.next;
		
    }
	public static void main(String[] args) {
		
	}

}
