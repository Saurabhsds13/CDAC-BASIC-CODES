import java.util.*;

public class CircularQueue {

    int q[], front, rear, MaxSize, ch, e;
    int count;

    void initQueue(int size) {
        MaxSize = size;
        front = 0;
        rear = -1;
        count = 0;
        q = new int[MaxSize];
    }

    void enqueue(int e) {
        rear = (rear + 1) % MaxSize;
        count++;
        q[rear] = e;

    }

    boolean isFull() {
        if (count == MaxSize)
            return true;
        else
            return false;
    }

    int dequeue() {
        front = (front + 1) % MaxSize;
        count--;
        return (front);
    }

    boolean isEmpty() {
        if (count == 0)
            return true;
        else
            return false;
    }

    void printqueue() {
        int c = 0,
                i = front;
        while (c < count) {
            System.out.print(q[i] + "\t");
            i = (i + 1) % MaxSize;
            c++;
        }
    }

    public static void main(String[] args) {
        CircularQueue obj = new CircularQueue();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of queue: ");
        int size = sc.nextInt();
        obj.initQueue(size);

        int e;
        int ch;
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
