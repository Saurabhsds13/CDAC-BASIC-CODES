import java.util.*;


// TOS = Top Of Stack.

class Stack {
    int stack[], tos, maxSize, temp, i;

    void initStack(int size) {

        stack = new int[size];
        tos = -1;
        maxSize = size;
    }

    void push(int e) {
        tos++;// 1
        e = stack[tos]; // 2

    }

    boolean isFull() {
        if (tos == maxSize)
            return true;
        else
            return false;

    }

    boolean isEmpty() {
        if (tos == -1)
            return true;
        else
            return false;
    }

    int pop() {
        temp = stack[tos];
        tos--;
        return (temp);
    }

    int atpeek() {

        return (stack[tos]);
    }

    void printStack() {
        for (i = tos; i > -1; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        int ch = 0;
        int e;
        Stack obj = new Stack();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Size of Stack : ");
        int size = in.nextInt();
        obj.initStack(size);// Creating stack

        do {
            System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Print\n0.Exit : ");
            ch = in.nextInt();

            switch (ch) {
                case 1:
                    if (obj.isFull() != true) {
                        System.out.println("Enter Element : ");
                        e = in.nextInt();
                        obj.push(e);
                        System.out.println("Element Pushed " + e);
                    }

                    break;
                case 2:
                    if (obj.isEmpty() != true) {
                        e = obj.pop();
                        System.out.println("Element poped : " + e);
                    } else {
                        System.out.println("Stack Empty.");
                    }
                    break;

                case 3:
                    if (obj.isEmpty() != true) {
                        e = obj.atpeek();
                        System.out.println("Element @ Peek : " + e);
                    }
                case 4:

                    if (obj.isEmpty() != true) {
                        System.out.println("Elements in stack : ");
                        obj.printStack();

                    } else {
                        System.out.println("Stack Empty");
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
        in.close();
    }

}
