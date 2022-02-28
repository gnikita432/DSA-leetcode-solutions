// 25. Reverse Nodes in k-Group

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
    
    ListNode th = null;
    ListNode tt = null;
    
    public ListNode reverseKGroup(ListNode head, int k) {
         ListNode oh = null;
    ListNode ot = null;
        
     if(head == null || head.next == null || k<=1){
         return head;
     }
        int length = size(head);
        ListNode curr = head;
        while(length>=k){
            
            int kcount = k;
            while(kcount-- > 0){
                ListNode forw = curr.next;
                curr.next = null;
                addFirst(curr);
                curr = forw;
            }
            
            if(oh == null){
                oh = th;
                ot = tt;
            }
            else{
                ot.next = th;
                ot = tt;
            }
            
            th = null;
            tt = null;
            
            length-=k;
            
        }
        
        ot.next = curr;
     
     return oh;
    }
    
   
   public void addFirst(ListNode node){
       if(th == null){
           th = node;
           tt = node;
       }
       else{
           node.next = th;
           th = node;
       }
   }
    
   public int size(ListNode head){
        ListNode pointer = head;
        int size = 0;
        while(pointer!=null){
            size++;
            pointer = pointer.next;
        }
        return size;
    }

}

// Time Complexity : O(N)
// Space Complexity : O(1)
