package linkedlist;

import java.util.HashSet;

public class Linkedlist<E> implements ILinkedList<E> {
    int size;
    Node<E> head;
    Node<E> tail;
    public Linkedlist() {

    }

    public int size() {
        return size;
    }

    public boolean add(E e) {

        Node<E> newNode = new Node<>(e);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        return true;
    }
// removes top element from list
    public  Node<E> delete(Node<E> head)
    {
        if (head == null){
            System.out.println("List is empty, not possible to delete");
            return head;
        }
        System.out.println("Deleted: " + head.item);
        // move head to next node
        head = head.next;
        return head;
    }

    public void display() {
        Node<E> node = head;
        while (node != null) {
            System.out.println(node.item + ",");
            node = node.next;
        }
        System.out.println();

    }

    public void sort(){
        if(head.item instanceof Integer) {
            Node<E> current = head;
            Node<E> index = null;
            E temp;
            while (current != null) {
                index = current.next;
                while (index != null) {
                   if ((Integer) current.item > (Integer) index.item) {
                        temp = current.item;
                        current.item = index.item;
                        index.item = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public void removeDuplicateFromSortedList(){
        if(head.item instanceof Integer) {
            Node<E> current = head;
            Node<E> index = null;
            E temp;
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if(current.item == index.item){
                        current.next = index.next;
                        index=current.next;
                    } else{
                        index = index.next;
                    }
                }
                current = current.next;
            }
        }
    }

    /* Function to remove duplicates from a
      unsorted linked list */
    void removeDuplicate()
    {
        // Hash to store seen values
        HashSet<Integer> hs = new HashSet<>();

        /* Pick elements one by one */
        Node current = head;
        Node prev = null;
        while (current != null) {
            int curval = (int) current.item;

            // If current value is seen before
            if (hs.contains(curval)) {
                prev.next = current.next;
            }
            else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
    }

    // Returns true if there is a loop in linked
    // list else returns false.
     boolean detectLoop(Node<E> h)
    {
        HashSet<Node> s = new HashSet<>();
        while (h != null) {
            // If we have already has this node
            // in hashmap it means there is a cycle
            // (Because you we encountering the
            // node second time).
            if (s.contains(h))
                return true;

            // If we are seeing the node for
            // the first time, insert it in hash
            s.add(h);

            h = h.next;
        }

        return false;
    }

     static class Node<E> {
        E item;
        Node<E> next;
        Node(){

        }
        Node(E element) {
            this.item = element;
        }

    }

}
