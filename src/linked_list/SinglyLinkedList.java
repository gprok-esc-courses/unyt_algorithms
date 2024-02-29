package linked_list;

public class SinglyLinkedList {
    private ListNode head;
    private ListNode tail;

    public SinglyLinkedList() {
        head = tail = null;
    }

    public ListNode insertFront(String name) {
        ListNode newNode = new ListNode(name);
        newNode.setNext(head);
        head = newNode;
        if(tail == null) {
            tail = newNode;
        }
        return newNode;
    }

    public ListNode insertBack(String name) {
        ListNode newNode = new ListNode(name);
        if(tail != null) {
            tail.setNext(newNode);
        }
        tail = newNode;
        if(head == null) {
            head = newNode;
        }
        return newNode;
    }

    public String removeFront() {
        if(head == null) {
            return "Empty List";
        }
        String name = head.getName();
        head = head.getNext();
        if(head == null) {
            tail = null;
        }
        return name;
    }

    public String removeBack() {
        if(tail == null) {
            return "Empty List";
        }
        String name = tail.getName();

        ListNode iter = head;
        if(iter == tail) {
            head = null;
            tail = null;
        }
        else {
            while (iter.getNext() != tail) {
                iter = iter.getNext();
            }
            iter.setNext(null);
            tail = iter;
        }

        return name;
    }

    public boolean contains(String name) {
        ListNode iter = head;
        while(iter != null) {
            if(iter.getName().equals(name)) {
                return true;
            }
            iter = iter.getNext();
        }
        return false;
    }

    public void removeAll() {
        while(head != null) {
            removeBack();
        }
    }

    public void traverse() {
        ListNode iter = head;
        while(iter != null) {
            System.out.println(iter);
            iter = iter.getNext();
        }
    }

    // NEED FUNCTIONS
    // insertAfter
    // remove
    // sort
}
