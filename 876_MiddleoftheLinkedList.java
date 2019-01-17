/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int size = getListSize(head);
        if (size <= 0 ) {
            return null;
        }
        
        int middleIndex = size % 2 == 0 ? size / 2 : (size - 1) / 2;
        
        int index = 0;
        ListNode node = head;
        while(node != null) {
            if (index == middleIndex) {
                return node;
            }
            index++;
            node = node.next;
        }
        
        return null;
    }
    
    private int getListSize(ListNode head) {
        if (head == null) {
            return 0;
        } 
        
        int size = 0;
        ListNode node = head;
        while(node != null) {
            size++;
            node = node.next;
        }
        
        return size;
    }
}