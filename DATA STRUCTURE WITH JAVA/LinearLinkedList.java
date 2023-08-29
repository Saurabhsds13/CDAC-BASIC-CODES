import java.util.Scanner;
 // linearlinkedlist is class container and Node is class 
 // here has a relation is used between 2 classes class Node and linearLinkedlist 
class Node{  // user defined class / datatype
    int data; 
    Node next ;  // user defined data type
    Node(int data){
       this.data= data;
       next = null;
    } 
}

public class LinearLinkedList {
    Node root;
    void initList(){
        root = null;
    }
    void insertLeft(int data){
        Node n = new Node(data);
        if(root == null){
            root = n;
        }
        else{
            n.next = root;
            root = n;
        } 
    }
    void deleteLeft(){
        if(root == null){
            System.out.println("Empty linked list");
        }
        else{
         Node t = root;
         root= root.next;
         System.out.println("Deleleted :"+ t.data);       
        }
    }    
    void insertRight(int data){
       Node n = new Node(data);
        if(root == null){
            root = n;
        }
        else{
            Node t = root;
            while(t.next != null){
               t= t.next;
            }
            t.next = n;
        }
    }
    void deleteRight(){
        if(root == null){
            System.out.println("Empty linked list");
        }
        else{
         Node t = root;
         Node t2 = root;
         while(t.next != null){
            t2=t;
           t= t.next;
         }  
         t2.next = null;
         System.out.println("Deleted :" + t.data);
        }
    }
    void search(int n){
        if(root==null){
            System.out.println("Empty list cannot search");
        }
        else{
           Node t = root;
           int c =0;
            while(t!= null){
                c++;
                if(t.data == n){
                    System.out.println(n+" Found at "+c+" position from root");
                    break ;
                }
               t=t.next;  
            }
            if(t== null){
               System.out.println(n + " is Not found");
            } 
        }
     }
    void print(){
        if(root == null){
            System.out.println("Empty Linked list");
        }
        else{
            Node t = root;
            while(t!= null){  
                System.out.print(t.data+ " ");
                t=t.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        LinearLinkedList obj = new LinearLinkedList();
        Scanner sc = new Scanner(System.in);
        int ch,n;
        obj.initList();

        do{
           System.out.println("1.Insert Left\t2.Insert Right\t3.Delete Left\t4.Delete Right\t5.Print \t 6.Search \t0.Exit ");
           System.out.println("Enter your choise");
           ch = sc.nextInt();

            switch(ch){
              case 1 : 
                     System.out.println("Enter Data to left of list");
                      n = sc.nextInt();
                     obj.insertLeft(n); 
                     System.out.println("Element inserted");
                break;

              case 2: 
                    System.out.println("Enter Data to right of list");
                    n = sc.nextInt();
                    obj.insertRight(n); 
                    System.out.println("Element inserted");
                break;
                
              case 3 :
                    obj.deleteLeft();
                    System.out.println("Element deleted");
                break;

              case 4 :
                    obj.deleteRight();
                    System.out.println("Element deleted");
                break;
                
              case 5 :
                    obj.print();
               break;  
                case 6 :
                  System.out.println("Enter element to search");
                  n = sc.nextInt();
                  obj.search(n);

              case 0 :
                 System.out.println("Exit");
                 break;
              default :
                System.out.println("Wrong choice");
                break;   
            }

        } while (ch != 0);
        sc.close();

    }
}
