package Lab7;
/*
import java.util.Scanner;

class MyExcep extends Exception {
    String str;
    int n;
    MyExcep(int num,String s) {
        str=s;
        n=num;
    }
    public String toString() {
        return n+" "+str;
    }
}
class FactorialException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            for(int i=0;;i++){
                System.out.println("Enter a number : ");
                int a=sc.nextInt();
                factorial(a);
                break;
            }
        }
        catch (MyExcep e) {
            System.out.println("Exception Occurred: " +e);
        }
        catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Error occurred : Array index is out of bounds \nExiting....");

        }
        catch(NumberFormatException nf) {
            System.out.println("\nException occurred: Please Enter only Integer Values");
            sc.next();
        }
    }
    static void factorial(int num) throws MyExcep{
        if(num<0 || num>12) {
            throw new MyExcep(num,"is not in Range");
        }
        int num1=num;
        for(int i=1;i<num1;i++) {
            num=num*i;
        }
        System.out.println("Factorial of " +num1+ ": " +num);
    }
}*/

//package lab7;

import java.util.*;
class MyExcep extends Exception {
    String str;
    int n;
    MyExcep(int num,String s) {
        str=s;
        n=num;
    }
    public String toString() {
        return n+" "+str;
    }
}
public class exption {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException,InputMismatchException  {
        Scanner s= new Scanner(System.in);
        while(true){
            try {
                for(int i=0;;i++){
                    System.out.println("Enter a number : ");
                    int f=s.nextInt();
                    factorial(f);
                }
            }
            catch (MyExcep e) {
                System.out.println("Exception Occurred: " +e);
            }
            catch (ArrayIndexOutOfBoundsException a) {
                System.out.println("Error occurred : Array index is out of bounds \nExiting");
                System.exit(0);
            }
            catch(InputMismatchException nf) {
                System.out.println("\nException occurred: Please Enter only Integer Values");
                s.next();
            }
        }
    }
    static void factorial(int num) throws MyExcep{
        if(num<0 || num>12) {
            throw new MyExcep(num,"is not in Range");
        }
        int num1=num;
        for(int i=1;i<num1;i++) {
            num=num*i;
        }
        System.out.println("Factorial of " +num1+ " is:  " +num);
        System.exit(0);
    }
}
