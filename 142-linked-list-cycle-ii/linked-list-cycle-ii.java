/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // detect the loop 
        ListNode slow = head;
        ListNode fast = head;

        while(fast !=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }

        // no loop condition
        if(fast==null || fast.next == null){
            return null;
        }

        // looping again to get the node
        slow = head ;
        while( slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
        
    }
}