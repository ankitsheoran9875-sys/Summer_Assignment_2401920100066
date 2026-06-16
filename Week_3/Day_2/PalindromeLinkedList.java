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

    public ListNode reverse(ListNode head){

        ListNode prev = null;
        ListNode curr = head;
        ListNode front = head;

        while(front != null){
        front = curr.next;
        curr.next = prev;
        prev = curr;
        curr = front;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
    ListNode mid = head, check1=head;
    ListNode temp = head;
    int size = 0;
    while(temp != null){
        temp = temp.next;
        size++;
    }
    if(size == 1) return true;

    for(int i=1; i<size/2; i++) mid = mid.next;
   
    if(size % 2 != 0) check1 = mid.next.next;
    else  check1 = mid.next;

    mid.next = null;
    ListNode check2 = reverse(head);
    
    while(check1 != null && check2 != null){
        if(check1.val != check2.val) return false;
        check1 = check1.next;
        check2 = check2.next;
    }
    if(check1 != null || check2 != null) return false;
    else return true;
    }
}
