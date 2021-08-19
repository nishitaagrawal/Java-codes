package Lab7;

import java.util.InputMismatchException;
import java.util.Scanner;

class RationalNumbers {
    int numerator, denominator;
    RationalNumbers(int num , int den)
    {
        this.numerator=num;
        this.denominator=den;
        reduce();
    }
    int calcGCD(int num,int den) {
        if(num % den==0) {
            return den;
        }
        return calcGCD(den,num%den);
    }
    void reduce() {
        int gcd=calcGCD(numerator,denominator);
        numerator=numerator/gcd;
        denominator=denominator/gcd;
    }
    RationalNumbers add(RationalNumbers fraction) {
        int newNum=(numerator * fraction.denominator) + (fraction.numerator*denominator);
        int newDen=(denominator * fraction.denominator);
        RationalNumbers res=new RationalNumbers(newNum,newDen);
        return res;
    }
    RationalNumbers subtract(RationalNumbers fraction) {
        int newNum=(numerator * fraction.denominator) - (fraction.numerator*denominator);
        int newDen=(denominator * fraction.denominator);
        RationalNumbers res=new RationalNumbers(newNum,newDen);
        return res;
    }
    RationalNumbers multiply(RationalNumbers fraction) {
        int newNum=(numerator * fraction.numerator);
        int newDen=(denominator * fraction.denominator);
        RationalNumbers res=new RationalNumbers(newNum,newDen);
        return res;
    }
    RationalNumbers divide(RationalNumbers fraction) {
        int newNum=(numerator * fraction.denominator);
        int newDen=(denominator * fraction.numerator);
        RationalNumbers res=new RationalNumbers(newNum,newDen);
        return res;
    }
    boolean compare() {
        if(this.numerator >0 && this.denominator >0) {
            return true;
        }
        else {
            return false;
        }
    }
    float floatingPoint() {
        float n1=this.numerator;
        float d1=this.denominator;
        return n1/d1;
    }
    public static void absolute(RationalNumbers fraction) {
        if (fraction.numerator<0) {
            System.out.println("Absolute value of " + fraction + " is : " + Math.abs(fraction.numerator) + " / " + fraction.denominator);
        }
        else
        {
            System.out.println("Absolute value of " + fraction + " is : " + fraction.numerator + " / " + Math.abs(fraction.denominator));
        }
    }
    public String toString() {
        return this.numerator+"/"+this.denominator;
    }
}
public class RationalException {
    public static void main(String[] args) throws ArithmeticException, InputMismatchException {
        Scanner sc=new Scanner(System.in);
        int n1=0,n2=0,d1=0,d2=0;
        while (true){
            try {
                System.out.print("Enter numerator of 1st no : ");
                n1=sc.nextInt();
                System.out.print("Enter the denominator of 1st no : ");
                d1= sc.nextInt();
                int div=n1/d1;
                break;
            }
            catch (InputMismatchException inp){
                System.out.println("Enter integer values for both numerator and denominator ");
                sc.next();
            }
            catch (ArithmeticException a) {
                System.out.println("Error : Denominator is 0 \n");
            }
        }
        while (true){
            try {
                System.out.print("Enter numerator of 2nd no : ");
                n2=sc.nextInt();
                System.out.print("Enter the denominator of 2nd no : ");
                d2= sc.nextInt();
                int div2=n2/d2;
                break;
            }
            catch (InputMismatchException i){
                System.out.println("Enter integer value for both numerator and denominator ");
                sc.next();
            }
            catch (ArithmeticException a){
                System.out.println("Error : Denominator is 0");
            }
        }
        RationalNumbers r1=new RationalNumbers(n1,d1);
        RationalNumbers r2=new RationalNumbers(n2,d2);
        RationalNumbers r3;
        System.out.println("MENU \nPress 1 to Add \nPress 2 to Subtract \nPress 3 to Multiply \nPress 4 to Divide \nPress 5 to Compare \nPress 6 to convert to floating point \nPress 7 to find absolute value \nPress 8 to exit");
        while (true) {
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    r3=r1.add(r2);
                    System.out.println("Result of addition of "+ r1 +" and "+ r2 + " is : "+ r3);
                    break;
                case 2:
                    r3=r1.subtract(r2);
                    System.out.println("Result of Subtraction of "+r1+" and "+r2+ " is : "+r3);
                    break;
                case 3:
                    r3=r1.multiply(r2);
                    System.out.println("Result of Multiplication of "+r1+" and "+r2+ " is : "+r3);
                    break;
                case 4:
                    r3=r1.divide(r2);
                    System.out.println("Result of Division of "+r1+" and "+r2+ " is : "+r3);
                    break;
                case 5:
                    r3=r1.subtract(r2);
                    boolean cmp= r3.compare();
                    if(cmp==true) {
                        System.out.println(r1+" is greater than "+r2);
                    }
                    else {
                        System.out.println(r2+ " is greater than "+r1);
                    }
                    break;
                case 6:
                    System.out.print(r1+ " = ");
                    System.out.format("%.2f",r1.floatingPoint());
                    System.out.println();
                    System.out.print(r2+ " = ");
                    System.out.format("%.2f",r2.floatingPoint());
                    System.out.println();
                    break;
                case 7:
                    RationalNumbers.absolute(r1);
                    RationalNumbers.absolute(r2);
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        }
    }
}
