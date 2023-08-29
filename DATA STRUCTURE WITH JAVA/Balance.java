import java.util.*;

public class Balance
{
    char stack[];
    int maxsize,tos;

    void init(int size)
    {
        stack=new char[size];
        maxsize=size;
        tos=-1;
    }
    void push(char c)
    {
        tos++;
        stack[tos]=c;
    }
    char pop()
    {
        char temp=stack[tos];
        tos--;
        return temp;
    }
    char peek()
    {
        return stack[tos];
    }
    boolean isFull()
    {
        if(tos==maxsize-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean isEmpty()
    {
        if(tos==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String args[])
    {
        Balance obj = new Balance(); // object creation
        Scanner sc = new Scanner(System.in); // scanner class
        System.out.println("Enter size of stack");
        int size = sc.nextInt(); // store size in size
        obj.init(size); 
        System.out.println("Enter the string");
        String str = sc.next();
        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!obj.isFull()) {
                if (str.charAt(i) == '{') {
                    obj.push(str.charAt(i));
                    cnt1++;
                }
            } else {
                System.out.println("Stack is full");
            }
            if (!obj.isEmpty()) {
                if (str.charAt(i) == '}') {
                    char ch = obj.pop();
                    System.out.println("popped element is" + ch);
                    cnt2++;
                }
            } else {
                System.out.println("Stack is empty");
                cnt2++;
            }
        }
        if (cnt1 == cnt2) {
            System.out.println("Balanced parenthesis");
        } else {
            if (cnt1 > cnt2) {
                System.out.println(" '}' expected");
            } else {
                System.out.println(" '}' unexpected");
            }
        }
        sc.close();
    }
    
}