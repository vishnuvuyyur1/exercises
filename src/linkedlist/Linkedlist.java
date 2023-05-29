package linkedlist;

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
