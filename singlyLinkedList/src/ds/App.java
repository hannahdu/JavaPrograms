package ds;

import ds.singlylinkedlist.SinglyLinkedList;

/**
 * Created by nana1 on 7/11/2017.
 */
public class App {
    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertFirst(99);
        myList.insertFirst(88);
        myList.insertLast(99999);

        myList.displayList();


    }
}
