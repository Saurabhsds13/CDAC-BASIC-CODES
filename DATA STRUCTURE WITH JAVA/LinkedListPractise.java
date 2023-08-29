import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}


public class LinkedListPractise {
    Node root;

    void initList()
    {
        root = null;
    }

    void insrtLeft(int data)
    {
        Node n = new Node(data);
        if (root == null) {
            root = n;
        } else {
            n.next = root;
            root = n;
        }
    }
    
    void deleteLeft()
    {
        if(root==null)
        {
            System.out.println("List is empty.");
        }
        else
        {
            Node t = root;
            while(t.next!=null)
            {
                
            }
        }
    }
    public static void main(String[] args) {
        
        LinkedListPractise obj = new LinkedListPractise();
        Scanner scan = new Scanner(System.in);
        int ch;
        obj.initList();

        do{
            System.out.println("/n1.Insert Left/n2.InsertRight/n3.DeleteLeft/n4.DeleteLeft");
            ch=scan.nextInt();

            switch(ch)
            {
                case 1://Insert left
                System.out.println("Enter Left element. ");

            }

        } while (ch != 0);
        scan.close();
}
}
