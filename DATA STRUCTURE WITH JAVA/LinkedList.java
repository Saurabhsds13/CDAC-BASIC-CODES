import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedList {

    Node root;

    void initList() {

        root = null;
    }

    void insertLeft(int data) {

        Node n = new Node(data);

        if (root == null) {
            root = n;
        } else {
            n.next = root;
            root = n;

        }
    }

    void deleteleft() {

        if (root == null) {
            System.out.println("Empty List.");
        } else {
            Node t = root;
            root = root.next;
            System.out.println("Element deleted " + t.data);
        }
    }

    void insertRight(int data) {
        Node n = new Node(data);

        if (root == null)
            root = n;
        else {
            Node t = root;
            while (t.next != null) {
                t = t.next;
            }
            t.next = n;

        }
    }

    void deleteRight() {
        if (root == null) {
            System.out.println("Empty List.");
        } else {
            Node t = root;
            Node t2 = root;
            while (t.next != null) {
                t2 = t;
                t = t.next;
            }
            t2.next = null;
            System.out.println("Deleted : " + t.data);

        }
    }

    void printList() {
        if (root == null) {
            System.out.println("Empty List.");
        } else {

            Node t = root;
            while (t != null) {
                System.out.print(t.data + " ");
                t = t.next;
            }
            System.out.println();
        }
    }
    
    void SearchList(int key) {
        if (root == null) {
            System.out.println("Empty List.");
        } else {

            Node t = root;
            int c = 0;
            while (t != null) {
                c++;
                if (t.data == key) {
                    System.out.println(key+ " Found at " +c+ " Position.");
                    break;
                }
                t = t.next;
            }

            if (t == null) {
                System.out.println(key+" Not Found");
            }
        }
    }

    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.initList();
        Scanner sc = new Scanner(System.in);
        int ch, n;

        do {
            System.out.println(
                    "Enter Choise : \n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print List\n6.Search\n0.Exit");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter Element at Left : ");
                    n = sc.nextInt();
                    obj.insertLeft(n);
                    System.out.println("Element Inserted : " + n);
                    break;
                case 2:
                    System.out.println("Enter Element at Right : ");
                    n = sc.nextInt();
                    obj.insertRight(n);
                    System.out.println("Element Inserted : " + n);

                    break;

                case 3:
                    obj.deleteleft();


break;
case 4:

    obj.deleteRight();


    break;
case 5:
    obj.printList();
    break;
case 6:
    System.out.println("Enter Element to Search : ");
    int key = sc.nextInt();
    obj.SearchList(key);
    
    break;

default:
                System.out.println("Invalid Choise");
                    break;
            }

        } while (ch != 0);
sc.close();
    }
}
