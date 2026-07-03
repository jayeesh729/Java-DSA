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
    public ListNode rotateRight(ListNode head, int k) {
        int len = 1;
        ListNode tail = head;
        if(head == null || k==0){
            return head;
        }
        while(tail.next !=null){
            len ++;
            tail =tail.next;
        }
        if( (k%len) == 0){
            return head;
        }
        k = k %len;
        int cnt = 1;
        ListNode temp = head; 
        tail.next = head;
        
        while(temp!=null){
            if(cnt == len -k){
                break;
            }
            cnt++;
            temp = temp.next;
        }
        
        head = temp.next;
        temp.next = null;
        return head;
    }
}