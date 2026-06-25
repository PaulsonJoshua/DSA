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
        int count=0;
        if(head==null && head.next==null)
        {
            return head;
        }
        ListNode temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        temp=head;
        if(count==n)
        {
            head=head.next;
            return head;
        }
        int len=count-n;
        while(temp!=null)
        {
            len--;
            if(len==0){
                break;
            }
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
        

    }
}