/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        
        ListNode p1 = null;
        ListNode p2 = null;
        
        ListNode q1 = null;
        ListNode q2 = null;
        
        if (l1.val > l2.val) {
            p1 = l1;
            p2 = l2;
        } else {
            p1 = l2;
            p2 = l1;
        }
        
        while(p1 != null) {
            while (p2 != null && p1 !=null) {
                if (p1.val >= p2.val) {
                    q2 = p2;
                    p2 = p2.next;
                    continue;
                }
                break;
            }
            
            if (p2 != null) {
                q1 = p1;
                p1 = p1.next;
                
                q2.next = q1;
                q1.next = p2;
                
                q2 = q1;
            } else {
                q2.next = p1;
                break;
            }

        }
        
        return l1.val > l2.val ? l2 : l1;
    }
}