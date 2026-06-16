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
if(head.next == null) return null;
   ListNode Start = head;
   ListNode StartKth = head;
 for(int i=0; i<=n; i++){
   if(StartKth == null && i == n) 
     return head.next;
   StartKth = StartKth.next;
 }
while(StartKth != null){
    Start = Start.next;
    StartKth = StartKth.next;
}
    Start.next = Start.next.next;
    return head;
    }
}
