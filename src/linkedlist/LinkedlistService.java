package linkedlist;

public class LinkedlistService<E> {
    public LinkedlistService(){

    }

    public Linkedlist<E> sortTwoLists(Linkedlist<E> a, Linkedlist<E> b){
        Linkedlist<E> list = new Linkedlist<>();
        list.head = sortAndMerge(a.head,b.head);
        return list;
    }

    private Linkedlist.Node<E> sortAndMerge(Linkedlist.Node<E> nodeA, Linkedlist.Node<E> nodeB){
        Linkedlist.Node<E> result = new Linkedlist.Node<>();
        Linkedlist.Node<E> tail = result;
        while(true) {
            if(nodeA==null){
                tail.next=nodeB;
                break;
            }
            if(nodeB==null){
                tail.next = nodeA;
                break;
            }
            if ((Integer) nodeA.item <= (Integer) nodeB.item) {
                tail.next = nodeA;
                nodeA = nodeA.next;
            } else {
                tail.next = nodeB;
                nodeB = nodeB.next;
            }
            tail = tail.next;
        }
        return result.next;
    }
}
