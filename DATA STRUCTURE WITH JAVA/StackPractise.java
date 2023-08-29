import java.util.Scanner;



public class StackPractise {
    int stack[], maxSize, tos, temp, i;

    void initStack(int size)
    {
        stack = new int[size];
        maxSize = size;
        tos = -1;
    }

    void push(int e)
    {
        tos++;
        e = stack[tos];
    }

    boolean isFull()
    {
        if (tos == maxSize)
            return true;
        else
            return false;
    }
    
    boolean isEmpty()
    {
        if (tos == -1)
            return true;
        else
            return false;
    }
    
    int pop()
    {
        temp = stack[tos];
        tos--;
        return (temp);
    }

    int atPeek()
    {
        return(stack[tos]);
    }

    void printStack()
    {
        for(i=tos; tos>-1;i--)
        {
            System.out.println(stack[i]);
        }
    }
    public static void main(String[] args) {
        int ch = 0;
        int e;
        StackPractise obj = new StackPractise();
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        obj.initStack(size);

        do {

            System.out.println("\n1.push\n2.pop\n3.peek\n4.print\n0.xit");
            ch = in.nextInt();

            switch(ch)
            {
                case 1:
                    if(obj.isEmpty()!=true)
                    {
                        System.out.println("Enter element ");
                        e = in.nextInt();
                        obj.push(e);
                        System.out.println("Pushed element " + e);
                    }
                    else {
                        System.out.println("Stack is empty");
                    }
                    break;

                case 2:
                    if(obj.isEmpty()!=true)
                    {
                        e = obj.pop();
                        System.out.println("Element poped " + e);
                    }
                    else {
                        System.out.println("stack is empty");
                    }
                    break;

                case 3:
                    if(obj.isEmpty()!=true)
                    {
                        e = obj.atPeek();
                        System.out.println("Elemnt @ PEEK "+e);
                    }
                    break;
                
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
