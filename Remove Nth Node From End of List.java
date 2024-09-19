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
        ListNode temp= head;
        int count= 0;
        while(temp != null){ 
            temp= temp.next;
            count++;
        }
        temp= head;

        if(count == 1){  
            return null;
        }
        if(count == n){ 
            head= head.next;
            return head;
        }

        int size= count - n;  
        for(int i=1; i< size; i++){  
            temp= temp.next;
        }
            temp.next= temp.next.next;  
        
        return head; 
    }
}
