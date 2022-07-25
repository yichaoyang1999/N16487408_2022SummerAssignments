package solution;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Q141 {

	public boolean hasCycle(ListNode head) {
		Set<ListNode> traveledListNodes = new HashSet();
		
		ListNode tempListNode = head;
		while(tempListNode!=null) {
			if(!traveledListNodes.contains(tempListNode)) {
				traveledListNodes.add(tempListNode);
			}
			else {
				return true;
			}
			tempListNode = tempListNode.next;
		}
		
		return false;
	}

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

}
