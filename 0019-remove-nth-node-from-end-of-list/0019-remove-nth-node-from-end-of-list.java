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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }

        int size = 0;
        ListNode curr = head;
        while(curr != null) {
            curr = curr.next;
            size++;
        }

        if(size == n){
            return head.next;
        }

        int searchIndex = size-n;
        ListNode current = head;
        int i = 1;
        while(i < searchIndex){
            current = current.next;
            i++;
        }

        current.next = current.next.next;
        return head;
    }
}