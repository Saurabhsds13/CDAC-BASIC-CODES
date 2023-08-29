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

public class StackLinkedList {
    Node tos;
    void initList(){       //initially tos is at null
        tos = null;
    }
    void push(int data){
        Node n = new Node(data);   // this line calls constructor of class Node and creates new node with reference n with data in it eg 20. and next is null 
        if(tos == null){  // if there is no node then this condition executes
            tos = n;      // assign tos to firstly created node 
        } 
        else{               //if there is allready 1 node is present 
            n.next = tos;   // connect next of newly created node to tos node which is already created by user
            tos = n;    // assign tos to newly inserted tos to left 
        } 

    }
    void pop(){
        if(tos == null){   //
            System.out.println("Empty Stack");
        }
        else{
         Node t = tos;    //assign new reference to tos   
         tos= tos.next;  //move tos to next node and t will automatically get deleted due to automatic garbage collection  
         System.out.println("Deleleted :"+ t.data);       
        }
    }    
   
    void search(int n){
        if(tos==null){
            System.out.println("Empty Stack cannot search");
        }
        else{
           Node t = tos;
           int c =0;
            while(t!= null){
                c++;
                if(t.data == n){
                    System.out.println(n+" Found at "+c+" position from tos");
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
        if(tos == null){
            System.out.println("Empty Stack");
        }
        else{
            Node t = tos;   // assign new reference to tos
            while(t!= null){    // check node is present or not
                System.out.print(t.data+ " ");  //print data of node 
                t=t.next;  //change t to next node
            }
            System.out.println();
        }
    }
    void peek(){
        if(tos==null){
            System.out.println("Empty Stack");
        }
        else{
            
            System.out.println("Peek element is:" + tos);
        }
    }

    public static void main(String[] args){
        StackLinkedList obj = new StackLinkedList();
        Scanner sc = new Scanner(System.in);
        int ch,n;
        obj.initList();

        do{
           System.out.println("1.Push\t2.Pop\t3.Print \t 4.Peek \t0.Exit ");
           System.out.println("Enter your choise");
           ch = sc.nextInt();

            switch(ch){
              case 1 : 
                     System.out.println("Enter Data in stack");
                      n = sc.nextInt();
                     obj.push(n); 
                     System.out.println("Element inserted");
                break;

              case 2: 
                  obj.pop();
                  System.out.println("Element deleted");
                break;
                
              case 3 :
                  obj.print();
                break;

              case 4 :
                    obj.peek();
                break;
                
              case 5 :
                 System.out.println("Enter element to search");
                 n = sc.nextInt();
                 obj.search(n);
              break;
               
              case 0 :
                 System.out.println("Exit");
                 break;
              default :
                System.out.println("Wrong choice");
                break;   
            }

        }while(ch!=0);
sc.close();
    }
}

