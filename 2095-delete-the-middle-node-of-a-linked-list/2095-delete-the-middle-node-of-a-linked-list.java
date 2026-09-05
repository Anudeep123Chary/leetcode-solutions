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
    public ListNode deleteMiddle(ListNode head) {
        ListNode hare = head;
        ListNode turtle = head;
        if(hare.next == null) {
            return null;
        } 
        while(hare != null && hare.next != null) {
            hare = hare.next.next;
            if(hare == null || hare.next == null) {
                turtle.next = turtle.next.next;
                return head;
            }
            turtle = turtle.next;
        }
        return head;
    }
}