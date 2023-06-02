package linkedlist.prac;

import java.util.HashSet;
import java.util.Set;

public class LinkdList {
    int size;
    Node head;

    void add(int value){
        Node newNode= new Node(value);
        if(head==null){
            head= newNode;
        }else{
            Node tail=head;
            while(tail.next!=null)
                tail=tail.next;
            tail.next=newNode;
        }
    }

    void remove(){
        if(head!=null){
            head = head.next;
        }
    }

    void display(){
        Node node=head;
        while(node!=null){
            System.out.println(node.value);
            node=node.next;
        }
        System.out.println();
    }

    void sort(){
        Node current = head;
        Node adjacent=null;
        while(current!=null){
            adjacent = current.next;
            while(adjacent!=null){
                if(current.value > adjacent.value){
                    int temp= current.value;
                    current.value = adjacent.value;
                    adjacent.value = temp;
                }
                adjacent = adjacent.next;
            }
            current=current.next;
        }
    }

    void removeDuplicaesFromSortedList(){
        Node current = head;
        Node adjacent = null;
        while(current!=null){
            adjacent = current.next;
            while(adjacent!=null){
                if(current.value==adjacent.value){
                    adjacent = adjacent.next;
                    current.next = adjacent;
                }else{
                    adjacent = adjacent.next;
                }
            }
            current=current.next;
        }
    }

    void removeDuplicatesFromUnsortedList(){
        Node current = head;
       Set<Integer> set = new HashSet<>();
        while(current!=null){
            set.add(current.value);
            current = current.next;
        }
        head =null;
        for(int i:set){
            add(i);
        }
    }

    boolean detectLoop(){
        Node node = head;
        Set<Node> s= new HashSet<>();
        while(node!=null){
            if(!s.contains(node)){
                s.add(node);
                node = node.next;
            }else{
                return true;
            }
        }
        return false;
    }

    void deleteLoop(){
        Node node = head;
        Set<Node> s= new HashSet<>();
        int counter=0;
        //1->2-3->2
        while(node!=null){
            if(!s.contains(node)){
                s.add(node);
                node = node.next;
                counter++;
            }else{
                Node tempNode = head;
                head =null;
                while(counter >=1){
                    add(tempNode.value);
                    tempNode = tempNode.next;
                    --counter;
                }
                break;
            }
        }
    }

    public static class Node{
        int value;
        Node next;
        Node(){

        }
        Node(int value){
            this.value = value;
        }
    }

    public static void main(String[] args){
        LinkdList ll = new LinkdList();
        ll.add(1);
        ll.add(3);
        ll.add(1);
        ll.add(4);
        ll.add(4);
        ll.display();
        ll.removeDuplicatesFromUnsortedList();
        ll.display();
        ll.add(9);
        ll.add(7);
        ll.sort();
        ll.display();
        ll.head.next.next.next.next.next = ll.head.next.next;
        System.out.println(ll.detectLoop());
        ll.deleteLoop();
        ll.display();
        System.out.println(ll.detectLoop());
        LinkdList a = new LinkdList();
        a.add(2);
        a.add(4);
        a.add(6);
        LinkdList b = new LinkdList();
        b.add(1);
        b.add(3);
        MereList m = new MereList();
        m.mergeTwoSortedLists(a,b);
    }

    public static class MereList{
        void mergeTwoSortedLists(LinkdList ll1, LinkdList ll2){
            Node a=ll1.head;
            Node b=ll2.head;
            LinkdList c = new LinkdList();
            Node result = new Node(0);
            Node tail = result;
            while(true){
                if(a==null){
                    tail.next = b;
                    break;
                }
                if(b==null){
                    tail.next =a;
                    break;
                }
                if(a.value<b.value){
                    tail.next = a;
                    //result = a;
                    a = a.next;
                }else{
                    tail.next = b;
                    //result = b;
                    b = b.next;
                }
                tail = tail.next;
            }
            c.head = result.next;
            c.display();
        }
    }
}
