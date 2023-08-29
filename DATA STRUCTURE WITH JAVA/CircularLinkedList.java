import java.util.Scanner;

// linearlinkedlist is class container and Node is class 
// here has a relation is used between 2 classes class Node and linearLinkedlist 
class Node { // user defined class / datatype
    int data;
    Node next; // user defined data type

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class CircularLinkedList {
    Node root, last;

    void initList() { // initially root is at null
        root = null;
        last = null;
    }

    void insertLeft(int data) {
        Node n = new Node(data); // this line calls constructor of class Node and creates new node with reference
                                 // n with data in it eg 20. and next is null
        if (root == null) { // if there is no node then this condition executes
            root = last = n;
            last.next = root; // assign root to firstly created node
        } else {
            // if there is allready 1 node is present
            n.next = root; // connect next of newly created node to root node which is already created by
                           // user
            root = n; // assign root to newly inserted root to left
            last.next = root;
        }
    }

    void deleteLeft() {
        if (root == null) { //
            System.out.println("Empty linked list");
        } else {
            Node t = root; // assign new reference to root
            if (root.next == root) {
                root = last = null;
            } else {
                root = root.next;
                last.next = root; // move root to next node and t will automatically get deleted due to automatic
                                  // garbage collection
            }
            System.out.println("Deleleted :" + t.data);
        }
    }

    void insertRight(int data) {
        Node n = new Node(data); // create new node with reference n
        if (root == null) { // check wehter root is null or not if null then assign root to newly created
                            // node
            root = last = n;
            last.next = root;
        } else {
            last.next = n;
            last = n;
            last.next = root;
        }
    }

    void deleteRight() {
        if (root == null) {
            System.out.println("Empty linked list");
        } else {
            Node t = root; // create 2 new reference to root t and t2
            Node t2 = root;
            if (root.next == root) {
                root = last = null;
            } else {
                while (t.next != root) { // or t!= last
                    t2 = t; // pass t2 behind the t . t tell t2 wether next node is empty or not if found
                            // then t2 will null the node at which he is present
                    t = t.next;
                }
                last = t2;
                last.next = root; // this will null the node
            }
            System.out.println("Deleted :" + t.data);
        }
    }
    // void search(int n){
    // if(root==null){
    // System.out.println("Empty list cannot search");
    // }
    // else{
    // Node t = root;
    // int c =0;
    // while(t!= null){
    // c++;
    // if(t.data == n){
    // System.out.println(n+" Found at "+c+" position from root");
    // break ;
    // }
    // t=t.next;
    // }
    // if(t== null){
    // System.out.println(n + " is Not found");
    // }
    // }
    // }

    void search(int n) {
        if (root == null) {
            System.out.println("Empty list cannot search");
        } else {
            Node t = root;
            int c = 0, cont = 0;
            do {
                c++;
                if (t.data == n) {
                    System.out.println(n + " Found at " + c + " position from root");
                    cont++;
                }
                t = t.next;
            } while (t != root);

            if (t == root && cont < 1) {
                System.out.println(n + " is Not found");
            }
        }
    }

    void print() {
        if (root == null) {
            System.out.println("Empty Linked list");
        } else {
            Node t = root;
            // assign new reference to root
            do { // check node is present or not
                System.out.print(t.data + "--"); // print data of node
                t = t.next; // change t to next node
            } while (t != root);
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        CircularLinkedList obj = new CircularLinkedList();
        Scanner sc = new Scanner(System.in);
        int ch, n;
        obj.initList();

        do {
            System.out.println(
                    "1.Insert Left\t2.Insert Right\t3.Delete Left\t4.Delete Right\t5.Print \t 6.Search \t0.Exit ");
            System.out.println("Enter your choise");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter Data to left of list");
                    n = sc.nextInt();
                    obj.insertLeft(n);
                    System.out.println("Element inserted" + n);
                    break;

                case 2:
                    System.out.println("Enter Data to right of list");
                    n = sc.nextInt();
                    obj.insertRight(n);
                    System.out.println("Element inserted" + n);
                    break;

                case 3:
                    obj.deleteLeft();
                    System.out.println("Element deleted");
                    break;

                case 4:
                    obj.deleteRight();
                    System.out.println("Element deleted");
                    break;

                case 5:
                    obj.print();
                    break;
                case 6:
                    System.out.println("Enter element to search");
                    n = sc.nextInt();
                    obj.search(n);
                    break;
                case 0:
                    System.out.println("Exiting....Thanks For Using Code By Saurabh Sonawane.");
                    break;
                default:
                    System.out.println("Invalid Input.");
                    break;
            }

        } while (ch != 0);
        sc.close();

    }
}
