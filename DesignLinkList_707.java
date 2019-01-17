class MyLinkedList {

    private Node header;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        header = new Node(-1);
        header.next = null;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        int i = 0;
        Node tempNode = header.next;
        while (tempNode != null) {
            if (i == index) {
                return tempNode.value;
            }
            i++;
            tempNode = tempNode.next;
        }
        return -1;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = header.next;
        header.next = node;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node preTail = header;
        Node tail = header.next;
        while (tail != null) {
            preTail = tail;
            tail = tail.next;
        }
        
        Node node = new Node(val);
        preTail.next = node;
        node.next = null;
        
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        Node temp = header.next;
        if (temp == null && index != 0) {
            return;
        }
        
        int i = 0;
        int insertIndex = index - 1 < 0 ? 0 : index - 1;
        while(temp != null && insertIndex != i) {
            temp = temp.next;
            i++;
        }
        
        if (temp == null) {
            temp = header;
        } 

        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0) {
            return;
        }
        
        int deleteIndex = index - 1 < 0 ? 0 : index - 1;
        int startIndex = 0;
        Node temp = header.next;
        if (temp == null) {
            return;
        }
        
        while (temp != null && startIndex != deleteIndex) {
            temp = temp.next;
            startIndex++;
        }
        
        if (temp != null) {
            
            Node nextNode = temp.next;
            Node nextNextNode = null;
            if (temp.next != null) {
                nextNextNode = temp.next.next;
            }
            
            temp.next = nextNextNode;
            if (nextNode != null) {
                nextNode.next = null;
            }
            nextNode = null;
        }
    }
    
    private class Node {
        int value;
        Node next;
        
        public Node(int val) {
            value = val;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */