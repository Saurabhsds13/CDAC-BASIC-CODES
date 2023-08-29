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
public class QueueLinkedList {
    Node front , rear;

    void initList(){       //initially root is at null
        front = null;
        rear = null;
    }
  
    void deQueue(){
        if(front == null){   //
            System.out.println("Empty Queue");
        }
        else{
         Node t = front;    //assign new reference to root   
         front= front.next;  //move root to next node and t will automatically get deleted due to automatic garbage collection  
         System.out.println("Deleleted :"+ t.data);       
        }
    }    

    void enQueue(int data){  
       Node n = new Node(data);  // create new node with reference n 
        if(front == null){   // check wehter root is null or not if null then assign root to newly created node
            rear = front = n;  
        }
        else{
           rear.next = n;  // if linked list is already there then root is there so create cop of root reference in t 
           rear = n; //if found then join the newly created node to the null of last node  
        }
    }
    
    void print(){
        if(front == null){
            System.out.println("Empty queue");
        }
        else{
            Node t = front;   // assign new reference to root
            while(t!= null){    // check node is present or not
                System.out.print(t.data+ "--");  //print data of node 
                t=t.next;  //change t to next node
            }
            System.out.println("Null");
        }
    }

    public static void main(String[] args){
        QueueLinkedList obj = new QueueLinkedList();
        Scanner sc = new Scanner(System.in);
        int ch,n;
        obj.initList();

        do{
           System.out.println("1.enqueue\t2.dequeue\t3.Print \t0.Exit ");
           System.out.println("Enter your choise");
           ch = sc.nextInt();

            switch(ch){
              case 1 : 
                     System.out.println("Enter Data to left of list");
                      n = sc.nextInt();
                     obj.enQueue(n); 
                     System.out.println("Element inserted");
                break;

              case 2: 
              obj.deQueue();
              System.out.println("Element deleted");
                break;
                
              case 3 :
              obj.print();
                break;

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
