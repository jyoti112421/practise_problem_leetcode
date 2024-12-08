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
        ListNode p2=head;
        ListNode p3=head;
        int len=0;
        while(p3!=null){
            len++;
            p3=p3.next;
        }
        int count=0;
        p3=head;
        while(len-count!=n && p3!=null){
            count++;
            p3=p3.next;
        }
        if(head.equals(p3)){
            return head.next;
        }
        while(!p3.equals(p2.next)){
            p2=p2.next;
        }
        p2.next=p3.next;
        return head;
    }
}