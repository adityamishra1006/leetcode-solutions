class Solution {
    // Step 1: Create a deep copy of Linked List
    public Node deepCopy(Node head){
        Node head2 = new Node(head.val);
        Node t1 = head.next;
        Node t2 = head2;

        while(t1!=null){
            Node temp = new Node(t1.val);
            t2.next = temp;
            t2 = t2.next;
            t1 = t1.next;
        }
        return head2;
    }
    // Step 2: Connect alternately the original node and deep copy of the node
    public void alternetConnect(Node head, Node head2){
        Node t1 = head;
        Node t2 = head2;
        Node dummy = new Node(0);
        Node temp = dummy;

        while(t1!=null && t2!=null){
            temp.next = t1;
            t1 = t1.next;
            temp = temp.next;
            temp.next = t2;
            t2= t2.next;
            temp = temp.next;
        }
    }
    // Step 3: Assign the random node to the deep copy on original list
    public void assignRandom(Node head, Node head2){
        Node t1 = head;
        Node t2 = head2;

        while(t1!=null){
            t2 = t1.next;
            if(t1.random != null) t2.random = t1.random.next;
            t1 = t1.next.next;
        }
    }
    // Step 4: Split both the List from each other
    public void split(Node head, Node head2){
        Node t1  = head;
        Node t2 = head2;

        while(t1!=null){
            t1.next = t2.next;
            t1 = t1.next;
            if(t1==null) break;
            t2.next = t1.next;
            t2 = t2.next;
        }
    }
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        // Step 1: Create a deep copy of Linked List
        Node head2 = deepCopy(head);
        // Step 2: Connect alternately the original node and deep copy of the node  
        alternetConnect(head, head2);
        // Step 3: Assign the random node to the deep copy on original list
        assignRandom(head, head2);
        // Step 4: Split both the List from each other
        split(head, head2);

        return head2;
    }
}
