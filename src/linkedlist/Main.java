package linkedlist;
//Time Complexity: O(N + M), where N and M are the size of list1 and list2 respectively
public class Main {
    public static void main(String[] args) {
        Linkedlist<Integer> list = new Linkedlist<>();
        list.add(1);
        list.add(7);
        list.add(5);
        list.add(4);
        list.add(7);
        System.out.println(list.size());
        list.display();
        list.sort();

        list.removeDuplicate();
        list.display();
        Linkedlist<Integer> list2 = new Linkedlist<>();
        list2.add(3);
        list2.add(6);
        LinkedlistService<Integer> ser = new LinkedlistService<>();
        Linkedlist<Integer> result = ser.sortTwoLists(list,list2);
        result.display();
        Linkedlist<String> list3 = new Linkedlist<>();
        list3.add("hello");
        list3.add("aello");
        list3.add("bello");
        list3.display();
        list3.sort();
        list3.display();
    }
}
