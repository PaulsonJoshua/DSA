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
    public ListNode oddEvenList(ListNode head) {
        List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            even.add(temp.val);
            if(temp.next!=null){
            odd.add(temp.next.val);
            temp=temp.next.next;
            }
            else {
                temp=temp.next;
            }
        }
        temp=head;
        
        for(int i:even)
        {
            temp.val=i;
            temp=temp.next;
        }
        for(int i:odd)
        {
            temp.val=i;
            temp=temp.next;
        }
        return head;
    }
}