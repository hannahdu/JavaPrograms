package ds.singlylinkedlist;

/**
 * Created by nana1 on 7/11/2017.
 */
public class SinglyLinkedList {
    private Node first;
    private Node last;

//    public SinglyLinkedList() {
//
//    }
// default constructor

    public boolean isEmpty() {
        return (first == null);
    }

    // used to insert at the beginning of the list
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public Node deleteFirst() {
        Node temp = first;
        first = first.next;
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

    // not efficient
    public void insertLast(int data) {
        Node current = first;
        while(current.next !=null) {
            current = current.next; // loop until null (end)
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }
}
