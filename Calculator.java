package Lab1;

import java.util.Scanner;
public class Calculator {
    public static void add() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers(sum) : ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int res;
        res=n1+n2;
        System.out.println("The sum is : "+res);
    }
    public static void sub() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers(difference) : ");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int res1=m1-m2;
        System.out.println("The difference is : "+res1);
    }
    public static void mul() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers(product) : ");
        int n3=sc.nextInt();
        int n4=sc.nextInt();
        int r=n3*n4;
        System.out.println("The product is : "+r);
    }
    public static void div() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers(quotient) : ");
        int n5=sc.nextInt();
        int n6=sc.nextInt();
        try{
            int r=n5/n6;
            System.out.println("The quotient is : "+r);
        }
        catch (ArithmeticException e){
            System.out.println("Exception : Division by 0 not possible !!!");
        }

    }
    public static void sqrt() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number(sqrt) : ");
        double a=sc.nextDouble();
        double r=Math.sqrt(a);
        System.out.println("The square root is : "+r);
    }
    public static void pow(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number and the power: ");
        int l=sc.nextInt();
        int p1=sc.nextInt();
        double r1=Math.pow(l,p1);
        System.out.println("The power is : "+r1);
    }
    public static void mean(){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter value of n (to find mean) : ");
        int n=sc.nextInt();
        try{
            float sum=0;
            System.out.println("Enter the values(of array) : ");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                sum=sum+arr[i];
            }
            float m=sum/n;
            System.out.println("The mean is : "+m);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception (Array size max 10 only)");
        }
    }
    public static void var() {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10];
        System.out.println("Enter value of n (to find variance) : ");
        int b=sc.nextInt();
        int s=0;
        System.out.println("Enter the values (of array) : ");
        for(int i=0;i<b;i++)
        {
            ar[i]=sc.nextInt();
            s=s+ar[i];
        }
        float mean =s/b;
        double var=0;
        for(int i=0;i<b;i++) {
            var = var + Math.pow(ar[i] - mean, 2);
        }
        System.out.println("The variance is : "+var);

    }
    public static void gcd() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers (gcd) : ");
        int q1=sc.nextInt();
        int q2=sc.nextInt();
        double gcd=0;
        for(int i=1; i<=q1 && i<=q2;++i)
        {
            if(q1% i==0 && q2%i==0) {
                gcd = i;
            }
        }
        System.out.println("GCD of 2 nos is "+gcd);
    }
    public static void main(String[] args) {
        Calculator c=new Calculator();
        Scanner sc=new Scanner(System.in);
        double a;
        System.out.println("MENU");
        System.out.println("Press 1 for addition \nPress 2 for subtraction \nPress 3 for multiplication");
        System.out.println("Press 4 for division \nPress 5 for squareroot \nPress 6 for power");
        System.out.println("Press 7 for mean \nPress 8 for variance \nPress 9 to find GCD of 2 nos \nPress 10 to exit ");
        int res;
        int op=0;
        do
        {
            System.out.println("Enter your choice : ");
            op=sc.nextInt();
            switch(op)
            {
                case(1):c.add(); break;
                case(2):c.sub(); break;
                case(3):c.mul(); break;
                case(4):c.div(); break;
                case(5):c.sqrt(); break;
                case(6):c.pow();  break;
                case(7):c.mean(); break;
                case(8):c.var(); break;
                case(9):c.gcd(); break;
                case(10):break;
                default:  System.out.println("Invalid choice");
            }
        }while(op!=10);
    }
}
