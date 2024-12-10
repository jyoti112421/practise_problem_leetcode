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
    public ListNode partition(ListNode head, int x) {

        ListNode lessHead = new ListNode();
        ListNode greatHead= new ListNode();

        ListNode less=lessHead; // to traverse less LL
        ListNode great=greatHead;// to " great LL

        ListNode current=head; // to traverse original list
        while(current!=null){
            if(current.val<x){
                less.next=current;
                less=less.next;
              }
            else{ //current.val>=x
            great.next=current;
               great=great.next;
            }
            current=current.next;
            }


            great.next=null; // end the great LL;
            less.next=greatHead.next; // merge two LL
            return lessHead.next;

       
        
        
    }
}