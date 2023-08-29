import java.util.*;

public class LinearQueueExa {

    int q[], front, rear, MaxSize, ch;

    void initQueue(int size) {
        MaxSize = size;
        front = 0;
        rear = -1;
        q = new int[MaxSize];
    }

    void enqueue(int e) {
        rear++;
        q[rear] = e;
    }

    boolean isFull() {
        if (rear == MaxSize - 1)
            return true;
        else
            return false;
    }

    int dequeue() {
        int temp;
        temp = q[front];
        front++;
        return (temp);
    }

    boolean isEmpty() {
        if (front > rear)
            return true;
        else
            return false;
    }

    void printqueue() {
        for (int i = front; i <= rear; i++) {
            System.out.print(q[i] + " ");

        }
    }

    public static void main(String[] args) {

        LinearQueueExa obj = new LinearQueueExa();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Queue : ");
        int size = sc.nextInt();
        obj.initQueue(size);// Creating stack
        int ch;
        int e;
        do {
            System.out.println("\n1.Enqueu\n2.Deque\n3.Print\n0.Exit : ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    if (obj.isFull() != true) {
                        System.out.println("Enter Element : ");
                        e = sc.nextInt();
                        obj.enqueue(e);
                        System.out.println("Element Inserted " + e);
                    } else {
                        System.out.println("Queue is full.");
                    }

                    break;
                case 2:
                    if (obj.isEmpty() != true) {
                        e = obj.dequeue();
                        System.out.println("Element removed : " + e);
                    } else {
                        System.out.println("Stack Empty.");
                    }
                    break;

                case 3:

                    if (obj.isEmpty() != true) {
                        System.out.println("Elements in Queue : ");
                        obj.printqueue();

                    } else {
                        System.out.println("Queue Empty");
                    }

                    break;
                case 0:
                    System.out.println("EXITING.... Thanks for using Code BY SAURABH SONAWANE.");
                    break;

                default:
                    System.out.println("Invalid Choise Plese Enter valid Number.");
                    break;
            }

        } while (ch != 0);
        sc.close();

    }
}
