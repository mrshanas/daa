package data_structures.linked_lists;

public class Node {
    int data;
    Node next;

    Node(int value, Node n){
        data = value;
        next = n;
    }
}

class LinkedList {
    public static void main(String[] args) {
//        Node temp = new Node(3,null);
//        temp = new Node(17, temp);
//        temp = new Node(29,temp);
//        Node myList = new Node(22,temp);

        Node myList = new Node(23, new Node(34, new Node(89, new Node(90, null))));

        printFirstToLast(myList);
    }

    // traversing across the nodes
    static void printFirstToLast(Node list){

        while(list.next != null){
            System.out.println(list.data);
            list = list.next;
        }
    }
}