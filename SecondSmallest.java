package lab2;

import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int s=arr[0];
        int sec_small=arr[0];
        for(int j=0;j<n;j++){
            for(int k=0;k<n;k++){
                s=arr[j];
                if(arr[j]>s){
                    s=arr[j];
                }
            }
        }
        for(int j=0;j<n;j++){
            for(int k=0;k<n;k++){
                if(arr[j]<s && arr[j]!=s){
                    sec_small=arr[j];
                }
            }
        }
        System.out.println("The second smallest element is : "+sec_small);
    }   
}
