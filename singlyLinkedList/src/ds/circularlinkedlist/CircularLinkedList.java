package ds.circularlinkedlist;

/**
 * Created by nana1 on 7/11/2017.
 */
public class CircularLinkedList {

    private Node first;
    private Node last;

    public boolean isEmpty() {
        return first == null;
    }

    public CircularLinkedList() {
        first = null;
        last = null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node() ;
        newNode.data = data;

        if(isEmpty()) {
            last = newNode;
        }
        newNode.next = first; // newNode --> old first
        first = newNode; //newNode at first place
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    public int deleteFirst() {
        int temp = first.data;

        if(first.next == null) {
            last = null;
        }
        first = first.next; //first will point to old next value
        return temp;
    }

    public void displayList() {
        System.out.println("List(first--> last)");
        Node current = first;
        while(current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

}
