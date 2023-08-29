import java.util.*;

class TwoStack
{
    int stack[],tos1,tos2,maxsize;

    void init(int size)
    {
        stack=new int[size];
        maxsize=size;
        tos1=-1;
        tos2=maxsize;
    }

    void push1(int e)
    {
        tos1++;
        stack[tos1]=e;
    }
    void push2(int e)
    {
        tos2--;
        stack[tos2]=e;
    }
    int pop1()
    {
       int temp=stack[tos1];
       tos1--;
       return temp;
    }
    int pop2()
    {
        int temp=stack[tos2];
        tos2++;
        return temp;
    }
    boolean isFull()
    {
        if(tos1==maxsize-1 || tos1==tos2-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean isEmpty1()
    {
        if(tos1==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean isEmpty2()
    {
        if(tos2==maxsize)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    int peek1()
    {
        return stack[tos1];
    }
    int peek2()
    {
        return stack[tos2];
    }
    void print()
    {
        System.out.println("elements of first stack ");
        if(!isEmpty1())
        {
        for(int i=tos1;i>-1;i--)
        {
            System.out.println(stack[i]);
        }
       }
       else
       {
        System.out.println("Stack 1 is empty");
       }
        System.out.println("elements of second stack ");
         if(!isEmpty2())
        {
        for(int i=tos2;i<maxsize;i++)
        {
            System.out.println(stack[i]);
        }
       }
       else
       {
        System.out.println("Stack 2 is empty");
       }

        

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        TwoStack obj = new TwoStack();
        int size, ch;
        System.out.println("Enter size of stack");
        size = sc.nextInt();
        obj.init(size);
        do {
            System.out.println("1. push1\n2. push2\n3. pop1\n4. pop2\n5.peek1\n6.peek2\n7. print\n0. Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    if (!obj.isFull()) {
                        System.out.print("Enter element");
                        int e = sc.nextInt();
                        obj.push1(e);
                    } else {
                        System.out.println("Stack is full");
                    }
                    break;
                case 2:
                    if (!obj.isFull()) {
                        System.out.print("Enter element");
                        int ele = sc.nextInt();
                        obj.push2(ele);
                    } else {
                        System.out.println("Stack is full");
                    }
                    break;

                case 3:
                    if (!obj.isEmpty1()) {
                        int ele = obj.pop1();
                        System.out.println("popped element is" + ele);
                    } else {
                        System.out.println("Stack 1 is empty");
                    }
                    break;

                case 4:
                    if (!obj.isEmpty2()) {
                        int ele = obj.pop2();
                        System.out.println("popped element is" + ele);
                    } else {
                        System.out.println("Stack 2 is empty");
                    }
                    break;

                case 5:
                    if (!obj.isEmpty1()) {
                        int ele = obj.peek1();
                        System.out.println("Element at peek pos of 1st stack is " + ele);
                    } else {
                        System.out.println("Stack 1 is empty");
                    }
                    break;

                case 6:
                    if (!obj.isEmpty2()) {
                        int ele = obj.peek2();
                        System.out.println("Element at peek pos of 2nd stack is " + ele);
                    } else {
                        System.out.println("Stack 2 is empty");
                    }
                    break;

                case 7:
                    obj.print();
                    break;
                case 0:
                    System.out.println("Exitting thanks for using code By Saurabh Sonawane");
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        } while (ch != 0);
        sc.close();
    }
}