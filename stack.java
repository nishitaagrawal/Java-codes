package lab6;
import java.util.Scanner;
interface stackint {
    void push(int a);
    int pop();
}
class FixedStack implements stackint {
    int stk[];
    int top;
    FixedStack(int size) {
        stk=new int[size];
        top=-1;
    }
    public void push(int item)
    {
        if(top==stk.length-1) {
            System.out.print("Stack Overflow");
            int t[]=new int[stk.length *2];
            for(int i=0;i<stk.length;i++){
                t[i] = stk[i];
            }
            stk=t;
            stk[++top]=item;
        }
        else{
            stk[++top]=item;
        }
    }
    public int pop() {
        if(top<0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            return stk[top--];
        }
    }
}
class Growable_STK implements stackint {
    private int stk[];
    private int top;

    Growable_STK(int size) {
        stk = new int[size];
        top = -1;
    }
    public void push(int item) {
        if (top == stk.length - 1) {
            System.out.println("Stack Overflow.");
            int t[] = new int[stk.length + 2];
            for (int i = 0; i < stk.length; i++) {
                t[i] = stk[i];
            }
            stk = t;
            stk[++top] = item;
        } else{
            stk[++top] = item;
        }
    }
    @Override
    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow.");
            return 0;
        } else {
            return stk[top--];
        }
    }
}

public class stack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("****Fixed stack****");
        System.out.print("Enter the size of fixed stack : ");
        int n=sc.nextInt();
        FixedStack f = new FixedStack(n);
        System.out.println("Enter "+n+" elements : ");
        for (int i=0;i<n;i++) {
            System.out.print("Enter element "+i+" : ");
            int a=sc.nextInt();
            f.push(a);
        }
        System.out.println("Deleted elements from fixed stack are : ");
        for(int i=0;i<n;i++)
        {
            System.out.println("Deleted element : "+f.pop());
        }
       System.out.println("\n****************************************");
        System.out.println("Growable Stack:");
        System.out.println("Enter size of growable stack : ");
        int m=sc.nextInt();
        Growable_STK g=new Growable_STK(m);
        System.out.println("Enter "+m+" elements : ");
        for (int i=0;i<m;i++) {
            System.out.print("Enter element "+i+" : ");
            int b=sc.nextInt();
            g.push(b);
        }
        System.out.println("Enter additional  2 items : ");
        for (int i=0;i<2;i++) {
            System.out.print("Enter element "+i+" : ");
            int c=sc.nextInt();
            g.push(c);
        }
        System.out.println("Deleted elements from growable stack are : ");
        for(int i=0;i<m+2;i++)
        {
            System.out.println("Deleted element : "+g.pop());
        }
    }
}
