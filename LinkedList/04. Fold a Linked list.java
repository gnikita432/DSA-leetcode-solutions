// 143. Reorder List

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
    public void reorderList(ListNode head) {
        
        left = head;
        foldList(head);
        
    }
    
    public void foldList(ListNode right){
        
        if(right == null){
            return ;
        }
        
        foldList(right.next);
      
        if(left.next !=null){
            ListNode next = left.next;
            left.next = right;
            right.next = next;
            left = next;
        }

         if(left.next == right){
            left.next= null;
        }
        
       return;
    }
}
