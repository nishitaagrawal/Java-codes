package lab2;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int j=0,k=0;
        System.out.println("Enter the value of n(no of elements in array) : ");
        int n=s.nextInt();
        int a[]=new int[n];
        int even[]=new int[n];
        int odd[]=new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0){
                even[j]=a[i];
                j++;
            }
            else if(a[i]%2!=0){
                odd[k]=a[i];
                k++;
            }
        }
        System.out.println("EVEN array elements are : ");
        if(j>1) {
            for (int i = 0; i < (j - 1); i++) {
                System.out.print(even[i] + ",");
            }
            System.out.print(even[j - 1]);
        }
        System.out.println("\nODD array elements are : ");
        if(k>1)
        {
            for(int i=0;i<(k-1);i++)
            {
                System.out.print(odd[i]+",");
            }
            System.out.print(odd[k-1]);
        }
    }

}
