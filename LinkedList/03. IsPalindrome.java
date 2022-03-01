// 234. Palindrome Linked List

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
       ListNode left = null;
    
    public boolean isPalindrome(ListNode head) {
      left = head;
      return isp(head);
        
    }
    
 
    public boolean isp(ListNode node){
        
        if(node == null){
            return true;
        }
        
        boolean result = isp(node.next);
        if(result == false){
            return false;
        }
        
        if(node.val != left.val){
           return false;
        }
        left = left.next;
        return true;
    }
}
