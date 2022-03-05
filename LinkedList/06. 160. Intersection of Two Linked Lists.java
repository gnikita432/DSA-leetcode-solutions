// 160. Intersection of Two Linked Lists

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       
        int asize = size(headA);
        int bsize = size(headB);
        
        int diff = Math.abs(asize - bsize);
        
        if(asize > bsize){
            for(int i = 0; i < diff ; i++){
                headA = headA.next;
            }
        }
        else{
             for(int i = 0; i < diff ; i++){
                headB = headB.next;
            }
        }
        
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
    
    public int size(ListNode head){
        int size = 0;
        while(head != null){
            size++;
            head = head.next;
        }
        return size ;
    }
    
}

// Time Complexity : o(n)
// Space Complexity : O(1) 
