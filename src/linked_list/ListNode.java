package linked_list;

public class ListNode {
    private String name;
    private ListNode next;

    public ListNode(String name) {
        this.name = name;
        this.next = null;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
