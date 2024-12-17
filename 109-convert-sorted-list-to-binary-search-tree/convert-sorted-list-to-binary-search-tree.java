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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode f(ArrayList<Integer>nums,int left,int right){
        if(left>right) return null;
        int mid= (left+right)/2;
        TreeNode node = new TreeNode (nums.get(mid));
        node.left = f(nums,left,mid-1);
        node.right = f(nums,mid+1,right);
        return node;
    }
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> nums = new ArrayList<>();
        ListNode cur = head;
        while(cur!=null){
            nums.add(cur.val);
            cur=cur.next;
        }
        if(nums.size()==0)return null;
        int n = nums.size();
        TreeNode start = f(nums,0,n-1);
        return start;
    }
}