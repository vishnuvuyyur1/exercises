package linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LinkkdList {

    Node head;
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    void add(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
        }else{
            //1>2>3>4
            Node temp = head;
            while(temp.next!=null){
              temp = temp.next;
            }
            temp.next = node;
        }
    }
    //Time complexity o(n2)
    // space complexity o(1)
    void sort(){
        Node current = head;
        Node index;
        while(current!=null){
            index=current.next;
            while(index!=null){
                if(current.value>index.value){
                    int temp = current.value;
                    current.value = index.value;
                    index.value = temp;
                }
                index = index.next;
            }
            current=current.next;
        }
    }
    //To detect a cycle in a linked list, we can use the "fast and slow pointers" approach.
//Time complexity: O(n), where n is the number of nodes in the linked list.
// In the worst case, we need to traverse all the nodes to determine if there is a cycle or not.

    //Space complexity:O(1),
    // as we are using a constant amount of extra space for the two pointers slow and fast
    boolean hasCycle(){
        //1>2>3>1>2>3>1>2>3
        Node slow = head; //1
        Node fast = head; //1
        while(fast!=null && fast.next!=null ){
            slow = slow.next; // 2 3 1
            fast =  fast.next.next; //3 2  1
            if(slow == fast){
                return true;
            }

        }
       return false;
    }

    void deleteCycle(){
        if(head.next==null){
            System.out.println("No loop exists");
        }
        //1>2>1>2>1>2
        Node slow = head;// 2
        Node fast = head;// 1
        head = null;
        while(fast!=null && fast.next!=null){
            add(slow.value);
            slow =  slow.next; //1
            fast = fast.next.next; //1
            if(slow==fast){
                break;
            }
        }
    }
//Time complexity o(n) since in we traverse through all the nodes
    // space complexity o(n) since we created a data structure to hold values of nodes
    void removeDuplicates(){
        Node temp = head;
        head=null;
        Set<Integer> set = new HashSet<>();
        while(temp!=null){
            if(!set.contains(temp.value)){
                set.add(temp.value);
                add(temp.value);
            }
            temp=temp.next;
        }
    }

    void removeDuplicaesFromSortedList(){
        Node current = head;
        Node adjacent;
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
    void reverse(){
        Node temp = head;
        head = null;
        while(temp!=null){
            Node node = new Node(temp.value);
            node.next = head;
            head= node;
            temp =temp.next;
        }
    }


    void display(){
        Node temp = head;
        while(temp !=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println();
    }

    void removeFirst(){
        if(head==null){
            System.out.println("List is empty");
        }
        head = head.next;
    }
//Time complexity O(n+m) where n and m are the lengths of the input lists as both lists are traversed once.
    public Node mergeTwoLists(Node list1, Node list2) {
        Node resultNode = new Node(0); // space o(n) for result node creation
        Node temp = resultNode;
        //1>4 2>3
        while(true){
            if(list1 == null){
                temp.next = list2;
                break;
            }
            if(list2 == null){
                temp.next = list1;
                break;
            }
            if(list1.value<=list2.value){
                temp.next = list1; //0>1>4 4
                list1 = list1.next;
            }else{
                temp.next = list2; //1>4 1>2>3
                list2 = list2.next;
            }
            temp= temp.next;//
        }
        return resultNode.next;
    }

    public Node mergeNLists(Node[] lists) {
       Node result;
       if(lists.length == 1)
           return lists[0];
       if(lists.length == 2){
           return mergeTwoLists(lists[0],lists[1]);
       }else{
            result = mergeTwoLists(lists[0],lists[1]);
            for(int i=2;i<lists.length;i++){
              result =  mergeTwoLists(result,lists[i]);
            }
       }

       return result;
    }

    public static void main(String[] args){
        LinkkdList list = new LinkkdList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.head.next.next.next = list.head;
        System.out.println(list.hasCycle());
        list.deleteCycle();
        list.display();

        list.add(3);
        list.add(1);
        list.add(4);
        list.add(5);
        list.display();
        list.removeDuplicates();
        list.display();

        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(7);
        list.add(9);
        list.display();
        list.removeDuplicaesFromSortedList();
        list.display();
        list.reverse();
        list.display();
    }
}
