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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        if(temp1 == null) return temp2;
        if(temp2 == null) return temp1;
        if(temp1.val > temp2.val){
            ListNode temp = temp1;
            temp1 = temp2;
            temp2 = temp;
        }
        ListNode res = temp1;
        while(temp1 !=null && temp2!=null){
            ListNode temp = null;
            while(temp1!=null && temp1.val <= temp2.val){
                temp = temp1;
                temp1 = temp1.next;
            }
            temp.next =temp2;
            // swap
            ListNode dummy = temp1;
            temp1 = temp2;
            temp2 = dummy;
        }
        return res;
    }
}