/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode first = head;
        ListNode second = head;

        for(int i=0; i<k-1; i++){
            fast = fast.next;
        }
        first = fast;
        while(fast.next !=null){
            fast = fast.next;
            slow = slow.next;
        }
        second = slow;
        // swap values 
        int temp = slow.val;
        slow.val = first.val;
        first.val = temp;
        return head;
    }
}