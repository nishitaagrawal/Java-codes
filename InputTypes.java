package Lab1;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.DataInputStream;
public class InputTypes {
    public void fibb(int m){
        int f1=0,f2=1,f3;
        for(int i=0;i<m;i++) {
            f3 = f2 + f1;
            System.out.println(f3);
            f1 = f2;
            f2 = f3;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        InputTypes f=new InputTypes();
        int choice=0;
        System.out.println("MENU \nPress 1 to read input using Scanner class");
        System.out.println("Press 2 to read input using BufferedReader \nPress 3 to read input from DataInputStream");
        System.out.println("Press 4 to exit");
        while(choice!=4){
            System.out.println("Enter your choice : ");
            choice=sc.nextInt();
            switch(choice){
                case(1):System.out.println("Enter the value of n (Fibonacci series) : ");
                    int n1=sc.nextInt();
                    f.fibb(n1);
                    break;
                case(2): BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Enter the value of n (Fibonacci series : ");
                    int n2= 0;
                    try {
                        n2 = Integer.parseInt(b.readLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    f.fibb(n2);
                    break;
                case(3):DataInputStream d=new DataInputStream(System.in);
                    System.out.println("Enter the value of n (Fibbonacci series) : ");
                    String s=new String();
                    s=d.readLine();
                    int n3=Integer.parseInt(s);
                    f.fibb(n3);
                    break;
                case(4):break;
            }
        }
    }
}
