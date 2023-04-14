public class MergeLinkedLists {
    
    static class Node {
        int val;
        Node next;
        
        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    
    public static Node mergeLists(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node tail = dummy;
        
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        
        tail.next = (l1 == null) ? l2 : l1;
        
        return dummy.next;
    }
    
    public static void main(String[] args) {
        Node l1 = new Node(1);
        l1.next = new Node(2);
        l1.next.next = new Node(4);
        
        Node l2 = new Node(1);
        l2.next = new Node(3);
        l2.next.next = new Node(4);
        
        Node merged = mergeLists(l1, l2);
        
        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
    }
}
