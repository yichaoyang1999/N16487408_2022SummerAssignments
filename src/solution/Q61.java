package solution;

public class Q61 {
	public ListNode rotateRight(ListNode head, int k) {
		int count = 1;
		ListNode temp = head;

		if (head == null) {
			return head;
		} else if (head.next == null || k == 0) {
			return head;
		} else {
			while (temp.next != null) {
				count += 1;
				temp = temp.next;
			}
			temp.next = head; // add edge

			k = count - k % count - 1;
			temp = head;
			for (int i = 0; i < k; i++) {
				temp = temp.next;
			}

			ListNode result = temp.next;
			temp.next = null; // remove edge

			return result;
		}
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

}
